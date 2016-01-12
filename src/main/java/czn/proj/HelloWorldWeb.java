package czn.proj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldWeb {

	private static final Logger logger = LogManager.getLogger(HelloWorldWeb.class);

	@RequestMapping("/")
	public String home() {
		logger.info("Request Method [home] rest [/]");

		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldWeb.class, args);
	}
}
