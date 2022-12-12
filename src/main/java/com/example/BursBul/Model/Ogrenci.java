package com.example.BursBul.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ogrenci")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ogrenci {
    @Id
    @Column(name = "ogrenci_id", nullable = false, length = 15)
    private String ogrenci_id;

    @Column(name = "ogrenci_adi", nullable = false, length = 20)
    private String ogrenciAdi;

    @Column(name = "ogrenci_soyadi", nullable = false, length = 20)
    private String ogrenciSoyadi;

    @Column(name = "ogrenci_email", nullable = false, length = 25)
    private String ogrenciEmail;

    @Column(name = "ogrenci_gelir", nullable = false, length = 10)
    private String ogrenciGelir;

    @Column(name = "ogrenci_kardessayisi", nullable = false, length = 20)
    private String ogrenciKardessayisi;

    @Column(name = "ogrenci_annesagmi", nullable = false)
    private Boolean ogrenciAnnesagmi = false;

    @Column(name = "ogrenci_babasagmi", nullable = false)
    private Boolean ogrenciBabasagmi = false;

}