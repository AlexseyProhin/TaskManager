package org.prohin.taskmanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="EPIC", schema="HEADTOPIC")//название столбца
public class Epic {
    @Id//определяем первичный ключ
    @GeneratedValue(strategy= GenerationType.AUTO)// 4 стратегии генирации, может быть AUTO, TABLE, SEQUENCE или IDENTITY:
    private Long id;
    @Column(name="HEADTIPIC_NAME",length = 30, nullable=false, unique=false)// длина,допускает ли столбец значение null или нет,указывает, является ли столбец уникальным
    @Getter @Setter private String name;

    @Getter @Setter private  String description;

    @Getter @Setter private  int idTeam;

    @Getter @Setter private LocalDate startDatePlan;

    @Getter @Setter private LocalDate endtDatePlan;

    @Getter @Setter private LocalDate startDateFact;

    @Getter @Setter private Date endDateFact;

}
