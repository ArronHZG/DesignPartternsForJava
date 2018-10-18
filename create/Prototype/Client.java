/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午8:51:55
*/

package Prototype;

public class Client
{
	private Prototype prototype;

	public Client(Prototype prototype)
	{
		super();
		this.prototype = prototype;
	}

	public Prototype getPrototype()
	{
		return prototype;
	}

	public void setPrototype(Prototype prototype)
	{
		this.prototype = prototype;
	}

	public Prototype Operation()
	{
		Prototype copyPrototype = prototype.clone();
		return copyPrototype;
	}

	public static void main(String[] args)
	{
		ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
		ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
		Client client = new Client(concretePrototype2);
		ConcretePrototype2 prototype = (ConcretePrototype2) client.Operation();
		System.out.println(concretePrototype2);
		System.out.println(prototype);
		System.out.println(concretePrototype2.getDate().hashCode());
		System.out.println(prototype.getDate().hashCode());
		Client client1 = new Client(concretePrototype1);
		ConcretePrototype1 copy1 = (ConcretePrototype1) client1.Operation();
		System.out.println(concretePrototype1);
		System.out.println(copy1);
		System.out.println(concretePrototype1.getArrayDeque().hashCode());
		System.out.println(copy1.getArrayDeque().hashCode());
	}
}
