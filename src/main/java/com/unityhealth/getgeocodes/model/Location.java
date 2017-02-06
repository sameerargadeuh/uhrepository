/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Clinton
 */
public class Location {

    private Double lat;
    private Double lng;

    /**
     * @return the lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return the lng
     */
    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    /**
     * @param lng the lng to set
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }
    public String toString() {
        return "Location {" +
                "lat=" + lat +
                ", lng='" + lng + '\'' +
                '}';
    }

}
