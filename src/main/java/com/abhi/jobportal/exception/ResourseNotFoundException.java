package com.abhi.jobportal.exception;

public class ResourseNotFoundException extends RuntimeException{
    String resourseName;
    String fieldName;
    Long fieldValue;

    public ResourseNotFoundException(String resourseName,String fieldName,Long fieldValue){
        super(String.format("%s not found with %s",resourseName,fieldName,fieldValue));
        this.resourseName=resourseName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }
}
