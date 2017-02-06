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
public class AddressComponents {

    private String longName;
    private String shortName;
    private String[] types;

    /**
     * @return the longName
     */
    @JsonProperty("long_name")
    public String getLongName() {
        return longName;
    }

    /**
     * @param longName the longName to set
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * @return the shortName
     */
    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @return the types
     */
    @JsonProperty("types")
    public String[] getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(String[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "AddressComponents {"
                + "longName=" + longName
                + ", shortName='" + shortName + '\''
                + ", types=[" + printTypes() + "]";

    }

    private String printTypes() {
        StringBuilder printableTypes = new StringBuilder();
         printableTypes.append("{'\\''");
        for (String type : types) {
            printableTypes.append(type);
             printableTypes.append(",");
        }
        printableTypes.append("'\\''}");
        return printableTypes.toString();
    }

}
