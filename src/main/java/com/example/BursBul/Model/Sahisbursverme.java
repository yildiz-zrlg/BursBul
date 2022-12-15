package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Sahis;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sahisbursverme")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sahisbursverme {
    @Id
    @Column(name = "sahisbursverme_id", nullable = false, length = 15)
    private String sahisbursverme_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sahis_id", nullable = false)
    private Sahis sahis;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

}