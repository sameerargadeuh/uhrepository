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
public class Results {

    private AddressComponents[] addressComponents;
    private String formattedAddress;
    private Geometry geometry;
    private String placeId;
    private String[] types;

    /**
     * @return the addressComponents
     */
    @JsonProperty("address_components")
    public AddressComponents[] getAddressComponents() {
        return addressComponents;
    }

    /**
     * @param addressComponents the addressComponents to set
     */
    public void setAddressComponents(AddressComponents[] addressComponents) {
        this.addressComponents = addressComponents;
    }

    /**
     * @return the formattedAddress
     */
    @JsonProperty("formatted_address")
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * @param formattedAddress the formattedAddress to set
     */
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /**
     * @return the geometry
     */
    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * @param geometry the geometry to set
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return the placeId
     */
    @JsonProperty("place_id")
    public String getPlaceId() {
        return placeId;
    }

    /**
     * @param placeId the placeId to set
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
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
        return "results {" +
                "addressComponents=" + printAddressComponents() +
                ", formattedAddress='" + formattedAddress + '\'' +
                ", geometry='" + geometry.toString() + '\'' +
               ", placeId'" + placeId + '\'' +
                ", types'" + printTypes() + '\'' +
                '}';
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
      private String printAddressComponents() {
        StringBuilder printableAddressComponents = new StringBuilder();
         printableAddressComponents.append("{'\\''");
        for (AddressComponents addressComponent: addressComponents) {
            printableAddressComponents.append(addressComponent.toString());
             printableAddressComponents.append(",");
        }
        printableAddressComponents.append("'\\''}");
        return printableAddressComponents.toString();
    }

}
