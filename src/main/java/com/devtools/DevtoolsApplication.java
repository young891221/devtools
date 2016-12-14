package com.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DevtoolsApplication {

	public static void main(String[] args) {
		/*System.setProperty("spring.devtools.restart.enabled", "false");
		System.setProperty("spring.devtools.livereload.enabled", "true");*/
		SpringApplication.run(DevtoolsApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("test", "test");
		return "index";
	}
}
