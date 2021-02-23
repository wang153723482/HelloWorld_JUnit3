package com.wangc.day1;

import java.lang.reflect.Method;

/**
 * Created by wangc on 2021/2/23.
 *
 * @author wangc
 * 
 * 对测试类的要求有：1.方法名以test为前缀，2.方法必须为public，返回值为void
 */
public class MyUnit3 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName(args[0]);//args[0]获取运行参数，假定第一个运行参数即为需要执行的测试类。并加载该类
        Object o = c.newInstance();
        Method[] methods = c.getMethods();//获取所有方法，然后遍历得到符合要求的方法，通过invoke()执行
        for(Method m :methods){
            if(isTestMethod(m)){
                m.invoke(o);
            }
        }
    }

    private static boolean isTestMethod(Method m){
        String methodName = m.getName();
        int modifier = m.getModifiers();
        Class returnType = m.getReturnType();

        if( !methodName.startsWith("test") ){
            return false; //如果不是test开头，则返回false
        }else if( 1!=modifier ){
            return false;//如果不是public的，返回false
        }else if( !returnType.equals(Void.TYPE)){
            return false;//如果方法不是void，返回false
        }else{
            return true;
        }

//        上面的一串if else可以简写成
//        return methodName.startsWith("test") && 1==modifier && returnType.equals(Void.TYPE);
    }
}
