package br.com.analitics.model;

import java.util.Date;

public class TransacaoJogador {
	Long id;
	
	Jogador jogador;
	Time time;
	String status;
	
	Date dataComeço;
	Date dataFim;
}
