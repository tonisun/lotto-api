package de.egosanto.lottoapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "ej_draw")
public class EuroJackpotDraw {

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

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

    @Column(name = "en1")
    private Integer euroNumber1;

    @Column(name = "en2")
    private Integer euroNumber2;


}
