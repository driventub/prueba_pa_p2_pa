package com.uce.prueba1_pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1_pa.modelo.Matricula;
import com.uce.prueba1_pa.modelo.Propietario;
import com.uce.prueba1_pa.modelo.Vehiculo;

@Service
public class GestorServiceImpl implements IGestorService{

    @Autowired
    private IPropietarioService propietarioService;

    @Autowired
    private IVehiculoService vehiculoService;

    @Autowired
    private IMatriculaService matriculaService;

    @Override
    public void matricularVehiculo(String cedula, String placa) {
        Propietario p = this.propietarioService.buscar(cedula);
        Vehiculo v = this.vehiculoService.buscar(placa);
        Matricula m = new Matricula();
        m.setFecha(LocalDateTime.now());
        m.setPropietario(p);
        m.setVehiculo(v);
        BigDecimal valorMatricula;

        System.out.println("******************MATRICULACION******************");
        System.out.println();
        
        if (v.getTipo().equals("P")) {
            valorMatricula = v.getPrecio().multiply(new BigDecimal("0.15"));
            
            
            if(valorMatricula.compareTo(new BigDecimal("2000") )> 0){
                valorMatricula = valorMatricula.multiply(new BigDecimal("0.07"));
            }
            m.setValor(valorMatricula);
            this.matriculaService.ingresarMatricula(m);

            


        }else if (v.getTipo().equals("L")) {
            valorMatricula = v.getPrecio().multiply(new BigDecimal("0.10"));
            if(valorMatricula.compareTo(new BigDecimal("2000") )> 0){
                valorMatricula = valorMatricula.multiply(new BigDecimal("0.07"));
            }
            m.setValor(valorMatricula);
            this.matriculaService.ingresarMatricula(m);

            
        }else{
            System.out.println("El tipo de vehiculo es invalido, no se realizo la matricula");
        }

        
        
    }
    
}
