package kavi.magicaldewsdemo.controller;


import kavi.magicaldewsdemo.model.ProductModel;
import kavi.magicaldewsdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

//    Add Product

    @PostMapping
    public ProductModel addProduct(@RequestBody ProductModel product) {
        return productService.addProduct(product);
    }

//    Get All Products
    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }

//    Get Product By Id
    @GetMapping("/{id}")
    public Optional<ProductModel> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

//    Delete the product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "Product deleted: " + id;
    }
}
