package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public List<String> hello(){
        return Arrays.asList("hello","haha");
    }
    @GetMapping("/isPalindrome")
    public static List<Boolean> isPalindrome(List<String> inputList) {
        List<Boolean> result = new ArrayList<>();
        for (String input : inputList) {
            int length = input.length();
            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            result.add(isPalindrome);
        }
        return result;
    }
}