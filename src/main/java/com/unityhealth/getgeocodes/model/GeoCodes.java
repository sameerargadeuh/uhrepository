/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Clinton
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCodes {
    
    private Results[] results;
   
    private String status;

    /**
     * @return the results
     */
    @JsonProperty("results")
    public Results[] getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(Results[] results) {
        this.results = results;
    }

    /**
     * @return the status
     */
     @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "GeoCodes {" +
                "results=" + results[0].toString() +
                ", status='" + status + '\'' +
                '}';
    }
}
