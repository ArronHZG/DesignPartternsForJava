/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午9:50:07
*/ 

package Prototype;

public class AnotherClient
{
	 public static void main(String[]args){
	        try{
	        	AnotherPrototype p1 = new AnotherConcretePrototype1();
	        	AnotherPrototypeManager.setPrototype("p1", p1);
	            //获取原型来创建对象
	        	AnotherPrototype p3 = AnotherPrototypeManager.getPrototype("p1").clone();
	            p3.setName("张三");
	            System.out.println("第一个实例：" + p3);
	            //有人动态的切换了实现
	            AnotherPrototype p2 = new AnotherConcretePrototype2();
	            AnotherPrototypeManager.setPrototype("p1", p2);
	            //重新获取原型来创建对象
	            AnotherPrototype p4 = AnotherPrototypeManager.getPrototype("p1").clone();
	            p4.setName("李四");
	            System.out.println("第二个实例：" + p4);
	            //有人注销了这个原型
	            AnotherPrototypeManager.removePrototype("p1");
	            //再次获取原型来创建对象
	            AnotherPrototype p5 = AnotherPrototypeManager.getPrototype("p1").clone();
	            p5.setName("王五");
	            System.out.println("第三个实例：" + p5);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }

}
