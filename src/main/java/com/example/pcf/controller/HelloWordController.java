package com.example.pcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services/pcf/v1/")
public class HelloWordController {

		
		@RequestMapping(value = "/sample", method = RequestMethod.GET)
		public ResponseEntity<String> getSampleResponse() {
			String response="hello world";
			return ResponseEntity.ok(response);
		}

		

}
