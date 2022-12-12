package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Kurum;
import jakarta.persistence.*;

@Entity
@Table(name = "kurumbursverme")
public class Kurumbursverme {
    @Id
    @Column(name = "kurumbursverme_id", nullable = false, length = 15)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kurum_id", nullable = false)
    private Kurum kurum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Burs getBurs() {
        return burs;
    }

    public void setBurs(Burs burs) {
        this.burs = burs;
    }

    public Kurum getKurum() {
        return kurum;
    }

    public void setKurum(Kurum kurum) {
        this.kurum = kurum;
    }

}