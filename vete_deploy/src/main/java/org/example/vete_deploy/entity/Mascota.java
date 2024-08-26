package org.example.vete_deploy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor
@NoArgsConstructor
public class Mascota {

    @Id @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @ManyToOne @JoinColumn(name = "idDuenio")
    @JsonBackReference
    private Duenio duenio;

}
