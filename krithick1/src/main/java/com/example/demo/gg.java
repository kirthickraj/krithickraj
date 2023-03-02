package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gg {
	@GetMapping("/hii")
	public String kuku() {
	String Name="Naveenkumar";
		return Name;
	}

}
