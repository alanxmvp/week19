package com.example.week19.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
  @GetMapping(value = "/")
  public String test() {
    return "message\123";
  }
}