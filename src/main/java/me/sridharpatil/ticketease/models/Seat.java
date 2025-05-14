package me.sridharpatil.ticketease.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    @Column(name = "roww")
    private String row;

    @Column(name = "coll")
    private String col;

    @ManyToOne
    private SeatType type;

    @ManyToOne
    private Theater theater;
}
