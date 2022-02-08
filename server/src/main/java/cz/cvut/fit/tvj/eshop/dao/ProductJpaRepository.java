package cz.cvut.fit.tvj.eshop.dao;

import cz.cvut.fit.tvj.eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Long> {

}
