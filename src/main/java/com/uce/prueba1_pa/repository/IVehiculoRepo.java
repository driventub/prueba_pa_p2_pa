package com.uce.prueba1_pa.repository;

import com.uce.prueba1_pa.modelo.Vehiculo;

public interface IVehiculoRepo {
    public void insertar(Vehiculo e);

    public Vehiculo buscar(String numero);

    public void actualizar(Vehiculo e);

    public void eliminar(String numero);
}
