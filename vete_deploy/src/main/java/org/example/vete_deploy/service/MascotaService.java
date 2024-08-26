package org.example.vete_deploy.service;

import org.example.vete_deploy.dto.DTOMascota;
import org.example.vete_deploy.entity.Mascota;
import org.example.vete_deploy.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService
        implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public void createMascota(Mascota mascota) {

        mascoRepo.save(mascota);

    }

    @Override public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override public Mascota getMascota(Long id) {
        return mascoRepo.findById(id).get();
    }

    @Override public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.createMascota(masco);
    }

    @Override
    public List<Mascota> getPerroCaniche() {
        return mascoRepo.getPerroCaniche();
    }

    @Override
    public DTOMascota mascoDTO(Long id) {

        Mascota masco = this.getMascota(id);
        DTOMascota masDTO =
                new DTOMascota(masco.getNombre(),
                        masco.getEspecie(),
                        masco.getRaza(),
                        masco.getDuenio()
                                .getNombre(),
                        masco.getDuenio()
                                .getApellido());

        return masDTO;
    }
}
