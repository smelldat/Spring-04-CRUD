package com.wildcodeschool.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGame {

    public VideoGame() {
        // JPA
    }

    public VideoGame(String name, String company, int release_year) {
        this.name = name;
        this.company = company;
        this.release_year = release_year;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String company;

    private int release_year;

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name +
                ", company=" + company + ", release_year=" + release_year + "]";
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
}
