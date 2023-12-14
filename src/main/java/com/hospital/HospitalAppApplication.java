package com.hospital;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication {
	 private static final Logger logger = LogManager.getLogger(HospitalAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HospitalAppApplication.class, args);
		logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.fatal("This is a FATAL message");
       
	}
}
