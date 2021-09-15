package com.reto.kruger.controller;


import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reto.kruger.entity.ErrorObject;
import com.reto.kruger.entity.Reponses;
import com.reto.kruger.entity.Usuarios;
import com.reto.kruger.interfaces.RetoRepository;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;



@RestController
@SecurityRequirement(name = "retoKruger")
public class PersonController {
	
	
	@Autowired
	RetoRepository retoRepository;
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	@GetMapping("/reto/{id}")
	public ResponseEntity<?> getPersona(@PathVariable("id") String id) {
		Optional<Usuarios> tutorialData = retoRepository.findById(id);
		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	

	
	@GetMapping("/reto/{estadoVacuna}/{tipoVacuna}/{fechaVacuna}")
	public ResponseEntity<?> getEmpleados(@PathVariable String estadoVacuna,@PathVariable String tipoVacuna,@PathVariable String fechaVacuna) {
		List<Usuarios> tutorialData = retoRepository.queryFiltro(estadoVacuna,tipoVacuna,fechaVacuna);

			return new ResponseEntity<>(tutorialData, HttpStatus.OK);
		
	}
	
	

	@PostMapping("/reto")
	public ResponseEntity<?> crearRegistro(@RequestBody Usuarios person) {
			 
		try {
			
			
			retoRepository.save(person);
			Reponses repon = new Reponses();
			repon.setCodigo("201");
			repon.setMensaje("EXITO");
			return new ResponseEntity<>(repon, HttpStatus.CREATED);
		} catch (Exception e) {
			
			ErrorObject error = new ErrorObject();
			error.setError(e.getMessage());
			error.setCapa("Controller");
			return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PutMapping("/reto/{id}")
	public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody Usuarios usuarios) {
		
		try {
		
		Optional<Usuarios> tutorialData = retoRepository.findById(id);

		System.out.println("Cedula " + id);
		if (tutorialData.isPresent()) {
			Usuarios usuariosP = tutorialData.get();
			//usuariosP.setCedula(usuariosP.getTitle());
			usuariosP.setFechaN(usuarios.getFechaN());
			usuariosP.setDireccion(usuarios.getDireccion());
			usuariosP.setCelular(usuarios.getCelular());
			usuariosP.setEstadoVacuna(usuarios.getEstadoVacuna());
			usuariosP.setTipoVacuna(usuarios.getTipoVacuna());
			usuariosP.setNumeroDosis(usuarios.getNumeroDosis());
			return new ResponseEntity<>(retoRepository.save(usuariosP), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	   
		 } catch (Exception e) {
		ErrorObject error = new ErrorObject();
		error.setError(e.getMessage());
		error.setCapa("Controller");
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
		
		
	}
	
	

}
