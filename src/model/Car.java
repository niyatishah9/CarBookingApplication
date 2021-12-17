/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author niyat
 */
public class Car {
    
    private int Serialnumber;
    private String Car_name;
    private String Car_manufacturer;
    private String manufactureryear;
 
    private String no_seats;
    private int model_no;
    private String car_location;
    private int maintenancecertificate_date;
 
    private String availability;
    private String color;

    public String getNo_seats() {
        return no_seats;
    }

    public void setNo_seats(String no_seats) {
        this.no_seats = no_seats;
    }
    
    
    

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getManufactureryear() {
        return manufactureryear;
    }

    public void setManufactureryear(String manufactureryear) {
        this.manufactureryear = manufactureryear;
    }
    

    public int getSerialnumber() {
        return Serialnumber;
    }

    public void setSerialnumber(int Serialnumber) {
        this.Serialnumber = Serialnumber;
    }

    public String getCar_name() {
        return Car_name;
    }

    public void setCar_name(String Car_name) {
        this.Car_name = Car_name;
    }

    public String getCar_manufacturer() {
        return Car_manufacturer;
    }

    public void setCar_manufacturer(String Car_manufacturer) {
        this.Car_manufacturer = Car_manufacturer;
    }

    

    public int getModel_no() {
        return model_no;
    }

    public void setModel_no(int model_no) {
        this.model_no = model_no;
    }

    public String getCar_location() {
        return car_location;
    }

    public void setCar_location(String car_location) {
        this.car_location = car_location;
    }

    public int getMaintenancecertificate_date() {
        return maintenancecertificate_date;
    }

    public void setMaintenancecertificate_date(int maintenancecertificate_date) {
        this.maintenancecertificate_date = maintenancecertificate_date;
    }

   
  
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return Car_name;
    }
    
    
}
