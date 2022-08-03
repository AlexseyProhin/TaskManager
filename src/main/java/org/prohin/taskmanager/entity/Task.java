package org.prohin.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
//определил сущность, по умолчанию совпадает с именем класса
@Table(name="TASK", schema ="TASK_TEAM")//название столбца
@Data
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="HEADTIPIC_NAME",length = 30, nullable=false, unique=false)
    private String name;

    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Team idEpic;
    @ManyToOne
    private Team idTeammate;

    private LocalDate startDatePlan;

    private LocalDate endDatePlan;

    private LocalDate startDateFact;

    private LocalDate endDateFact;
    @Enumerated(EnumType.STRING)
    private  Priority priority;



}
