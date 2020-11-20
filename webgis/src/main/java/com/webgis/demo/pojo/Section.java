package com.webgis.demo.pojo;
import java.lang.*;

public class Section {
    int id;
    String name;
    String addressName;
    float pointX;
    float pointY;
    String handPeople;
    String tel;
    String status;
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public float getPointX() {
        return pointX;
    }

    public float getPointY() {
        return pointY;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getHandPeople() {
        return handPeople;
    }

    public String getStatus() {
        return status;
    }

    public String getTel() {
        return tel;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setHandPeople(String handPeople) {
        this.handPeople = handPeople;
    }

    public void setPointX(float pointX) {
        this.pointX = pointX;
    }

    public void setPointY(float pointY) {
        this.pointY = pointY;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
