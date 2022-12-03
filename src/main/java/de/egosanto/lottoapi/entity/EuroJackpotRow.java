package de.egosanto.lottoapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ej_row")
public class EuroJackpotRow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "row_id")
    private Integer id;

    @Column(name = "n1")
    private Integer number1;

    @Column(name = "n2")
    private Integer number2;

    @Column(name = "n3")
    private Integer number3;

    @Column(name = "n4")
    private Integer number4;

    @Column(name = "n5")
    private Integer number5;
}
