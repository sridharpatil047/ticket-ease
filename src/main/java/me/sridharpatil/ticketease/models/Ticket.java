package me.sridharpatil.ticketease.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private Booking booking;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    private String qrCodeUrl;
    private Double price;
}
