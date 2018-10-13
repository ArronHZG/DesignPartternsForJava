/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午8:57:25
*/

package simplyFactory;

public class Memory
{
	private String size;
	private String company;

	public Memory(String size)
	{
		super();
		this.size = size;
		this.company = "金士顿";
	}

	public Memory(String size, String company)
	{
		super();
		this.size = size;
		this.company = company;
	}

	public String  information()
	{
		return  "该电脑具有" +company+"公司的" + size + "的内存.\n";
	}
}
