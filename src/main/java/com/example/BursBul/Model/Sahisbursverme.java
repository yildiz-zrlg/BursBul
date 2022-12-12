package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Sahis;
import jakarta.persistence.*;

@Entity
@Table(name = "sahisbursverme")
public class Sahisbursverme {
    @Id
    @Column(name = "sahisbursverme_id", nullable = false, length = 15)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sahis_id", nullable = false)
    private Sahis sahis;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sahis getSahis() {
        return sahis;
    }

    public void setSahis(Sahis sahis) {
        this.sahis = sahis;
    }

    public Burs getBurs() {
        return burs;
    }

    public void setBurs(Burs burs) {
        this.burs = burs;
    }

}