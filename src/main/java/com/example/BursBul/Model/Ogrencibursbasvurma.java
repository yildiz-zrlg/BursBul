package com.example.BursBul.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ogrencibursbasvurma")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ogrencibursbasvurma {
    @Id
    @Column(name = "ogrencibursbasvurma_id", nullable = false, length = 15)
    private String ogrencibursbasvurma_id;

    @Column(name = "puan", nullable = false, length = 5)
    private String puan;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ogrenci_id", nullable = false)
    private Ogrenci ogrenci;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

}