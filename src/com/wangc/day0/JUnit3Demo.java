package com.wangc.day0;

import junit.framework.TestCase;

/**
 * Created by wangc on 2021/2/23.
 *
 * @author wangc
 * 
 * 一个简单的对JUnit3的应用
 * 
 * 关键点有：1.必须集成TestCase，2.方法名以test为前缀，非test前缀需要在执行时指定方法名，3.方法必须为public，返回值为void
 * 
 * 编译 javac 
 */
public class JUnit3Demo extends TestCase {

    public void testAdd1(){
        System.out.println("this is testAdd1");
    }

    public void testAdd2(){
        System.out.println("this is testAdd2");
    }
    
}
