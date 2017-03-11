package com.okode.sri.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okode.sri.service.DateService;

@RestController
@RequestMapping("/date")
public class DateController {

    private static final Logger log = LoggerFactory.getLogger(DateController.class);
    
    private DateService dateService;
    
    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }
    
    @GetMapping("/now")
    public long now() {
        log.info("Processing request for 'now' controller");
        return dateService.now();
    }
    
}
