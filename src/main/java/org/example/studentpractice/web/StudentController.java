package org.example.studentpractice.web;

import lombok.AllArgsConstructor;
import org.example.studentpractice.entities.Customer;
import org.example.studentpractice.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path="/index")
    public String customers(Model model,@RequestParam(name="keyword",defaultValue = "")String keyword){
        List<Customer> students;

        if(keyword.isEmpty()){
            students=customerRepository.findAll();
        }
        else{
            long key = Long.parseLong(keyword);
            students = customerRepository.findCustomerById(key);

        }
        model.addAttribute("listStudents",students);

        return "customers";
    }

    @GetMapping("/delete")
    public String delete(Long id){
        customerRepository.deleteById(id);

        return "redirect:/index";
    }



}
