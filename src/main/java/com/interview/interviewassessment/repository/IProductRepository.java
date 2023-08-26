package com.interview.interviewassessment.repository;

import com.interview.interviewassessment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long>{
    // Uses the default CRUD operations provided by JPA for Get, Delete and save functionality.


}
