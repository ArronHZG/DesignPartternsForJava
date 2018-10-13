/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午10:58:13
*/ 

package abstractFactory;

import simplyFactory.CPU;
import simplyFactory.InterBoard;
import simplyFactory.InterCPU;
import simplyFactory.MainBoard;

public class IntelFactory implements AbstractFactory
{

	@Override
	public CPU createCPU()
	{
		return new InterCPU(755);
	}

	@Override
	public MainBoard createMainBoard()
	{
		return new InterBoard(755);
	}
}
