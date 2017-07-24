package br.com.analitics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.analitics.business.CampeaoBusiness;
import br.com.analitics.model.Campeao;
import br.com.analitics.vo.CampeaoListaVO;

@Controller
@RequestMapping("/campeao")
public class CampeaoController {
	
	@Autowired
	private CampeaoBusiness campeaoBusiness;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Campeao findByIdRito(@PathVariable("id") int idRito){
        return campeaoBusiness.findByIdRito(idRito);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "lista", method = RequestMethod.GET)
	public @ResponseBody List<CampeaoListaVO> findAllLista() {
		return campeaoBusiness.findAllLista();
	}

}
