package com.maks.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Task {
    private String id;
    private String description;
    private LocalDateTime start;
    private LocalDateTime to;
    private BigDecimal price;
    private Worker responsible;

    public Task(String id, String description, LocalDateTime start, LocalDateTime to, BigDecimal price, Worker responsible) {
        this.id = id;
        this.description = description;
        this.start = start;
        this.to = to;
        this.price = price;
        this.responsible = responsible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Worker getResponsible() {
        return responsible;
    }

    public void setResponsible(Worker responsible) {
        this.responsible = responsible;
    }

    public Task (){

    };

}
