package com.driver;


import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        RWOnly obj = new RWOnly();

        obj.setName("name");
        System.out.println(obj.getName());
    }
}