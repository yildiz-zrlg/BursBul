package com.example.BursBul.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sahis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sahis {
    @Id
    @Column(name = "sahis_id", nullable = false, length = 15)
    private String sahis_id;

    @Column(name = "sahis_adi", nullable = false, length = 20)
    private String sahisAdi;

    @Column(name = "sahis_soyadi", nullable = false, length = 20)
    private String sahisSoyadi;

    @Column(name = "sahis_email", nullable = false, length = 25)
    private String sahisEmail;

    @Column(name = "sahis_meslek", nullable = false, length = 20)
    private String sahisMeslek;

}