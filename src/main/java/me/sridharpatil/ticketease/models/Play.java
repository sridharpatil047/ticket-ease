package me.sridharpatil.ticketease.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Play extends BaseModel {
    private String name;
    private String posterUrl;

    @ManyToMany
    private List<Talent> actors;

    @ManyToOne
    private Talent writer;
}
