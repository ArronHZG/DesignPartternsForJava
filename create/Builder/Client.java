/** @version: 1.0
* @Description: package Builder; 
* @author: Arron
* @date: 2018年10月16日-下午2:45:56
*/

package Builder;

public class Client
{
	public static void main(String[] args)
	{
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}

}
