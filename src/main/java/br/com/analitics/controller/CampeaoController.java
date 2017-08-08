package br.com.analitics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.analitics.business.CampeaoBusiness;
import br.com.analitics.model.Campeao;
import br.com.analitics.vo.campeao.CampeaoListaVO;
import br.com.analitics.vo.campeao.CampeaoResumoVO;

@Controller
@RestController
@RequestMapping("/campeao")
public class CampeaoController {
	
	@Autowired
	private CampeaoBusiness campeaoBusiness;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Campeao findByIdRito(@PathVariable("id") int idRito){
        return campeaoBusiness.findByIdRito(idRito);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "resumo/{id}", method = RequestMethod.GET)
	public CampeaoResumoVO findAllLista(@PathVariable("id") int idRito) {
		return campeaoBusiness.findResumoByIdRito(idRito);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "lista", method = RequestMethod.GET)
	public List<CampeaoListaVO> findAllLista() {
		return campeaoBusiness.findAllLista();
	}
}
