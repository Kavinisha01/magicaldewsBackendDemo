package kavi.magicaldewsdemo.repository;

import kavi.magicaldewsdemo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductModel, Integer> {

}
