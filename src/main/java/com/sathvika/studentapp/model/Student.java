package com.sathvika.studentapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private int marks;

public long getId() {
     return id;
     }

public void setId(long id) {
 this.id = id;
}

public String getName() {
 return name;
 }

public void setName(String name) {
 this.name = name;
 }    
 

// Add getter and setter
public int getMarks() {
    return marks;
}

public void setMarks(int marks) {
    this.marks = marks;
}
}
