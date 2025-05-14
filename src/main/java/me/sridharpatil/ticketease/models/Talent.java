package me.sridharpatil.ticketease.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Talent extends BaseModel {
    private String name;

    @ManyToMany
    private List<TalentType> talentType;
}
