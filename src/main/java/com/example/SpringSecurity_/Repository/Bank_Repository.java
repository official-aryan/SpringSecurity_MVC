package com.example.SpringSecurity_.Repository;

import com.example.SpringSecurity_.Entity.Banking_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bank_Repository extends JpaRepository<Banking_details,Integer> {
}
