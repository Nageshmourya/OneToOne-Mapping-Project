package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
    List<Emp> findByadd(Address add);
}
