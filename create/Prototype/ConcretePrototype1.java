/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午8:48:01
*/ 

package Prototype;

import java.util.ArrayDeque;

public class ConcretePrototype1 implements Prototype
{
	private ArrayDeque<Integer> arrayDeque;
	
public ConcretePrototype1()
{
	arrayDeque= new ArrayDeque<>();
	for (int i =0; i<20; i++)
	{
		arrayDeque.add(i);
	}
}

	public ArrayDeque<Integer> getArrayDeque()
{
	return arrayDeque;
}

public void setArrayDeque(ArrayDeque<Integer> arrayDeque)
{
	this.arrayDeque = arrayDeque;
}

	public Prototype clone()
	{
		return this;
	}
}