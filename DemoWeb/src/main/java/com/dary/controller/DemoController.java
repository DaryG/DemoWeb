package com.dary.controller;

import com.dary.model.Persona;
import com.dary.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class DemoController {

  @Autowired
  private IPersonaRepo repo;

  /**persona.
   * 
   * @param name id.
   * @param model nombre.
   * @return insertar persona.
   */
  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
      Model model) {
    // logica
    Persona p = new Persona();
    p.setIdPersona(2);
    p.setNombre("Raul");
    repo.save(p);
    model.addAttribute("name", name);
    return "greeting";
  }
  
/**
 * 
 * @param model
 * @return
 */
  @GetMapping("/listar")
  public String greeting(Model model) {
    // logica

    model.addAttribute("personas", repo.findAll());
    return "greeting";
  }

}
