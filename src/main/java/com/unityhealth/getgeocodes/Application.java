package com.unityhealth.getgeocodes;



import com.unityhealth.getgeocodes.model.GeoCodes;
import com.unityhealth.getgeocodes.serviceimpl.AddressServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clinton
 */
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        AddressServiceImpl addressService = new AddressServiceImpl();
        //RestTemplate restTemplate = new RestTemplate();
        //Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        //log.info(quote.toString());
        //GeoCodes geoCodes = restTemplate.getForObject("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyBvSDv1tnjPUBK1ccHnhBxY02KpGcM6J6o",GeoCodes.class);
       addressService.saveGeoCodes(addressService.retrieveAddresses());
    }

}
