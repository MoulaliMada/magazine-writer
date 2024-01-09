/*
 * You can use the following import statements
 *
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * import javax.persistence.*;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.wordlyweek.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="magazine")
public class Magazine{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int magazineId;


    @Column(name="title")
    private String magazineName;


    @Column(name="publicationdate")
    private String publicationDate;

    
    @ManyToMany(mappedBy="magazines")
    @JsonIgnoreProperties("magazines")
    private List<Writer> writers=new ArrayList<>();
    public Magazine{

    }
    public int getmagazineId(){
        return magazineId;
    }
    public void setmagazineId(int magazineId){
        this.magazineId=magazineId;
    }
    
    public String getMagazineName(){
        return magazineName;
    }
    public void setMagazineName(String magazineName){
        this.magazineName=magazineName;
    }

     public String getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate=publicationDate;
    }

    public List<Writer> getWriters(){
        return writers;
    }
    public void setWriters(List<Writer> writers){
        this.writers=writers;
    }
}