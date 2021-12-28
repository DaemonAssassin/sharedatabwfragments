package com.gmail.mateendev3.sharedatabwfragments.model;

//POJO class
public class Student {

    //declaring members
    private final String name;
    private final short rollNo;
    private final String mobileNo;

    //public constructor
    public Student(String name, short rollNo, String mobileNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.mobileNo = mobileNo;
    }

    //getters
    public String getName() {
        return name;
    }

    public short getRollNo() {
        return rollNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    //toString

    @Override
    public String toString() {
        return "name: " + name + "\nroll no: " + rollNo + "\nmobile no: " + mobileNo;
    }
}
