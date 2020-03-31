package com.nhpuma.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhpuma.app.usuarios.models.repository.AlumnoRepository;
import com.nhpuma.microservicios.commons.services.CommonServiceImpl;
import com.nhpuma.microservicios.commonsalumnos.models.entity.Alumno;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		return repository.findByNombreOrApellido(term);
	}

}
