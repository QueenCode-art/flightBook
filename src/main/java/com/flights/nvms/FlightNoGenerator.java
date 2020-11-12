//package com.flights.nvms;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.security.SecureRandom;
//import java.util.Random;
//
//public class FlightNoGenerator {
//    @Autowired
//    public void generateFlightNo(String [] args) {
//        int len = 7;
//        System.out.println(generateFlNo(len));
//    }
//
//    public String generateFlNo(int len){
//        final char[] uppercase = "ABCDEFGHIJKLMNOPQRST".toCharArray();
//        final char[] numbers  = "0123456789".toCharArray();
//        final char[] allAllowed = "ABCDEFGHIJKLMNOPQRST0123456789".toCharArray();
//
//        Random random = new SecureRandom();
//
//        StringBuilder flightNo = new StringBuilder();
//        for (int i = 0; i < len; i++) {
//            flightNo.append(allAllowed[random.nextInt(allAllowed.length)]);
//
//        }
//
//        flightNo.insert(random.nextInt(flightNo.length()), uppercase[random.nextInt(uppercase.length)]);
//        flightNo.insert(random.nextInt(flightNo.length()), numbers[random.nextInt(numbers.length)]);
//
//
//        return flightNo.toString();
//    }
//}
