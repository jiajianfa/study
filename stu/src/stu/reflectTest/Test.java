package stu.reflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射使用
 * 
 * Test
 * 
 * lijq
 * 2016年8月4日 下午5:55:11
 * 
 * @version 1.0.0
 *
 */
public class Test {
	
	/** 
	 * 获取反射类的所有属性字段 
	 *  
	 * @param ownerClass 反射的类 
	 * @return 
	 * @throws Exception 
	 */  
	public Field[] getProperty(Class ownerClass) throws Exception {  
	  
	    //获取该类所有属性字段  
	    //Field[] fields = ownerClass.getFields();//只获取public访问权限的属性字段（包括父类的）  
	    Field[] fields = ownerClass.getDeclaredFields();//只获取该类的所有访问权限的属性（不含父类）  
	      
	    //输出所有属性字段  
	    for(int i=0;i<fields.length;i++){  
	        System.out.println("属性："+fields[i]);  
	    }  
	  
	    return fields;  
	}  
	
	
	/** 
	 * 获取反射类的某个public属性值 
	 *  
	 * @param ownerClass 反射的类 
	 * @param fieldName 属性名 
	 * @return 
	 * @throws Exception 
	 */  
	public Object getProperty(Object owner,String fieldName) throws Exception {  
	      
	    //得到对象所属类  
	    Class ownerClass = owner.getClass();  
	  
	    //获取该类的某个属性  
	    Field field = ownerClass.getField(fieldName);  
	      
	    //获取某个对象的特定属性  
	    Object property = field.get(owner);  
	      
	    //输出该属性信息  
	    System.out.println(fieldName+"的属性值："+property.toString());  
	  
	    return property;  
	  
	}  
	
	
	/** 
	 * 获取反射类的该中的所有方法 
	 * @param ownerClass 反射的类 
	 * @return 
	 * @throws Exception 
	 */  
	public Method[] getMethods(Class ownerClass) throws Exception {  
	  
	    //获取该类所有方法  
	    //Field[] fields = ownerClass.getMethods();//只获取public访问权限的方法（包括父类的）  
	    Method[] methods = ownerClass.getDeclaredMethods();//只获取该类的所有访问权限的方法（不含父类）  
	  
	    //输出所有方法  
	    for(int i=0;i<methods.length;i++){  
	        System.out.println("方法：" +methods[i]);  
	    }  
	  
	    return methods;  
	}  

	/** 
	 * 执行反射类的该中的某个方法 
	 * @param ownerClass 反射的类 
	 * @param methodName 方法名 
	 * @return 
	 * @throws Exception 
	 */  
	public Object invokeMethod(Object owner,String methodName,Object[] args) throws Exception {  
	  
	    //得到对象所属类  
	    Class ownerClass = owner.getClass();  
	  
	    //获取该类的某个方法  
	    Method method = ownerClass.getMethod(methodName, null);  
	      
	    //执行某个对象的方法  
	    Object result = method.invoke(owner, args);  
	      
	    //输出结果信息  
	    System.out.println("结果返回值："+ result);  
	  
	    return result;  
	}  
	
	
	public void refTest(){  
	    String className = "stu.reflectTest.Student";  
	  
	    try {  
	          
	        //通过反射机制，使用类装载器，装载该类  
	        Class<?> stu = Class.forName(className);  
	        Object objStu = stu.newInstance();  
	                  
	          
	        //获取反射类的所有属性  
	        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");  
	        System.out.println("调用 getProperty 方法,获取Student类的所有属性");  
	        getProperty(stu);  
	          
	          
	        //获取反射类的某个属性值  
	        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");  
	        System.out.println("调用 getProperty 方法,获取Student类的NAME属性值");  
	        getProperty(objStu,"NAME");  
	          
	          
	        //获取反射类的所有方法  
	        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");  
	        System.out.println("调用 getMethods 方法,获取Student类的所有方法");  
	        getMethods(stu);  
	          
	        //执行反射类的getInfo方法  
	        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");  
	        System.out.println("调用 invokeMethod 方法,执行Student类的getInfo方法");  
	        invokeMethod(objStu, "getInfo", null);  
	          
	          
	    } catch (Exception e) {  
	        e.printStackTrace();  
	    }  
	}  
	
	public static void main(String[] args) {
		new Test().refTest();
	}

}
