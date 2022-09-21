package com.kb.lld.design.creational.builder;

public class EmployeeBuilder {
    private int empId;
    private String name;
    private String address;
    private String mobileNumber;

    public EmployeeBuilder setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Employee build(){
        return new Employee(this.empId,this.name, this.address, this.mobileNumber);
    }
}
