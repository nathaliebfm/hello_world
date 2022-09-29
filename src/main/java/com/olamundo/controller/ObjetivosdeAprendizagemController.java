package com.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosdeAprendizagemController {
	
	@GetMapping
	public String objetivosAprendizagem() {
		
		return "<br><li>Aprender novos comandos do Spring, <br> <li>Aprender novas técnicas a serem aplicadas do"
				+ "Projeto Integrador e Blog Pessoal, <br><li>Gerenciar melhor o meu tempo para conseguir fazer os cursos"
				+ "extras de novas linguagens de programação.";
		
	}

}
