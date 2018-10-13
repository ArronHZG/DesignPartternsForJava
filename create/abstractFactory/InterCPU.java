/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午4:37:14
*/

package abstractFactory;

public class InterCPU implements CPU
{
	private int pins = 0;

	public int getPins()
	{
		return pins;
	}

	public void setPins(int pins)
	{
		this.pins = pins;
	}

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
