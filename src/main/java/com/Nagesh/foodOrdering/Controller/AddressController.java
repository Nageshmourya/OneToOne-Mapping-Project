package com.Nagesh.foodOrdering.Controller;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AddressController {
    @Autowired
    AddressService adService;
    @PostMapping("Insert/Add")
    public  String saveAdd(@RequestBody Address add){
        return adService.saveAdd(add);
    }
    @GetMapping("Show/All/Address")
    public List<Address> giveadd()
    {
        return adService.giveadd();
    }

    @DeleteMapping("Delete/all/records/After/Deletion/of/EmpRecods/OneToOne/Mapping")   // we can't delete records of address becouse  foregin key contn &
    public String rem(){                     //Address table id Independent but Emp table is dependent on address
        return adService.rem();
    }
    @PutMapping("Update/AddressName/By/{addId}/{addName}")
    public String changeAdd(@PathVariable Integer addId,@PathVariable String addName)
    {
        return adService.changeAdd(addId,addName);
    }
    @GetMapping("Get/Address/By/{addId}")
    public  Address giveAdd(@PathVariable Integer addId)
    {
        return adService.giveAdd(addId);
    }
}
