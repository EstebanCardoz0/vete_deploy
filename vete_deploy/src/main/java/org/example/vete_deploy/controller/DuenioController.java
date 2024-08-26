package org.example.vete_deploy.controller;

import org.example.vete_deploy.entity.Duenio;
import org.example.vete_deploy.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenio")
public class DuenioController {

    @Autowired
    IDuenioService duenioServi;


    @PostMapping("/create")
    public String createDuenio(@RequestBody
                               Duenio duen) {
        duenioServi.createDuenio(duen);

        return "Dueño creado con éxito";
    }

    @GetMapping("/get/{id}")
    public Duenio getDuenio(
            @PathVariable Long id) {

        return duenioServi.getDuenio(id);
    }

    @GetMapping("/getDuenios")
    public List<Duenio> getDuenios() {

        return duenioServi.getDuenios();
    }

    @DeleteMapping("delete/{id}")
    public String deleteDuenio(
            @PathVariable Long id) {

        duenioServi.deleteDuenio(id);
        return "Dueño eliminado con éxito";
    }

    @PutMapping("/edit")
    public Duenio editDuenio(
            @RequestBody Duenio duen) {

        duenioServi.editDuenio(duen);
        return duenioServi.getDuenio(
                duen.getIdDuenio());

    }


}
