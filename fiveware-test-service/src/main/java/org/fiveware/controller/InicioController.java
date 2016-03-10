package org.fiveware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class InicioController {
	
	@RequestMapping("/formulario")
	public ModelAndView formulario() {
		String mensagem = "Bem-vindo";
		
		return new ModelAndView("/formulario","form", mensagem);
	}
}
