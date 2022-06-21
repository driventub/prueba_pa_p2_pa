package com.uce.prueba1_pa.service;

import com.uce.prueba1_pa.modelo.Propietario;

public interface IPropietarioService {
    

    public void ingresarPropietario(Propietario e);

    public void borrarPropietario(String cedula);

    public Propietario buscar(String cedula);
    
}