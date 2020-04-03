package com.nhpuma.app.usuarios.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.nhpuma.microservicios.commons.services.CommonService;
import com.nhpuma.microservicios.commonsalumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

	public List<Alumno> findByNombreOrApellido(String term);
	
	public Iterable<Alumno> findAllById(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
}
