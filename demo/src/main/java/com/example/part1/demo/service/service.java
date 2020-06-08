package com.example.part1.demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class service {
@GetMapping("/")
public String init(Model model)
{
	 final String uri = "http://localhost:8081/message";

	    RestTemplate restTemplate = new RestTemplate();
	    json result = restTemplate.getForObject(uri, json.class);
	    System.out.println(result.getMessageCode());
	    model.addAttribute("code",result.getMessageCode());
	    model.addAttribute("desc",result.getMessageDesc());
	return "ui";
}

}
