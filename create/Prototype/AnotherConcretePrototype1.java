/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午9:49:37
*/ 

package Prototype;

public class AnotherConcretePrototype1 implements AnotherPrototype
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

	@Override
	public AnotherPrototype clone()
	{
		AnotherConcretePrototype1 a = new AnotherConcretePrototype1();
		a.setName(this.name);
		return a;
	}
}
