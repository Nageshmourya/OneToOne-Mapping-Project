package com.Nagesh.foodOrdering.Service;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Model.Emp;
import com.Nagesh.foodOrdering.Repo.EmpRepo;
import com.Nagesh.foodOrdering.Repo.Irepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    @Autowired
    Irepo addrepo;
    public List<Emp> TellmeEmp() {
        return empRepo.findAll();

    }

    public String saveEmp(Emp em) {
        empRepo.save(em);
        return "Now Save Employee in Database";
    }


    public Address getadd(Integer empId) {
        Emp emp1=empRepo.findById(empId).orElseThrow();
        return emp1.getAdd();
    }

    public List<Emp> getallemp(Integer addId) {
        Address add=addrepo.findById(addId).orElseThrow();
        return empRepo.findByadd(add);
    }

    public String rem() {
        empRepo.deleteAll();
        return "Now Deleted All Records of Emp";
    }

    public String rembyid(Integer empId) {
        empRepo.deleteById(empId);
        return "Now Delete this Id of Employee";
    }
}

