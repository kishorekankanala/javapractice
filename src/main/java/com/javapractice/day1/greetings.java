package com.javapractice.day1;

public class greetings {
    public static void main(String[] args) {
        String username = "User";
        if (args.length>0){
            username = args[0];
        }
        System.out.println("hi"+username+",\n\twellcom to jsword");
    }
}
