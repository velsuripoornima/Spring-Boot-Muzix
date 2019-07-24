package com.stackroute.springboot.muzix.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//this annotation is used to create a table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Track {
    @Id  //representing id as a primary key
    private int id;
    private String name;
    private String content;
    private String status;



}
