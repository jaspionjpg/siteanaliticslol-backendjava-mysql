package br.com.analitics.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.analitics.model.Campeao;
import br.com.analitics.repository.CampeaoRepository;
import br.com.analitics.vo.CampeaoListaVO;

@Service
@Transactional
public class CampeaoBusiness {
	@Autowired
	private CampeaoRepository campeaoRepository;
	
	public Campeao findByIdRito(int idRito) {
		Campeao campeao = campeaoRepository.findByIdRito(idRito);
		return campeao;
	}

	public List<CampeaoListaVO> findAllLista() {
		List<CampeaoListaVO> campeoes = campeaoRepository.findAllLista();
		return campeoes;
	}
}
