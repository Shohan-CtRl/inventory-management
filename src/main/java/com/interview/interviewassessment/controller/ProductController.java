package com.interview.interviewassessment.controller;

import com.interview.interviewassessment.model.Product;
import com.interview.interviewassessment.repository.IProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController{
    private final IProductRepository productRepository;
    // Controller to initialize the productRepository object
    public ProductController(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    // Fetches all product Rows
    @RequestMapping(value = "GetAllProduct", method = RequestMethod.GET)
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok( this.productRepository.findAll());

    }
    // Creates new product Row
    @RequestMapping(value = "createProduct", method = RequestMethod.POST)
    public ResponseEntity createProduct(@RequestBody Product product){
        return ResponseEntity.ok( this.productRepository.save(product));
    }
    // Delete product row
    @RequestMapping(value = "deleteProduct", method = RequestMethod.DELETE)
    public Object deleteProduct(@RequestBody Product product){
        Product existingProduct = this.productRepository.findById(product.getId()).orElse(null);
        if(existingProduct.equals(null)){
            return ResponseEntity.notFound().build();
        }
        this.productRepository.deleteById(existingProduct.getId());
        return ResponseEntity.ok().build();
    }

    // Updates product Row
    @RequestMapping(value = "UpdateProduct", method = RequestMethod.PUT)
    public ResponseEntity UpdateProduct(@RequestBody Product product){
        Product existingProduct = this.productRepository.findById(product.getId()).orElse(null);
        if(!existingProduct.equals(null)){
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getName());
            existingProduct.setReorderPoint(product.getReorderPoint());
            existingProduct.setTotalUnitsSold(product.getTotalUnitsSold());
            existingProduct.setCurrentStockLevel(product.getCurrentStockLevel());
            return ResponseEntity.ok( this.productRepository.save(product));
        }
        return ResponseEntity.notFound().build();

    }

}
