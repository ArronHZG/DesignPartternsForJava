/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午9:12:38
*/

package abstractFactory;

import simplyFactory.Computer;

public class Client
{
	public static void main(String[] args)
	{
		ComputerEngineer cf = new ComputerEngineer();
		Computer interComputer = cf.makeComputer(new IntelFactory(), "8G");
		Computer amdCompute = cf.makeComputer(new AmdFactory(), "4G", "海盗船");
	}
}