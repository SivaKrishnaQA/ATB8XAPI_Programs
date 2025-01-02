package org.example.sampleCheck;

public class APITest004_BuildDesignPattern {
    //change return type of each method as class name
    //"this" will always point ro the current /calling Object.
    public APITest004_BuildDesignPattern step1()
    {
        System.out.println("Start step1");
        return this;
    }public APITest004_BuildDesignPattern step2()
    {
        System.out.println("Start step2");
        return this;
    }public APITest004_BuildDesignPattern step3(String name)
    {
        System.out.println("Start step3 " + name);
        return this;
    }

    public static void main(String[] args) {
        APITest004_BuildDesignPattern test = new APITest004_BuildDesignPattern();
        test.step1().step2().step3("Malli");
        System.out.println("BuilderPatternProgram Ends");
    }
}
