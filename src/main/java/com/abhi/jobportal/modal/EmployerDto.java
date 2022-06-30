package com.abhi.jobportal.modal;

public class EmployerDto {
    private long id;
    private String name;
    private String oragranization;
    private String email;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOragranization() {
        return oragranization;
    }

    public void setOragranization(String oragranization) {
        this.oragranization = oragranization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployerDto(long id, String name, String oragranization, String email, String password) {
        this.id = id;
        this.name = name;
        this.oragranization = oragranization;
        this.email = email;
        this.password = password;
    }

    public EmployerDto() {
    }

}
