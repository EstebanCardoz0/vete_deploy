package org.example.vete_deploy.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


    @Entity @Data @AllArgsConstructor
    @NoArgsConstructor
    public class Duenio {

        @Id @GeneratedValue(strategy =
                GenerationType.IDENTITY)
        private Long idDuenio;
        private String dni;
        private String nombre;
        private String apellido;
        private String celular;

        @OneToMany(mappedBy = "duenio")
        @JsonManagedReference
        private List<Mascota> mascotas;
    }

