
package com.br.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootApplication {

	@Value("${paginacao}")
	private int paginacaoPorPagina;

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("### Quantidade de elementos por página = " + this.paginacaoPorPagina);
			
		};
	}
}
