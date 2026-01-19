package com.cts.studentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/m10")
	public String m1() {
		return "hello";
	}
}
