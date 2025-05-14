package me.sridharpatil.ticketease.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "showw")
public class Show extends BaseModel {
    @ManyToOne
    private Theater theater;

    @ManyToOne
    private Play play;
    private LocalDateTime dateTime;
}
