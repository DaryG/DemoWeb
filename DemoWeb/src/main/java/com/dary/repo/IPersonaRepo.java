package com.dary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dary.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
