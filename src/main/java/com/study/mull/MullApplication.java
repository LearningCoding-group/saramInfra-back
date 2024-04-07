package com.study.mull;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@EnableEncryptableProperties
@ConfigurationPropertiesScan
@SpringBootApplication
public class MullApplication {

	public static void main(String[] args) {
		SpringApplication.run(MullApplication.class, args);
	}

}
