package hu.sonrisa.Diamond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiamondApplication {

	public static void main(String[] args) {
		Diamond.draw(Diamond.upTo('C'));
		// SpringApplication.run(DiamondApplication.class, args);
	}

}
