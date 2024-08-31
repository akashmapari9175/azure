package com.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public String getMessage() {
		return "done working correct";
	}
	@PostMapping("/send")
	public String send(@RequestParam String name) {
		return "hello"+name+"thank you ";
	}
}
