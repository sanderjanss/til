package com.switchfully.til.repository;

import com.switchfully.til.exceptions.NoSuchTilException;
import com.switchfully.til.domain.Til;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class TilRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    public TilRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean contains(UUID uuid){
        return entityManager.find(Til.class, uuid) != null;
    }

    public List<Til> getTils() {
//        return database.values().stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toUnmodifiableList());
        return entityManager.createQuery("select t from Til t", Til.class).getResultList();
    }

    public Til addTil(Til newTil) {
//        if (database.containsKey(newTil.getPerson())) {
//            database.get(newTil.getPerson()).add(newTil);
//        } else {
//            database.put(newTil.getPerson(), new ArrayList<>(List.of(newTil)));
//        }
        entityManager.persist(newTil);
        return newTil;
    }

    public void deleteTil(UUID uuid) {
//        Til tilToDelete = database.values().stream()
//                .flatMap(Collection::stream)
//                .filter(til -> til.getUuid().equals(uuid))
//                .findAny().orElseThrow(NoSuchTilException::new);
//
//        database.get(tilToDelete.getPerson()).remove(tilToDelete);
        Til til = entityManager.find(Til.class, uuid);
        entityManager.remove(til);
    }
}
