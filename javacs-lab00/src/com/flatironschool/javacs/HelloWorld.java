package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        System.out.println(System.getProperty("MyJava"));
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    getVersion();
    }
}
