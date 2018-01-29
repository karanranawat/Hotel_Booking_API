package com.karanranawat.hotelbooking.dto.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    private String id;
    @Column(name="create_date")
    private String creationDate;
    @Column(name="create_time")
    private String creationTime;
    private String name;
    private String location;
    private String from;
    private String to;

    public Booking(){

    }

    public Booking(String id, String creationDate, String creationTime, String name, String location, String from, String to) {
        this.id = id;
        this.creationDate = creationDate;
        this.creationTime = creationTime;
        this.name = name;
        this.location = location;
        this.from = from;
        this.to = to;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
