package com.nt.commit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MethodRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("method invoked.....");
		
	}

}
