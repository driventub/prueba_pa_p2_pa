package com.uce.prueba1_pa.repository;

import com.uce.prueba1_pa.modelo.Matricula;

public interface IMatriculaRepo {
    public void insertar(Matricula e);

    public Matricula buscar(String numero);

    public void actualizar(Matricula e);

    public void eliminar(String numero);
}