package com.nhpuma.app.usuarios.services;

import java.util.List;

import com.nhpuma.microservicios.commons.services.CommonService;
import com.nhpuma.microservicios.commonsalumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

	public List<Alumno> findByNombreOrApellido(String term);
}
