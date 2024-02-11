package com.example.ToDoApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
public class ToDoItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String description;

    @Setter
    @Getter
    private boolean isDone;

    @Setter
    @Getter
    private Instant createdOn;

    @Setter
    @Getter
    private Instant updatedOn;

    public ToDoItems(String description){
        this.description = description;
        this.isDone = false;
        this.createdOn = Instant.now();
        this.updatedOn = Instant.now();
    }

    @Override
    public String toString() {
        return "ToDoItems{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
