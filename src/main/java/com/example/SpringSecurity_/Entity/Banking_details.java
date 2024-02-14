package com.example.SpringSecurity_.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Banking_cred")
public class Banking_details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Customer_name;
    private String Bank_Accountno;
    private String Password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getBank_Accountno() {
        return Bank_Accountno;
    }

    public void setBank_Accountno(String bank_Accountno) {
        Bank_Accountno = bank_Accountno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
