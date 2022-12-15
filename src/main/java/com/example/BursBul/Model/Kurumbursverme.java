package com.example.BursBul.Model;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Kurum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kurumbursverme")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kurumbursverme {
    @Id
    @Column(name = "kurumbursverme_id", nullable = false, length = 15)
    private String kurumbursverme_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "burs_id", nullable = false)
    private Burs burs;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kurum_id", nullable = false)
    private Kurum kurum;

}