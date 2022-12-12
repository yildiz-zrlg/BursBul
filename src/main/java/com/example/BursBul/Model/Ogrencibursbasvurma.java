package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Ogrenci;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ogrencibursbasvurma")
public class Ogrencibursbasvurma {
    @Id
    @Column(name = "ogrencibursbasvurma_id", nullable = false, length = 15)
    private String id;

    @Column(name = "puan", nullable = false, length = 5)
    private String puan;

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

    public String getPuan() {
        return puan;
    }

    public void setPuan(String puan) {
        this.puan = puan;
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