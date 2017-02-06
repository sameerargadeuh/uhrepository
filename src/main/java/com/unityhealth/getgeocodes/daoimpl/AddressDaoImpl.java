/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.daoimpl;

import com.unityhealth.getgeocodes.dao.IAddressDao;
import com.unityhealth.getgeocodes.domain.AddressEntity;

/**
 *
 * @author Clinton
 */
public class AddressDaoImpl extends GenericDaoImpl<AddressEntity> implements IAddressDao {
    
    public AddressDaoImpl(){
        super(AddressEntity.class);
    }
    
}
