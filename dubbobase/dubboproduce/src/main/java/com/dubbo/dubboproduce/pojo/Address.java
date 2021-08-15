package com.dubbo.dubboproduce.pojo;

/**
 * @Author : JJZheng
 * @create 2021/8/10 22:46
 */

public class Address {
    private String name;
    private String peopleName;
    private String dog;

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", peopleName='" + peopleName + '\'' +
                ", dog='" + dog + '\'' +
                '}';
    }

    public Address(String name, String peopleName, String dog) {
        this.name = name;
        this.peopleName = peopleName;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }



}
