package com.freedom.prototype;
/*
 * 原型模式的思想:
 * 用原型实例指定创建对象的种类，并通过复制、克隆这些原型创建新的对象。
 * 在JDK中复制对象就是通过clone()实现的。
 * 一个原型类，只需要实现Cloneable接口，覆写clone方法，此处clone方法可以改成任意的名称，
 * 因为Cloneable接口是个空接口，你可以任意定义实现类的方法名，如cloneA或者cloneB，
 * 因为此处的重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，
 * 而在Object类中，clone()是native的，具体怎么实现，此处不深究。
 */
public class Prototype implements Cloneable {  
	
	/*
	 * 实现Cloneable接口。
	 * Cloneable接口的作用:
	 * 在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
	 * 在java虚拟机中，只有实现了这个接口的类才可以被拷贝，
	 * 否则在运行时会抛出CloneNotSupportedException异常。
	 */
	public Object clone() throws CloneNotSupportedException {
		
		/*
		 * 重写Object类中的clone方法。
		 * Java中，所有类的父类都是Object类，Object类中有一个clone方法，
		 * 作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，
		 * 因此，Prototype类需要将clone方法的作用域修改为public类型。
		 */
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	
	public static void main(String[] args) throws Exception{  
        ConcretePrototype cp = new ConcretePrototype();  
        ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
        clonecp.show();  
    } 

}
//Prototype实现类
class ConcretePrototype extends Prototype{  
    public void show(){  
        System.out.println("test Prototype");  
    }  
}  
  
     
