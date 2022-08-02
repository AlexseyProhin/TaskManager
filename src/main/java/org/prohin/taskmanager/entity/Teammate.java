package org.prohin.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="TEAMMATE", schema ="Community")//название столбца
@Data
public class Teammate {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;

    private String firstName;

    private LocalDate dateOfBirth;

    private  String posittion;
    @ManyToOne
    private Team idTeam;

}
