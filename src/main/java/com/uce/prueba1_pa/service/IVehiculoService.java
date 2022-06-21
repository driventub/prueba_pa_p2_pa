package com.uce.prueba1_pa.service;

import com.uce.prueba1_pa.modelo.Vehiculo;

public interface IVehiculoService {
    public void actualizar(Vehiculo c);

    public Vehiculo buscar(String placa);

    public void ingresarVehiculo(Vehiculo e);

    public void borrarVehiculo(String placa);

    
}