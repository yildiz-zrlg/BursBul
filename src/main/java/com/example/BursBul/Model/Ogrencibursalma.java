package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Ogrenci;
import jakarta.persistence.*;

@Entity
@Table(name = "ogrencibursalma")
public class Ogrencibursalma {
    @Id
    @Column(name = "ogrencibursalma_id", nullable = false, length = 15)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ogrenci_id", nullable = false)
    private Ogrenci ogrenci;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

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

    public Burs getBurs() {
        return burs;
    }

    public void setBurs(Burs burs) {
        this.burs = burs;
    }

}