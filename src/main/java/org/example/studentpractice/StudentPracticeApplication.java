package org.example.studentpractice;

import org.example.studentpractice.entities.Customer;
import org.example.studentpractice.respositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class StudentPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentPracticeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Jasper Diaz",1500.00,5,"Savings Delux"));
            customerRepository.save(new Customer(null,"Zanip Mendez",5000.00,2,"Savings delux"));
            customerRepository.save(new Customer(null,"Jok Mendis",6000.00,3,"Savings regular"));

            customerRepository.findAll().forEach(p->{
                System.out.println(p.getCustomerName());
            });
        };
    }

}
