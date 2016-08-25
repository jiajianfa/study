package stu.design.memento;
/**
 * 备忘录类,用于保存value
 * 
 * Memento
 * 
 * lijq
 * 2016年8月1日 下午3:45:44
 * 
 * @version 1.0.0
 *
 */
public class Memento {  
      
    private String value;  
  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}  