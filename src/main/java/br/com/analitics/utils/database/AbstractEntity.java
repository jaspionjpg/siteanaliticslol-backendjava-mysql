package br.com.analitics.utils.database;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean equals(final Object other) {
		return EntityAnalyzer.equalsAnalyzer(this, other);
	}

	@Override
	public int hashCode() {
		return EntityAnalyzer.hashCodeAnalyzer(this);
	}

	@Override
	public abstract String toString();

}