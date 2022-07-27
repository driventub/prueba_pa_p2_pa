package com.uce.prueba1_pa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Propietario;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo {

    @PersistenceContext
    private EntityManager e;

    @Override
    public void insertar(Propietario e) {
        this.e.persist(e);

    }

    @Override
    public void eliminar(String cedula) {
        this.e.createQuery("DELETE Propietario p WHERE p.cedula =:cedula ")
                .setParameter("cedula", cedula);

    }

    @Override
    public Propietario buscar(String cedula) {
        TypedQuery<Propietario> jpqlQuery = this.e
                .createQuery("SELECT p FROM Propietario p WHERE p.cedula =:cedula", Propietario.class)
                .setParameter("cedula", cedula);
        return jpqlQuery.getSingleResult();
    }

}
