package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Irepo extends JpaRepository<Address,Integer>{

}
