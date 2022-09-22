package com.example.myController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
      
	@GetMapping("/myFirstApi")
	public String myFirstApi() {
	  return "wow !! This is my first api";
	}
}
