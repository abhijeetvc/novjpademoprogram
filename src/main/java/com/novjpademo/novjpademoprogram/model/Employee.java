package com.novjpademo.novjpademoprogram.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 50)
    private String firstName;
    @NotNull
    private String city;

    private Double salary;

    @ManyToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name="dept_id")
    @JsonBackReference
    private Department department;

//    @Transient
//    private String department1;
}

