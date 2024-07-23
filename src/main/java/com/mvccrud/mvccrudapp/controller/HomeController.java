package com.mvccrud.mvccrudapp.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mvccrud.mvccrudapp.entity.laptop;
import com.mvccrud.mvccrudapp.repository.LaptopRepository;

import jakarta.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    private LaptopRepository laptopRepository;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    // api to open register form
    @GetMapping("/register")
    public String register() {

        return "register";
    }

    @ResponseBody
    @PostMapping("/saveLaptopData")
    
    public String saveData( @Valid @RequestParam("id") int id, @RequestParam("brand") String brand,
            @RequestParam("price") int price) {
        laptop lap = new laptop(id,brand,price);
        
        // lap.setId(id);
        // lap.setBrand(brand);
        // lap.setPrice(price);
        laptopRepository.save(lap);
        return "Data saved successfully";
    }
    // Get single record by id
    @GetMapping("/getSingleLaptop/{id}")
    @ResponseBody
    public String getSingleRecord(@PathVariable int id  ,javax.servlet.http.HttpSession session){
     Optional<laptop> findById = laptopRepository.findById(id);
        laptop lap=findById.get();
          session.setAttribute("lap", lap);  
        return "showSingleData";
    }

    
}
