package com.example.BursBul.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uniogrenci")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Uniogrenci {
    @Id
    @Column(name = "uniogrenci_id", nullable = false, length = 15)
    private String uniogrenci_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ogrenci_id", nullable = false)
    private Ogrenci ogrenci;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "universite_id", nullable = false)
    private Universite universite;

}