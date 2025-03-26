package com.fullstack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    @Size(min = 2, message = "Name should be atleast 2 characters")
    private String custName;

    private double custAccBalance;

    @Range(min = 1000000000, max = 9999999999L, message = "Contact Number Must be 10 Digit")
    private long custContactNumber;


}
