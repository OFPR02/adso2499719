package com.sena.adso2499719.adso2499719.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesores_materias_grados")
public class Profesor_Materia_Grado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "grado_id", nullable = false)
	private grado grado;
	
	@ManyToOne
	@JoinColumn(name = "profesor_id", nullable = false)
	private Profesor profesor;
	
	@ManyToOne
	@JoinColumn(name = "materia_id", nullable = false)
	private materia materia;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public grado getGrado() {
		return grado;
	}

	public void setGrado(grado grado) {
		this.grado = grado;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public materia getMateria() {
		return materia;
	}

	public void setMateria(materia materia) {
		this.materia = materia;
	}

}
