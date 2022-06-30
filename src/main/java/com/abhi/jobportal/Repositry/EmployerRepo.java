package com.abhi.jobportal.Repositry;

import com.abhi.jobportal.Entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepo extends JpaRepository<Employer,Long> {
}
