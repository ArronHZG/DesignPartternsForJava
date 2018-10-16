/** @version: 1.0
* @Description: package Builder; 
* @author: Arron
* @date: 2018年10月16日-下午2:40:18
*/ 

package Builder;

public class ConcreteBuilder implements Builder
{
	private Product product = new Product();

	@Override
	public void buildPart1()
	{
		product.setPart1("编号：9527");
	}

	@Override
	public void buildPart2()
	{
		product.setPart2("名称：笔记本电脑");
	}

	@Override
	public Product retrieveResult()
	{
		return product;
	}
}
