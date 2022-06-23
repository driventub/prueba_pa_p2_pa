package com.uce.prueba1_pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.prueba1_pa.modelo.Matricula;
import com.uce.prueba1_pa.modelo.Propietario;
import com.uce.prueba1_pa.modelo.Vehiculo;
import com.uce.prueba1_pa.repository.IMatriculaRepo;

@Service
public class GestorServiceImpl implements IGestorService{

    @Autowired
    private IPropietarioService propietarioService;

    @Autowired
    private IVehiculoService vehiculoService;

    @Autowired
    private IMatriculaRepo matriculaRepo;

    @Autowired
    @Qualifier("ligera")
    private IMatriculaService ligera;
    
    @Autowired
    @Qualifier("pesada")
    private IMatriculaService pesada;



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
            valorMatricula = this.pesada.calcular(v.getPrecio());
            
            
            
            m.setValor(valorMatricula);
            this.matriculaRepo.insertar(m);

            


        }else if (v.getTipo().equals("L")) {
            valorMatricula = this.ligera.calcular(v.getPrecio());
            
            m.setValor(valorMatricula);
            this.matriculaRepo.insertar(m);

            
        }else{
            System.out.println("El tipo de vehiculo es invalido, no se realizo la matricula");
        }

        
        
    }
    
}
