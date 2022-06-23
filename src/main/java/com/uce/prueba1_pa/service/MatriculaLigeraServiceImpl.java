package com.uce.prueba1_pa.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ligera")
public class MatriculaLigeraServiceImpl implements IMatriculaService{

    @Override
    public BigDecimal calcular(BigDecimal v) {
        BigDecimal valorMatricula ;
        valorMatricula = v.multiply(new BigDecimal("0.10"));
        if(valorMatricula.compareTo(new BigDecimal("2000") )> 0){
            valorMatricula = valorMatricula.subtract(valorMatricula.multiply(new BigDecimal("0.07"))) ;
        }
            
        
        return valorMatricula;
    }
    
}
