/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午9:12:38
*/

package simplyFactory;

public class Client
{
	public static void main(String[] args)
	{
		ComputerEngineer cf = new ComputerEngineer();
		Computer interComputer = cf.makeComputer("inter", 755, "8G");
		Computer amdComputer=cf.makeComputer("AMD", 255, "4G", "海盗船");
	}
}
