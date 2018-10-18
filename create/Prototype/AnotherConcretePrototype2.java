/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午9:49:52
*/ 

package Prototype;

public class AnotherConcretePrototype2 implements AnotherPrototype
{
	private String name;

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setName(String name)
	{
		this.name=name;
	}
	
	public AnotherPrototype clone()
	{
		AnotherPrototype anotherPrototype  = new AnotherConcretePrototype2();
		anotherPrototype.setName(this.name);
		return anotherPrototype ;
	}

}
