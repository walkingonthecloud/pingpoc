package com.pilogix.pingpoc.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Slf4j
public class PingPocController {

    @RequestMapping(value = "/api/sayHello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from Auth Server");
    }


}
