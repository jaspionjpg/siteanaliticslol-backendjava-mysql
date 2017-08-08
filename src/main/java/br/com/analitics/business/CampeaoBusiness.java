package br.com.analitics.business;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.analitics.model.Campeao;
import br.com.analitics.repository.CampeaoRepository;
import br.com.analitics.utils.exception.ResourceException;
import br.com.analitics.vo.campeao.CampeaoListaVO;
import br.com.analitics.vo.campeao.CampeaoResumoVO;

@Service
public class CampeaoBusiness {
	@Autowired
	private CampeaoRepository campeaoRepository;
	
	@Autowired
	private EstatisticaJogadorBusiness estatisticaJogadorBusiness;
	
	public Campeao findByIdRito(int idRito) {
		Campeao campeao = null;
		
		try {
			campeao = campeaoRepository.findByIdRito(idRito);
		
		} catch(NoResultException e) {
			throw new ResourceException(HttpStatus.NOT_FOUND, "Não existe campeão cadastrado com esse ID");
		} catch(Exception e) {
			throw new ResourceException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro");
		}
		
		return campeao;
	}
	
	public CampeaoResumoVO findResumoByIdRito(int idRito) {
		CampeaoResumoVO campeao = null;
		
		try {
			campeao = campeaoRepository.findResumoByIdRito(idRito);
		
		} catch(NoResultException e) {
			throw new ResourceException(HttpStatus.NOT_FOUND, "Não existe campeão cadastrado com esse ID");
		} catch(Exception e) {
			throw new ResourceException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro: "+ e);
		}
		
		campeao.setJogadoresCampeao(estatisticaJogadorBusiness.findJogadoresDestaqueByIdRito(idRito));
		
		return campeao;
	}

	public List<CampeaoListaVO> findAllLista() {
		List<CampeaoListaVO> campeoes = null;
		try {
			campeoes = campeaoRepository.findAllLista();
		
		} catch(Exception e) {
			throw new ResourceException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro");
		}
		
		return campeoes;
	}
}
