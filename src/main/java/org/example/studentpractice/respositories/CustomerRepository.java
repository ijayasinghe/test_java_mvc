package org.example.studentpractice.respositories;

import org.example.studentpractice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// this is the interface which communicated with the database
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findCustomerById(long kw);
}
