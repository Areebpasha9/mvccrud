package com.mvccrud.mvccrudapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "laptopdata")
public class laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotEmpty(message = "Id can not be Empty")
    private int id;
    @NotEmpty(message = "Please enter appropiate brand")
    private String brand;
    @NotEmpty(message = "Laptop price cannot be blank")
    @Min(value = 20000,message = "Laptop price cannot be <20000")
    private int price;

    
}
