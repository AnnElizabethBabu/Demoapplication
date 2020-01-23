package com.example.DemoAPP.DemoApplication.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public List<String> showData() {

		return Arrays.asList("AA", "BB", "testing");
	}
}
