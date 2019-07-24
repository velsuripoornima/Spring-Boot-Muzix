package com.stackroute.springboot.muzix.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //this annotation is used to create a table
public class Track {
    @Id  //representing id as a primary key
    private int id;
    private String name;
    private String content;
    private String status;

    //it is default constructor
    public Track() {
    }

    //creating the parameter constructor for track
    public Track(int id, String name, String content, String status) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.status = status;
    }


    //creating getters and setters
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
