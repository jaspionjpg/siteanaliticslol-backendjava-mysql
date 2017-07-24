package br.com.analitics.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

public final class EntityAnalyzer {

	private EntityAnalyzer() {
		// this prevents even the native class from calling this actor as well
		throw new AssertionError();
	}
	
	public static int hashCodeAnalyzer(final Object object) {
		int hash = 0;
		if (object != null) {
			final List<Field> fields = getRecursiveDeclaredFields(object.getClass());
			for (final Field field : fields) {
				if (field.getAnnotation(Transient.class) == null && (field.getAnnotation(Column.class) != null && field.getAnnotation(Id.class) != null)) {
					final Object value = getFieldValue(object, field);
					if (value != null) {
						hash += value.hashCode();
					}
					break;
				}
			}
		}
		return hash;
	}

	public static boolean equalsAnalyzer(final Object object, final Object other) {
		boolean equals = true;
		if (object != null && other == null) {
			equals = false;
		} else if (object == null && other != null) {
			equals = false;
		} else if (object != null && other != null) {
			// Same memory reference
			if (object != other) {
				// Same instance class
				if (!object.getClass().isInstance(other)) {
					equals = false;
				} else {
					final List<Field> fields = getRecursiveDeclaredFields(object.getClass());
					for (final Field field : fields) {
						if (field.getAnnotation(Transient.class) == null && (field.getAnnotation(Column.class) != null && field.getAnnotation(Id.class) != null)) {
							final Object value = getFieldValue(object, field);
							final Object otherValue = getFieldValue(other, field);
							if (value == null && otherValue != null) {
								equals = false;
								break;
							} else if (value != null && otherValue == null) {
								equals = false;
								break;
							} else if (value != null && otherValue != null) {
								if (!value.equals(otherValue)) {
									equals = false;
									break;
								}
							}
						}
					}
				}
			}
		}
		return equals;
	}
	
	public static List<Field> getRecursiveDeclaredFields(final Class<?> clazz) {
		final List<Field> fields = new ArrayList<Field>();
		if (clazz != null) {
			final Field[] arrayFields = clazz.getDeclaredFields();
			for (final Field field : arrayFields) {
				fields.add(field);
			}
			fields.addAll(getRecursiveDeclaredFields(clazz.getSuperclass()));
		}
		return fields;
	}
	
	private static Object getFieldValue(final Object object, final Field field) {
		Object value = null;
		final Method getMethod = retrieveGetMethodFromField(object, field);
		if (getMethod != null) {
			try {
				value = getMethod.invoke(object);
			} catch (final IllegalAccessException e) {
				System.out.println("Deu erro no EntityAnalizer: " + e);
			} catch (final IllegalArgumentException e) {
				System.out.println("Deu erro no EntityAnalizer: " + e);
			} catch (final InvocationTargetException e) {
				System.out.println("Deu erro no EntityAnalizer: " + e);
			}
		}
		return value;
	}
	
	private static Method retrieveGetMethodFromField(final Object object, final Field field) {
		Method method = null;
		if (object != null && field != null) {
			final String fieldName = field.getName();
			try {
				method = object.getClass().getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
			} catch (final NoSuchMethodException e) {
				System.out.println("Deu erro no EntityAnalizer: " + e);
			} catch (final SecurityException e) {
				System.out.println("Deu erro no EntityAnalizer: " + e);
			}
		}
		return method;
	}
}
