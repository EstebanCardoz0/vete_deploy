package org.example.vete_deploy.service;

import org.example.vete_deploy.dto.DTOMascota;
import org.example.vete_deploy.entity.Mascota;

import java.util.List;

public interface IMascotaService {

    void createMascota(Mascota mascota);

    List<Mascota> getMascotas();

    Mascota getMascota(Long id);

    void deleteMascota(Long id);

    void editMascota(Mascota masco);

    List<Mascota> getPerroCaniche();

    DTOMascota mascoDTO(Long id);


}
