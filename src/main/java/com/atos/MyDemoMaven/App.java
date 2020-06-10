package com.atos.MyDemoMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext ctx=null;
ctx=new ClassPathXmlApplicationContext("a.xml");

System.out.println(ctx.getBean("emp"));
  System.out.println("modified");      

    }
}
