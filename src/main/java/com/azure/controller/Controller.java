package com.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public String getMessage() {
		return "done working correct";
	}
}
