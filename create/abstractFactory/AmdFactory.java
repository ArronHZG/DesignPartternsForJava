/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午11:02:04
*/ 

package abstractFactory;

import simplyFactory.AmdBoard;
import simplyFactory.AmdCPU;
import simplyFactory.CPU;
import simplyFactory.MainBoard;

public class AmdFactory implements AbstractFactory
{

	@Override
	public CPU createCPU()
	{
		return new AmdCPU(938);
	}

	@Override
	public MainBoard createMainBoard()
	{
		return new AmdBoard(938);
	} 

}
