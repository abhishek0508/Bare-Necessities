package com.se.cores;

import androidx.annotation.NonNull;

class Customer {
    private final String name;
    private final String email;
    private final String password;
    private final String phoneNumber;

    Customer(@NonNull CustomerBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}

class CustomerBuilder {
    String name;
    String phoneNumber;
    String email;
    String password;

    public CustomerBuilder() {}

    CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    CustomerBuilder setPhoneNumber(String phone) {
        this.phoneNumber = phone;
        return this;
    }

    CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    CustomerBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Customer build() {
        Customer customer = new Customer(this);
        validateUserObject(customer);
        return customer;
    }

    private void validateUserObject(Customer customer) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}