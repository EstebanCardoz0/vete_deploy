package org.example.vete_deploy.repository;



import org.example.vete_deploy.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMascotaRepository extends
        JpaRepository<Mascota, Long> {

    @Query("select m from Mascota m where m"+
            ".especie = 'perro' and m"+
            ".raza = 'caniche'")

    public List<Mascota> getPerroCaniche();
}
