package com.uce.prueba1_pa.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

    @Override
    public void actualizar(Vehiculo c) {
        
        System.out.println("Vehiculo actualizado a: " + c);

    }

    @Override
    public Vehiculo buscar(String placa) {
        System.out.println("Se busca la placa :" + placa);
        Vehiculo c = new Vehiculo();
        c.setMarca("Toyota");
		c.setPlaca("PPP-132");
		c.setPrecio(new BigDecimal("10300"));
		c.setTipo("L");

        return c;
    }

    @Override
    public void insertar(Vehiculo e) {
        System.out.println("Se ha insertado en la base el Vehiculo: " + e);

    }

    @Override
    public void eliminar(String placa) {
        System.out.println("Se ha eliminado de la base el Vehiculo con la placa: " + placa);

    }

}