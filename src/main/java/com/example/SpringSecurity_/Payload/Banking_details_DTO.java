package com.example.SpringSecurity_.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Banking_details_DTO {

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
