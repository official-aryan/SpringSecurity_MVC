package com.example.SpringSecurity_.Service;

import com.example.SpringSecurity_.Entity.Banking_details;
import com.example.SpringSecurity_.Payload.Banking_details_DTO;
import com.example.SpringSecurity_.Repository.Bank_Repository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Banki_Service {

    @Autowired
    public Bank_Repository repo;
    @Autowired
    public ModelMapper modelMapper;

    public Banking_details maptoentity(Banking_details_DTO bankingDetailsDto)
    {
        Banking_details map = modelMapper.map(bankingDetailsDto, Banking_details.class);
        return map;
    }

    public Banking_details_DTO maptodto(Banking_details bankingDetails)
    {
        Banking_details_DTO dto = modelMapper.map(bankingDetails, Banking_details_DTO.class);
        return dto;
    }


    public Banking_details_DTO saveData(Banking_details_DTO bankingDetailsDto) {

        Banking_details maptoentity = maptoentity(bankingDetailsDto);
        Banking_details save = repo.save(maptoentity);
        Banking_details_DTO maptodto = maptodto(save);
        return maptodto;


    }

    public List<Banking_details_DTO> getData(  )

    {
        List<Banking_details> all = repo.findAll();
        List<Banking_details_DTO> collect = all.stream().map(r -> maptodto(r)).collect(Collectors.toList());
        return collect;

    }

    public void delete(int id)

    {
      repo.deleteById(id);
    }

    public Banking_details_DTO update(Banking_details_DTO bankingDetailsDto, int id)

    {
        Banking_details bankingDetails = repo.findById(id).get();
        Banking_details maptoentity = maptoentity(bankingDetailsDto);
        Banking_details save = repo.save(maptoentity);
        Banking_details_DTO maptodto = maptodto(save);
        return maptodto;
    }
}
