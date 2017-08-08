package br.com.analitics.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.analitics.repository.EstatisticaJogadorRepository;
import br.com.analitics.utils.exception.ResourceException;
import br.com.analitics.vo.jogador.JogadorResumoCampeaoVO;
import br.com.analitics.vo.jogador.JogadorResumoVO;

@Service
public class EstatisticaJogadorBusiness {
	@Autowired
	private EstatisticaJogadorRepository estatisticaJogadorRepository;

	public List<JogadorResumoCampeaoVO> findJogadoresDestaqueByIdRito(int idRito) {
		List<JogadorResumoCampeaoVO> jogadores = null;
		try {
			jogadores = estatisticaJogadorRepository.findJogadoresDestaqueByIdRito(idRito);
		
		} catch(Exception e) {
			throw new ResourceException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro: "+ e);
		}
		
		return jogadores;
	}

	public List<JogadorResumoVO> searchJogadores(Integer ordenacao) {
		List<JogadorResumoVO> jogadores = null;
		try {
			jogadores = estatisticaJogadorRepository.searchJogadores(ordenacao);
		
		} catch(Exception e) {
			throw new ResourceException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro: "+ e);
		}
		
		return jogadores;
	}
}
