package com.sorry.jcoffe.Debug.ClassLoader;



import com.sorry.jcoffe.Utils.Class2Bytes.TransforBytes;

import java.io.IOException;
import java.lang.reflect.Method;

public class CustomClassLoader extends ClassLoader{


    public static String testClassName = "com.sorry.jcoffe.Debug.Reflection.Person";
    public byte[] testClassBytes;

    {
        try {
            testClassBytes = TransforBytes.BytesFromFile("/Users/0x22cb7139/programing/java/spring/JCoffe/target/classes/com/sorry/jcoffe/Debug/Reflection/Person.class");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        // 只处理给定的类
        if (name.equals(testClassName)) {
            // 调用JVM的native方法定义类
            return defineClass(testClassName, testClassBytes, 0, testClassBytes.length);
        }

        return super.findClass(name);
    }

    public static void main(String[] args) {

        CustomClassLoader customClassLoader = new CustomClassLoader();
        try{
            //自定义类加载器加载
            Class clazz = customClassLoader.loadClass(testClassName);
            //反射实例化
            Object obj = clazz.newInstance();
            //反射取方法
            //getMethod和getDeclaredMethod都能够获取到类成员方法
            //区别在于getMethod只能获取到当前类和父类的所有有权限的方法(如：public)
            //而getDeclaredMethod能获取到当前类的所有成员方法(不包含父类)。
            Method method1 = obj.getClass().getDeclaredMethod("setName",String.class);
            Method method2 = obj.getClass().getDeclaredMethod("getName");
            //关闭安全检查,取非public方法时使用.
            method1.setAccessible(true);
            method2.setAccessible(true);
            //反射调用方法
            method1.invoke(obj,"fuck u internet");
            String result = (String) method2.invoke(obj);
            System.out.println(result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
