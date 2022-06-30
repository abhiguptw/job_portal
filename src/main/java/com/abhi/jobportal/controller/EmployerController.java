package com.abhi.jobportal.controller;

import com.abhi.jobportal.Entity.Employer;
import com.abhi.jobportal.modal.EmployerDto;
import com.abhi.jobportal.modal.UserDto;
import com.abhi.jobportal.service.EmployerService;
import com.abhi.jobportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployerController {

    @Autowired
    private EmployerService employerService;


    @GetMapping("/getAllEmployer")
    public ResponseEntity<List<EmployerDto>> getAllEmployer() {
        List<EmployerDto> allEmployers = this.employerService.getAllEmployer();
        return new ResponseEntity<>(allEmployers, HttpStatus.OK);
    }

//    public Employer getEmployer(){
//        return this.employerService.getEmloyer(Id)
//    }

    @PostMapping("/createEmployer")
    public ResponseEntity<EmployerDto> createUser(@RequestBody EmployerDto employerDto){
        EmployerDto createEmployerDto = this.employerService.createEmployer(employerDto);
        return new ResponseEntity<>(createEmployerDto, HttpStatus.CREATED);
    }

}
