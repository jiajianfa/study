package stu.reflectTest;
public class Student {  
  
    /** 
     * 学号 
     */  
    private String stuId ;  
      
    /** 
     * 学号 
     */  
    public String STUID;  
      
    /** 
     * 姓名 
     */  
    private String name ;  
      
    /** 
     * 姓名 
     */  
    public String NAME;  
  
    /** 
     * 年龄 
     */  
    private int age;  
      
    /** 
     * 年龄 
     */  
    public int AGE;  
      
    /** 
     * 班级 
     */  
    private String classid;  
      
  
  
      
    public String getStuId() {  
        return stuId;  
    }  
  
    public void setStuId(String stuId) {  
        this.stuId = stuId;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public String getClassid() {  
        return classid;  
    }  
  
    public void setClassid(String classid) {  
        this.classid = classid;  
    }  
      
      
    /** 
     * 输出学生信息 
     */  
    public void getInfo(){  
        System.out.println("学生信息：\n学号："+stuId+"\t姓名："+name+"\t年龄："+age+"\t班级："+classid);  
    }  
      
    /** 
     * 构造函数 
     */  
    public Student(){  
        init();  
    }  
      
      
    /** 
     * 私有初始化方法 
     */  
    private void init(){  
        this.name = "张三";  
        this.stuId ="1001";  
        this.age = 14;  
        this.classid = "A001";  
        this.NAME = name;  
        this.AGE = age;  
        this.STUID = stuId;  
    }  
      
}