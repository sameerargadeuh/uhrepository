/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.serviceimpl;

import com.unityhealth.getgeocodes.dao.IAddressDao;
import com.unityhealth.getgeocodes.daoimpl.AddressDaoImpl;
import com.unityhealth.getgeocodes.domain.AddressEntity;
import com.unityhealth.getgeocodes.model.GeoCodes;
import com.unityhealth.getgeocodes.service.IAddressService;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Sameer S Argade
 */
public class AddressServiceImpl implements IAddressService {

    RestTemplate restTemplate;
    IAddressDao addressDao;
    private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

    public AddressServiceImpl() {
        restTemplate = new RestTemplate();
        addressDao = new AddressDaoImpl();
    }

    @Override
    public void releasePC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGeoCodes(List<AddressEntity> addresses) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        addressDao.beginTransaction();
        for (AddressEntity address : addresses) {
            addressDao.update(address);
        }
        addressDao.commitTransaction();
    }

    @Override
    public List<AddressEntity> retrieveAddresses() {
        List<AddressEntity> addresses = addressDao.readByNameDQueryNoParam("AddressEntity.findAllGeocodes");
        List<AddressEntity> addressesToBeGeoCoded = new ArrayList<AddressEntity>();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (AddressEntity address : addresses) {
            GeoCodes geoCodes = getCodesFromAddress(address);
            if (geoCodes.getStatus().equals("OK")) {
                address.setLat(geoCodes.getResults()[0].getGeometry().getLocation().getLat());
                address.setLng(geoCodes.getResults()[0].getGeometry().getLocation().getLng());
                address.setGooglePlaceId(geoCodes.getResults()[0].getPlaceId());
                addressesToBeGeoCoded.add(address);
            }
        }
        return addressesToBeGeoCoded;
    }

    @Override
    public GeoCodes getCodesFromAddress(AddressEntity address) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String gMapsUrl = "https://maps.googleapis.com/maps/api/geocode/json?address=" + address.getVLocAddress1().replace(" ", "+") + "&key=AIzaSyBvSDv1tnjPUBK1ccHnhBxY02KpGcM6J6o";
        GeoCodes geoCodes = restTemplate.getForObject(gMapsUrl, GeoCodes.class);
        if (geoCodes.getStatus().equals("OK")) {
            log.info(geoCodes.toString());
            log.info("The Geocode of our interest" + geoCodes.getResults()[0].getGeometry().getLocation().toString());
        }
        return geoCodes;
    }

}
