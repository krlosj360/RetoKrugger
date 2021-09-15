package com.reto.kruger.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	     @Id
	     private String cedula;
         
	     
	     @Column(name = "nombres")
	     private String nombres;

	     @Column(name = "apellidos")
	     private String apellidos;
         
	  
	     @Column(name = "email")
	     private String email;
	     
	     @Column(name = "tipousuario")
	     private String  tipoUsuario;
	     
	     @Column(name = "fechaN")
	     private String  fechaN;
	     
	     @Column(name = "direccion")
	     private String  direccion;  
	     
	     @Column(name = "celular")
	     private String  celular;  
	     
	     @Column(name = "estadovacuna")
	     private String  estadoVacuna;  
	     
	     @Column(name = "tipovacuna")
	     private String  tipoVacuna;  
	  
	     @Column(name = "fechavacuna")
	     private String  fechaVacuna;  
	      
	     @Column(name = "numerodosis")
	     private String  numeroDosis;

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTipoUsuario() {
			return tipoUsuario;
		}

		public void setTipoUsuario(String tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}

		public String getFechaN() {
			return fechaN;
		}

		public void setFechaN(String fechaN) {
			this.fechaN = fechaN;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCelular() {
			return celular;
		}

		public void setCelular(String celular) {
			this.celular = celular;
		}

		public String getEstadoVacuna() {
			return estadoVacuna;
		}

		public void setEstadoVacuna(String estadoVacuna) {
			this.estadoVacuna = estadoVacuna;
		}

		public String getTipoVacuna() {
			return tipoVacuna;
		}

		public void setTipoVacuna(String tipoVacuna) {
			this.tipoVacuna = tipoVacuna;
		}

		public String getFechaVacuna() {
			return fechaVacuna;
		}

		public void setFechaVacuna(String fechaVacuna) {
			this.fechaVacuna = fechaVacuna;
		}

		public String getNumeroDosis() {
			return numeroDosis;
		}

		public void setNumeroDosis(String numeroDosis) {
			this.numeroDosis = numeroDosis;
		}

		 
	     
	     

}
