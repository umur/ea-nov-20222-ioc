package org.example;

import org.example.annotations.MyAutowired;
import org.example.annotations.MyBean;

@MyBean
public class Employee {

    @MyAutowired
    Address address;
}