package me.sridharpatil.ticketease.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TalentType extends BaseModel {
    private String name;
}
