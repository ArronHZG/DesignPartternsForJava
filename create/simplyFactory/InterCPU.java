/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午4:37:14
*/

package simplyFactory;

public class InterCPU implements CPU
{
	private int pins = 0;

	public InterCPU(int pins)
	{
		super();
		this.pins = pins;
	}

	@Override
	public String calulate()
	{
		return "Intel CPU，针脚数：" + pins + "\n";
	}
}