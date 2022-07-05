package com.sistema.cadastro;

import org.springframework.web.bind.annotation.GetMapping;

public class PrincipalController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
