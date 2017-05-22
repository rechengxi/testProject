package com.chengxi.test;

/**
 * Created by Administrator on 17-5-22.
 */
public class Main extends Exception
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Main main = new Main();
        InnerClass innerClass =  main.new InnerClass();

        System.out.println(" hello world!"+ innerClass.getName());
    }

    class InnerClass
    {
        public String getName()
        {
            return "张三";
        }
    }

}