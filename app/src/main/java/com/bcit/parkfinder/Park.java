package com.bcit.parkfinder;


public class Park
{
    private int parkId;
    private String name;
    private double latitude;
    private double longitude;
    private String washroom;
    private String neighbourhoodName;
    private String neighbourhoodurl;
    private String streetNumber;
    private String streetName;

    private String facility;
    private String feature;

    public Park() {}

    public Park(int parkId, String name, double latitude, double longitude, String washroom,
                String neighbourhoodName, String neighbourhoodurl, String streetNumber, String streetName) {
        this.parkId = parkId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.washroom = washroom;
        this.neighbourhoodName = neighbourhoodName;
        this.neighbourhoodurl = neighbourhoodurl;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
    }

    public Park(int parkId, String name, double latitude, double longitude, String streetNumber, String streetName) {
        this.parkId = parkId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
    }

    public void setParkId(int parkId){
        this.parkId = parkId;
    }
    public int getParkId(){
        return this.parkId;
    }
    public void setWashroom(String washroom){
        this.washroom = washroom;
    }
    public String getWashroom(){
        return this.washroom;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public double getLatitude(){
        return this.latitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public double getLongitude(){
        return this.longitude;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setNeighbourhoodurl(String neighbourhoodurl){
        this.neighbourhoodurl = neighbourhoodurl;
    }
    public String getNeighbourhoodurl(){
        return this.neighbourhoodurl;
    }
    public void setStreetNumber(String streetNumber){
        this.streetNumber = streetNumber;
    }
    public String getStreetNumber(){
        return this.streetNumber;
    }
    public void setNeighbourhoodName(String neighbourhoodName){
        this.neighbourhoodName = neighbourhoodName;
    }
    public String getNeighbourhoodName(){
        return this.neighbourhoodName;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public String getStreetName(){
        return this.streetName;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String toString() {
        return "" + this.parkId + ", " + this.name + ", " + this.latitude + ", " + this.longitude;
    }

}
