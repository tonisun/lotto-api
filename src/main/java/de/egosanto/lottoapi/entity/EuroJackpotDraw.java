package de.egosanto.lottoapi.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
