package com.lld.design.creational.builder;

public class App {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setEmpId(123)
                .setName("Kamlendra Bharti")
                .setMobileNumber("9718871158")
                .build();
        System.out.println(employee);
    }
}
