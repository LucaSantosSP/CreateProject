package com.sistema.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	//@GetMapping("/cadastro")
	//public String cadastro() {
	//	return "cadastro";
	//}
}
