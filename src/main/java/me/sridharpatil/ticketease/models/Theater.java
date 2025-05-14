package me.sridharpatil.ticketease.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theater extends BaseModel {
    private String name;

    @Embedded
    private Location location;
}
