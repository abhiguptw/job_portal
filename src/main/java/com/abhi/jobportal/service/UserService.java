package com.abhi.jobportal.service;

import com.abhi.jobportal.modal.UserDto;

import java.util.List;

public interface UserService  {

    List <UserDto> getAllUser();
    UserDto createUser(UserDto userDto);

    void deleteUser(Long userId);

    //UserDto updateUser(Long userId);


    UserDto updateUser(UserDto userDto, Long userId);
}
