package com.dani.repository;

import com.dani.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
