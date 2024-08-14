package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="tax_id", nullable = false)
    private Long taxId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String fatherName;

    private String motherName;

    private LocalDate dob;

    public Person() {}

    public Person(Long taxId, String firstName, String lastName) {
        super();
        this.taxId = taxId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getTaxId() {
        return taxId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setTax_id(Long taxId) {
        this.taxId = taxId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
