package org.prohin.taskmanager.entity;

import lombok.Data;

import javax.persistence.*;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="TEAM", schema ="TEAM_ID")//название столбца
@Data
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="TEAM_NAME",length = 30, nullable=false, unique=false)
    private String name;
    //Team (id, name)
}
