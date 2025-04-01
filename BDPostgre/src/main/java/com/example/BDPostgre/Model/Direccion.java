package com.example.BDPostgre.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String calle;
    private String ciudad;
    private String codigoPostal;

    @OneToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}