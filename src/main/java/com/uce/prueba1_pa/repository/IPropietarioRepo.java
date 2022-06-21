package com.uce.prueba1_pa.repository;

import com.uce.prueba1_pa.modelo.Propietario;

public interface IPropietarioRepo {
    public void insertar(Propietario e);

    

    public void eliminar(String cedula);


    // No le incluye en la prueba, pero hace falta, para buscarlo en el gestor
    public Propietario buscar(String cedula);
}