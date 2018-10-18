/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午8:48:01
*/ 

package Prototype;

import java.util.Date;

public class ConcretePrototype2 implements Prototype
{
	private Date date;
	public ConcretePrototype2()
	{
		date=new Date();
	}
	
	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Prototype clone()
	{
		Prototype prototype = new ConcretePrototype2();
		return prototype;
	}
}
