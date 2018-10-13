/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午11:03:19
*/

package abstractFactory;

import simplyFactory.CPU;
import simplyFactory.Computer;
import simplyFactory.MainBoard;
import simplyFactory.Memory;

public class ComputerEngineer
{
	private CPU cpu = null;
	private MainBoard mainBoard = null;
	private Memory memory = null;

	public Computer computer = null;

	public Computer makeComputer(AbstractFactory af,String memorySize)
	{
		/**
		 * 组装机器的基本步骤
		 */
		// 1:首先准备好装机所需要的配件
        prepareHardwares(af,memorySize,false,null);
		// 2:组装机器
		computer = new Computer(cpu, mainBoard, memory);
		// 3:测试机器
		System.out.print(computer);
		// 4：交付客户
		return computer;
	}

	public Computer makeComputer(AbstractFactory af,String memorySize,
			String memoryCompany)
	{
		/**
		 * 组装机器的基本步骤
		 */
		// 1:首先准备好装机所需要的配件
        prepareHardwares(af,memorySize,true,memoryCompany);
		// 2:组装机器
		computer = new Computer(cpu, mainBoard, memory);
		// 3:测试机器
		System.out.print(computer);
		// 4：交付客户
		return computer;
	}

	private void prepareHardwares(AbstractFactory af, String memorySize, Boolean memoryCompanyIsHere,
			String memoryCompany)
	{
		// 这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
		// 可是，装机工程师并不知道如何去创建，怎么办呢？

		// 直接找相应的工厂获取
		cpu = af.createCPU();
		mainBoard = af.createMainBoard();

		if (memoryCompanyIsHere)
		{
			memory = new Memory(memorySize, memoryCompany);
		} else
		{
			memory = new Memory(memorySize);
		}
	}
}