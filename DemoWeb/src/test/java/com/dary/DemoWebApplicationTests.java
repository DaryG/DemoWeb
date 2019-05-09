package com.dary;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.dary.model.Usuario;
import com.dary.repo.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationTests {

	@Autowired	
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario us= new Usuario(); 	
		us.setId(3);
		us.setNombre("cervera");
		us.setClave(encoder.encode("222"));
	Usuario retorno = repo.save(us);
	
	assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
		
	}

}
