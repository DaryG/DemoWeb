package com.dary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dary.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

	Usuario findByNombre(String nombre);
	
}
