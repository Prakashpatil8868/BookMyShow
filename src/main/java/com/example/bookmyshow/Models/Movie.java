package com.example.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Movie extends BaseModel{
    private String name;
    private String description;
}
