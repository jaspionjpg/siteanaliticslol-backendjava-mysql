package br.com.analitics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.analitics.business.CampeaoBusiness;
import br.com.analitics.model.Campeao;

@Controller
@RequestMapping("/campeao")
public class CampeaoController {
	
	@Autowired
	private CampeaoBusiness campeaoBusiness;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Campeao getAll(@PathVariable("id") int idRito) {
		return campeaoBusiness.index(idRito);
	}

}
