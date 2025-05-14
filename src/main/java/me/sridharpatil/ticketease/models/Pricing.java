package me.sridharpatil.ticketease.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pricing extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private SeatType seatType;
    private Double price;
}
