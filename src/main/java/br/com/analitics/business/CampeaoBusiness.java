package br.com.analitics.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.analitics.model.Campeao;
import br.com.analitics.repository.CampeaoRepository;

@Service
public class CampeaoBusiness {
	@Autowired
	private CampeaoRepository campeaoRepository;
	
	public Campeao index() {
		Campeao campeao = new Campeao();
		campeao.setAtaque(123);
		campeao.setChave("chavasedf");
		campeao.setDescricao("asdfasdfasdf");
		campeao.setId(123l);
		campeao.setIdRito(12333);
		campeao.setAtaque(123);
		campeao.setAtaque(123);
		campeao.setAtaque(123);
		
		return campeao;
	}
}
