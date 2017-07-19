package br.com.analitics.abstracts;

import java.io.Serializable;

/**
 * Classe abstrata das entidades da aplicação.
 * 
 * @author Thaís de Rezende Arruda
 * @since 20/07/2015 - 10:56
 */
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