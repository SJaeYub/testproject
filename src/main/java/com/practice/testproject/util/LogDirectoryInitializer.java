package com.practice.testproject.util;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class LogDirectoryInitializer {

    private static final Logger logger = LoggerFactory.getLogger(LogDirectoryInitializer.class);

//    @Value("${logging.file.path}")
//    private String logPath;
//
//    @PostConstruct
//    public void init() {
//        createLogDirectory();
//    }
//
//    private void createLogDirectory() {
//        File directory = new File(logPath);
//        if (!directory.exists()) {
//            boolean created = directory.mkdirs();
//            if (created) {
//                logger.info("Log directory created: {}", logPath);
//            } else {
//                logger.error("Failed to create log directory: {}", logPath);
//            }
//        } else {
//            logger.info("Log directory already exists: {}", logPath);
//        }
//    }
}