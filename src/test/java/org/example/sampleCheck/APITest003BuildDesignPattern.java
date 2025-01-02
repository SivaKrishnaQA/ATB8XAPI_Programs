package org.example.sampleCheck;

public class APITest003NoBuildDesignPattern {
    // TODO: Implement the test case without using the Builder design pattern

    public void TestCase01(){
        System.out.println("Im From Test Case 1");
    }public void TestCase02(){
        System.out.println("Im From Test Case 2");
    }public void TestCase03(){
        System.out.println("Im From Test Case 3");
    }


    public static void main(String[] args) {
        APITest003NoBuildDesignPattern dp =new APITest003NoBuildDesignPattern();
        //dp.TestCase01().TestCase02().TestCase03();
        // to overcome this error we use the Builder design pattern
        dp.TestCase01();
        dp.TestCase02();
        dp.TestCase03();
    }
}
