package kavi.magicaldewsdemo.service;

import kavi.magicaldewsdemo.model.ProductModel;
import kavi.magicaldewsdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductModel addProduct (ProductModel product){
        return productRepository.save(product);
    }

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<ProductModel> getProductById(int id){
        return productRepository.findById(id);
    }
    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
