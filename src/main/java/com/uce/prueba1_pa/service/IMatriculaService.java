package com.uce.prueba1_pa.service;

import com.uce.prueba1_pa.modelo.Matricula;

public interface IMatriculaService {
    public void actualizar(Matricula c);

    public Matricula buscar(String numero);

    public void ingresarMatricula(Matricula e);

    public void borrarMatricula(String cedula);

    
}