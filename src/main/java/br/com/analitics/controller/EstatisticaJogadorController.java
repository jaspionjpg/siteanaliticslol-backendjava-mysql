package br.com.analitics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.analitics.business.EstatisticaJogadorBusiness;
import br.com.analitics.vo.jogador.JogadorResumoVO;

@Controller
@RestController
@RequestMapping("/estatistica")
public class EstatisticaJogadorController {
	
	@Autowired
	private EstatisticaJogadorBusiness estatisticaJogadorBusiness;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "jogador", method = RequestMethod.GET)
	public List<JogadorResumoVO> searchJogadores(@RequestParam(value="ordenacao", required=false, defaultValue="1") Integer ordenacao) {
		return estatisticaJogadorBusiness.searchJogadores(ordenacao);
	}
}
