package org.prohin.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="Bdexample", schema="Person")//название столбца
@Data
public class Bdexample {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Bdexample;

    private String name;
    @ManyToOne
    private Team idTeam;

    private LocalDate myBrithday;

    private String exampleOneTomany;

}
