package br.com.analitics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.analitics.business.JogadorBusiness;

@Controller
@RestController
@RequestMapping("/jogador")
public class JogadorController {
	
	@Autowired
	private JogadorBusiness jogadorBusiness;
}
