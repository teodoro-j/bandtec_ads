package br.com.bandtec.jpaclienterest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JpaClienteRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaClienteRestApplication.class, args);
	}

}
