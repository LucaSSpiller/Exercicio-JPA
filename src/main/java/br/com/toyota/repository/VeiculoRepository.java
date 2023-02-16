package br.com.toyota.repository;

import br.com.toyota.model.Veiculo;

import javax.persistence.EntityManager;

public class VeiculoRepository extends Repository{


    public VeiculoRepository() {
        super();
    }

    public void save(Veiculo veiculo) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(veiculo);
        this.entityManager.getTransaction().commit();
        this.close();
    }
}


