package com.kb.lld.design.creational.builder;

public class Employee {
    private int empId;
    private String name;
    private String address;
    private String mobileNumber;

    public Employee(int empId, String name, String address, String mobileNumber) {
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
