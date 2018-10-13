/** @version: 1.1
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午6:19:36
* 
* 1.1 修改接口方法
*/

package abstractFactory;

public class AmdCPU implements CPU
{
	private int pins = 0;

	public AmdCPU(int pins)
	{
		super();
		this.pins = pins;
	}

	@Override
	public String calulate()
	{
		return "AMD CPU，针脚数：" + pins + "\n";
	}

}
