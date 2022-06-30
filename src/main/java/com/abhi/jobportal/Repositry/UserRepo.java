package com.abhi.jobportal.Repositry;

import com.abhi.jobportal.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
