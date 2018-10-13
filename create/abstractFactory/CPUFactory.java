/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午8:46:16
*/

package abstractFactory;

public class CPUFactory
{
	public static CPU createCPU(String company, int pins)
	{
		CPU cpu = null;
		if (company.toLowerCase().equals("inter"))
		{
			cpu = new InterCPU(pins);
		} else if (company.toLowerCase().equals("amd"))
		{
			cpu = new AmdCPU(pins);
		} else
		{
			return null;
		}
		return cpu;
	}
}