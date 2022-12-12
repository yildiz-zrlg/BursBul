package com.example.BursBul.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "universite")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id
    @Column(name = "universite_id", nullable = false, length = 15)
    private String universite_id;

    @Column(name = "universite_sinif", nullable = false, length = 10)
    private String universiteSinif;

    @Column(name = "universite_gano", nullable = false, length = 10)
    private String universiteGano;

    @Column(name = "universite_adi", nullable = false, length = 50)
    private String universiteAdi;

}