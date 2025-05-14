package me.sridharpatil.ticketease.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Location {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String pin;
}
