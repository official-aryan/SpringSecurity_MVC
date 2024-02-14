package com.example.SpringSecurity_.Controller;

import com.example.SpringSecurity_.Payload.Banking_details_DTO;
import com.example.SpringSecurity_.Service.Banki_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class Bank_Controller {

    @Autowired
    public Banki_Service ser;

    @PreAuthorize("hasRole('ADMIN')")
@PostMapping
// http://localhost:8080/api/bank
    public ResponseEntity<Banking_details_DTO> save(@RequestBody Banking_details_DTO bankingDetailsDto)
{
    Banking_details_DTO bankingDetailsDto1 = ser.saveData(bankingDetailsDto);
    return new ResponseEntity<>(bankingDetailsDto1, HttpStatus.CREATED);
}
    @PreAuthorize("hasRole('ADMIN')")
@GetMapping
// http://localhost:8080/api/bank
    public ResponseEntity<?> get()
{
    List<Banking_details_DTO> data = ser.getData();
    return new ResponseEntity<>(data,HttpStatus.OK);
}

    @PreAuthorize("hasRole('ADMIN')")
@DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id)
{
    ser.delete(id);
    return new ResponseEntity<>("This data is deleted at "+id, HttpStatus.OK);
}

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Banking_details_DTO bankingDetailsDto, @RequestParam("id") int id)
{
    Banking_details_DTO update = ser.update(bankingDetailsDto, id);
    return new ResponseEntity<>(update,HttpStatus.OK);
}

}
