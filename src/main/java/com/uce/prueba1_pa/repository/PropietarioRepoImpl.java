package com.uce.prueba1_pa.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {


    @Override
    public void insertar(Propietario e) {
        System.out.println("Se ha insertado en la base " + e);

    }

    @Override
    public void eliminar(String cedula) {
        System.out.println("Se ha eliminado de la base " + cedula);

    }

    @Override
    public Propietario buscar(String cedula) {
        System.out.println("Se busca el propietario con cedula :" + cedula);
        Propietario p = new Propietario();
        p.setApellido("Alonso");
		p.setCedula("176372857-8");
		p.setFechaNacimiento(LocalDateTime.of(1975, 02,22,01,01,01));
		p.setNombre("Fernando");

        return p;
    }

}