package org.example.vete_deploy.service;

import org.example.vete_deploy.entity.Duenio;

import java.util.List;

public interface IDuenioService {

    void createDuenio(Duenio duen);

    List<Duenio> getDuenios();

    Duenio getDuenio(Long id);

    void deleteDuenio(Long id);

    void editDuenio(Duenio duen);
}
