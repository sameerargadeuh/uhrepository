/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.service;

import com.unityhealth.getgeocodes.domain.AddressEntity;
import com.unityhealth.getgeocodes.model.GeoCodes;
import java.util.List;

/**
 *
 * @author Clinton
 */
public interface IAddressService extends IUHService{
    
    public void saveGeoCodes(List<AddressEntity> addresses);
    public List<AddressEntity> retrieveAddresses();
    public GeoCodes getCodesFromAddress(AddressEntity address);
    
}
