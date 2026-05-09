package com.app.ecom.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role = UserRole.CUSTOMER;


    // OTO connection between the user and address any changes in user it will update in address if user deleted address also deleted
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    //Automatically sets the creation time when the record is first saved by the Hibernate.
    @CreationTimestamp
    private LocalDateTime createdAt;

    //Automatically updates the last modified time whenever the record is updated by the Hibernate.
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
