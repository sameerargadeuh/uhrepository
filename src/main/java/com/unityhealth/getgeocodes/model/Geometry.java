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
public class Geometry {
      private Location location;
      private String locationType;
      private Location viewport;

    /**
     * @return the location
     */
      @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the locationType
     */
    @JsonProperty("location_type")
    public String getLocationType() {
        return locationType;
    }

    /**
     * @param locationType the locationType to set
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * @return the viewport
     */
    @JsonProperty("viewport")
    public Location getViewport() {
        return viewport;
    }

    /**
     * @param viewport the viewport to set
     */
    public void setViewport(Location viewport) {
        this.viewport = viewport;
    }
     @Override
    public String toString() {
        return "Geometry {" +
                "location=" + location.toString() +
                ", locationType='" + locationType + '\'' +
                ", viewport='" + viewport.toString() + '\'' +
                '}';
    }
   
}
