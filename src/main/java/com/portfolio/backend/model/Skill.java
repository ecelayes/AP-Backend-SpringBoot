package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameSkill;
    private String dirIcon;
    private Integer percentage;
    
    //Constructor

    public Skill(String nameSkill, String dirIcon, Integer percentage) {
        this.nameSkill = nameSkill;
        this.dirIcon = dirIcon;
        this.percentage = percentage;
    }
    
}
