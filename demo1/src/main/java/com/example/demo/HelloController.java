package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
 class HelloWorldController {

   @GetMapping("/hello-world")
   public String helloWorld() {
       return "Hello, World!";
   }
}
