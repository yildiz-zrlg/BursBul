package com.example.BursBul.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "burs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Burs {
    @Id
    @Column(name = "burs_id", nullable = false, length = 15)
    private String burs_id;

    @Column(name = "burs_miktari", nullable = false, length = 10)
    private String bursMiktari;

    @Column(name = "burs_sure", nullable = false, length = 10)
    private String bursSure;

    @Column(name = "burs_tipi", nullable = false, length = 15)
    private String bursTipi;

}