package org.example.vete_deploy.repository;

import org.example.vete_deploy.entity.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends
        JpaRepository<Duenio, Long> {
}
