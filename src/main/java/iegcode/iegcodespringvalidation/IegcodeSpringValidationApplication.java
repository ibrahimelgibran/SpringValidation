package iegcode.iegcodespringvalidation;

import iegcode.iegcodespringvalidation.properties.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})

@SpringBootApplication
public class IegcodeSpringValidationApplication {
	public static void main(String[] args) {
		SpringApplication.run(IegcodeSpringValidationApplication.class, args);
	}

}
