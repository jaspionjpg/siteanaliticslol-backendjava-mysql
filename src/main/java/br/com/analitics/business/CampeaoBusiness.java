package br.com.analitics.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.analitics.model.Campeao;
import br.com.analitics.repository.CampeaoRepository;
import br.com.analitics.utils.exception.ResourceException;
import br.com.analitics.vo.CampeaoListaVO;

@Service
public class CampeaoBusiness {
	@Autowired
	private CampeaoRepository campeaoRepository;
	
	public Campeao findByIdRito(int idRito) {
		Campeao campeao = campeaoRepository.findByIdRito(idRito);
		if (campeao == null) {
        	throw new ResourceException(HttpStatus.NOT_FOUND, "Não existe campeão cadastrado com esse ID");
        }
//		Messager.getMessage("area.campanha.notification.erro.ao.buscar");
		return campeao;
	}

	public List<CampeaoListaVO> findAllLista() {
		List<CampeaoListaVO> campeoes = campeaoRepository.findAllLista();
		return campeoes;
	}
}
