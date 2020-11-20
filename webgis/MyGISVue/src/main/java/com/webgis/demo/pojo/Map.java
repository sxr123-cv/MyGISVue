package com.webgis.demo.pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
@Entity
@Table(name = "Map")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;


    float pointX;

    float pointY;

    @Column(name="addressName")
    String Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPointX() {
        return pointX;
    }

    public void setPointX(float x) {
        this.pointX = x;
    }

    public float getPointY() {
        return pointY;
    }

    public void setPointY(float y) {
        this.pointY = y;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
}
