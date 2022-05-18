package com.example.gihan.CRUD.APP.service;

import com.example.gihan.CRUD.APP.entity.Product;
import com.example.gihan.CRUD.APP.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> product){
        return repository.saveAll(product);
    }



    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product removed " + id ;
    }

    /* TODO
    *
    * */

}
