package com.example.BursBul.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kurum")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kurum {
    @Id
    @Column(name = "kurum_id", nullable = false, length = 15)
    private String kurum_id;

    @Column(name = "kurum_adi", nullable = false, length = 50)
    private String kurumAdi;

    @Column(name = "kurum_adresi", nullable = false, length = 50)
    private String kurumAdresi;

    @Column(name = "kurum_email", nullable = false, length = 25)
    private String kurumEmail;

}