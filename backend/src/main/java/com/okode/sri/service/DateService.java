package com.okode.sri.service;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.okode.sri.controller.DateController;

@Service
public class DateService {

    private static final Logger log = LoggerFactory.getLogger(DateController.class);
    
    public long now() {
        log.info("Processing request for 'now' service");
        return Instant.now().toEpochMilli();
    }
    
}
