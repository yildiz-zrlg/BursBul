package com.example.BursBul.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "uniogrenci")
public class Uniogrenci {
    @Id
    @Column(name = "uniogrenci_id", nullable = false, length = 15)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ogrenci_id", nullable = false)
    private Ogrenci ogrenci;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "universite_id", nullable = false)
    private Universite universite;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

}