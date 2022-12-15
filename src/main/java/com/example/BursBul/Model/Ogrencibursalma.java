package com.example.BursBul.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ogrencibursalma")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ogrencibursalma {
    @Id
    @Column(name = "ogrencibursalma_id", nullable = false, length = 15)
    private String ogrencibursalma_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ogrenci_id", nullable = false)
    private Ogrenci ogrenci;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;
}