package com.Nagesh.foodOrdering.Service;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Repo.Irepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    Irepo iRepo;
    public String saveAdd(Address add) {
        iRepo.save(add);
        return"Now Added";
    }


    public List<Address> giveadd() {
        return iRepo.findAll();
    }

    public String rem() {
        iRepo.deleteAll();
        return "All Recods of Address are Deleted Now SuccessFully";
    }

    public String changeAdd(Integer addId,String addName) {
        Address ad1=iRepo.findById(addId).orElseThrow();
        ad1.setAddName(addName);
        iRepo.save(ad1);
        return "Now AddressName is update ";
    }

    public Address giveAdd(Integer addId) {
        return iRepo.findById(addId).orElseThrow();
    }
}
