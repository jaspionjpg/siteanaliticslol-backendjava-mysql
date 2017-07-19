package br.com.analitics.business;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.analitics.model.Campeao;
import br.com.analitics.repository.CampeaoRepository;

@Service
@Transactional
public class CampeaoBusiness {
	@Autowired
	private CampeaoRepository campeaoRepository;
	
	public Campeao index(int idRito) {
		Campeao campeao = campeaoRepository.findByIdRito(idRito);
		System.out.println(campeao.getPassiva().getChave());
		return campeao;
	}
}
