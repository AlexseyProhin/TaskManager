package org.prohin.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="EPIC", schema="HEADTOPIC")//название столбца
@Data
public class Epic {
    @Id//определяем первичный ключ
    @GeneratedValue(strategy= GenerationType.AUTO)// 4 стратегии генирации, может быть AUTO, TABLE, SEQUENCE или IDENTITY:
    private Long id;
    @Column(name="HEADTIPIC_NAME",length = 30, nullable=false, unique=false)// длина,допускает ли столбец значение null или нет,указывает, является ли столбец уникальным
    private String name;

    private  String description;

    private  int idTeam;

    private LocalDate startDatePlan;

    private LocalDate endtDatePlan;

    private LocalDate startDateFact;

    private Date endDateFact;

}
