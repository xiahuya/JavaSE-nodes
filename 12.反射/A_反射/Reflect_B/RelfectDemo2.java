package com.xiahu.Reflect_B;

import java.lang.reflect.Constructor;

/*
 * 
 * 需求：通过反射去获取该构造方法并使用：
 * public Person(String name, int age, String address)
 * 
 * Person p = new Person("林青霞",27,"北京");
 * System.out.println(p);
 */
public class RelfectDemo2 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c = Class.forName("com.xiahu.Reflect_A.Person");
		
		//获取单个构造方法
		Constructor constructor = c.getConstructor(String.class,int.class,String.class);
		
		//实例化构造方法
		Object newInstance = constructor.newInstance("夏虎",21,"湖北武汉");
		System.out.println(newInstance);//Person [name=夏虎, age=21, address=湖北武汉]

	}

}
