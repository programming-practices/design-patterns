package com.trl.chapter_12;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
public class Movie2 implements Serializable {
    private static final long serialVersionUID = -6580012241620579129L;
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private int price;
    // Some runtime value which
    // does not need to be persisted
    @Transient
    private int runtimeId;

    public Movie2() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRuntimeId() {
        return this.runtimeId;
    }

    public void setRuntimeId(int runtimeId) {
        this.runtimeId = runtimeId;
    }
}