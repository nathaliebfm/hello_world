package com.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/lista-bsm")
public class ListaBSMController {
	
	@GetMapping
	public String listaBSM() {
		
		return "Orientação ao Futuro, <br>Responsabilidade Pessoal, "
					+ "<br>Mentalidade de Crescimento, <br>Persistência, "
					+ "<br>Trabalho em Equipe, <br>Atenção aos Detalhes, <br>Proatividade e "
					+ "<br>Comunicação."; 
		}
		
	}
