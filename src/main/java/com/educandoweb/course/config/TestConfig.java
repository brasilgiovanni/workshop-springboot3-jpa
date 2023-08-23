package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test") // esse nome 'test' tem que ser igual ao nome dado no arquivo 'application.properties'
public class TestConfig implements CommandLineRunner { // tem o método 'run' que faz rodar sempre que o programa é iniciado
	
	@Autowired // resolve essa dependencia de outra classe e associa uma instancia do userRepository ao TestConfig
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2)); // salvar os usuarios em uma lista Array
		
	}
	

}
