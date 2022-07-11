package com.uce.prueba1_pa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo{
	
	
	
	
	@PersistenceContext
	private EntityManager e;
	
	


	@Override
	public void actualizar(Vehiculo e) {
		this.e.merge(e);
		
	}


	@Override
	public void insertar(Vehiculo e) {
		this.e.persist(e);
		
	}


    @Override
    public Vehiculo buscar(String placa) {
        Query jpqlQuery = this.e.createQuery("SELECT v FROM Vehiculo v WHERE p.placa =:placa")
        .setParameter("placa", placa);
        return (Vehiculo) jpqlQuery.getSingleResult();
    }


    @Override
    public void eliminar(String placa) {
        this.e.createQuery("DELETE Vehiculo v WHERE p.placa =:placa ")
        .setParameter("placa", placa);
        
    }

}

