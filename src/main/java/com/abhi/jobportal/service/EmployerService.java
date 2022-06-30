package com.abhi.jobportal.service;

        import com.abhi.jobportal.modal.EmployerDto;
        import com.abhi.jobportal.modal.UserDto;

        import java.util.List;

public interface EmployerService {

    List<EmployerDto> getAllEmployer();
    EmployerDto createEmployer(EmployerDto employerDto);





}
