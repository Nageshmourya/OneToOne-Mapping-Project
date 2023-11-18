package com.Nagesh.foodOrdering.Controller;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Model.Emp;
import com.Nagesh.foodOrdering.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpControlller {
    @Autowired
    EmpService empService;
    @GetMapping("Find/all/emp")
    public List<Emp> TellmeEmp()
    {
        return empService.TellmeEmp();
    }
    @PostMapping("Insert/Emp/with/addId/After/Address/Insertion")
    public String saveEmp( @RequestBody Emp em){
        return empService.saveEmp(em);
    }
    @GetMapping("Address/by/{empId}/EmpId")
    public Address getadd(@PathVariable Integer empId)
    {
        return empService.getadd(empId);
    }

    @GetMapping("Employee/By/{addId}/")
    public List<Emp> getallemp( @PathVariable Integer addId)
    {
        return empService.getallemp(addId);
    }
    @DeleteMapping(" Delete/By/{empId}")
    public String rembyid(@PathVariable Integer empId){
        return empService.rembyid(empId);
    }
    @DeleteMapping("Delete/All/Records")
    public String rem()
    {
        return empService.rem();
    }

}
