package cz.cvut.fit.tvj.eshop.dao;

import cz.cvut.fit.tvj.eshop.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {

    boolean existsByUsername(String username);
}
