package com.abhi.jobportal.ServiceImpl;

import com.abhi.jobportal.Entity.Employer;
import com.abhi.jobportal.Entity.User;
import com.abhi.jobportal.Repositry.EmployerRepo;
import com.abhi.jobportal.modal.EmployerDto;
import com.abhi.jobportal.modal.UserDto;
import com.abhi.jobportal.service.EmployerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployerRepo employerRepo;

    @Override
    public List<EmployerDto> getAllEmployer() {
        List<Employer> employers = this.employerRepo.findAll();
        List<EmployerDto> employerDto = employers.stream().map(employer -> this.employerToDto(employer)).collect(Collectors.toList());
        return employerDto;
    }

    @Override
    public EmployerDto createEmployer(EmployerDto employerDto) {
        Employer employer = dtotoEmployer(employerDto);
        Employer saveEmployer = this.employerRepo.save(employer);
        return this.employerToDto(saveEmployer);
    }

    public Employer dtotoEmployer(EmployerDto employerDto) {
        Employer employer = this.modelMapper.map(employerDto, Employer.class);

        return employer;
    }

    public EmployerDto employerToDto(Employer employer) {
        EmployerDto employerDto = this.modelMapper.map(employer, EmployerDto.class);
        return employerDto;
    }


}
