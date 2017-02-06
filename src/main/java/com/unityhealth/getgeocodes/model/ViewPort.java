/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.model;

/**
 *
 * @author Clinton
 */
public class ViewPort {

    private Location northeast;
    private Location sothwest;

    /**
     * @return the northeast
     */
    public Location getNortheast() {
        return northeast;
    }

    /**
     * @param northeast the northeast to set
     */
    public void setNortheast(Location northeast) {
        this.northeast = northeast;
    }

    /**
     * @return the sothwest
     */
    public Location getSothwest() {
        return sothwest;
    }

    /**
     * @param sothwest the sothwest to set
     */
    public void setSothwest(Location sothwest) {
        this.sothwest = sothwest;
    }

}
