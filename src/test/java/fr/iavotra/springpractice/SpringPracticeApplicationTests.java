package fr.iavotra.springpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringPracticeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void encode() {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		String pwd = bcryptPasswordEncoder.encode("password");
		System.out.println(pwd);
	}

}
