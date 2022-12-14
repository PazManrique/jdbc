package com.domain.controller;




import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
	
	@RequestMapping("/home")
	public String goIndex() {
		return "Index";
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		return "Presentacion";
	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		ArrayList<String> alumnos = new ArrayList<String>();

		alumnos.add("Juan");
		alumnos.add("Pedro");
		alumnos.add("José");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("akumnos", alumnos);

		return "Listado";
	}

}
