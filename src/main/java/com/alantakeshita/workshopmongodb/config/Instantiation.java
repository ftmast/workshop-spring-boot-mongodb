package com.alantakeshita.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.alantakeshita.workshopmongodb.domain.User;
import com.alantakeshita.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRep;
	
	@Override
	public void run(String... args) throws Exception {
		userRep.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User alan = new User(null, "Alan Take", "alan@gmail.com");
		
		userRep.saveAll(Arrays.asList(maria, alex, bob, alan));
	}

}
