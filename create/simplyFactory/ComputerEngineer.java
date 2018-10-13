/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午9:00:45
*/

package simplyFactory;

public class ComputerEngineer
{
	private CPU cpu = null;
	private MainBoard mainBoard = null;
	private Memory memory = null;

	public Computer computer = null;

	public Computer makeComputer(String company, int pins, String memorySize)
	{
		/**
		 * 组装机器的基本步骤
		 */
		// 1:首先准备好装机所需要的配件
		prepareHardwares(company, pins, memorySize, false, null);
		// 2:组装机器
		computer = new Computer(cpu, mainBoard, memory);
		// 3:测试机器
		System.out.print(computer);
		// 4：交付客户
		return computer;
	}

	public Computer makeComputer(String company, int pins, String memorySize, String memoryCompany)
	{
		/**
		 * 组装机器的基本步骤
		 */
		// 1:首先准备好装机所需要的配件
		prepareHardwares(company, pins, memoryCompany, true, memoryCompany);
		// 2:组装机器
		computer = new Computer(cpu, mainBoard, memory);
		// 3:测试机器
		System.out.print(computer);
		// 4：交付客户
		return computer;
	}

	/**
	 * @param company
	 * @param pins
	 * @param memorySize
	 * @param memoryCompanyIsHere
	 * @param memoryCompany
	 * java不能省缺参数，通过memoryCompanyIsHere控制是否将memoryCompany传入Memory
	 * 当然也可以通过重载方法实现，但是代码量增加若干，需要取舍
	 */
	private void prepareHardwares(String company, int pins, String memorySize, Boolean memoryCompanyIsHere,
			String memoryCompany)
	{
		cpu = CPUFactory.createCPU(company, pins);
		mainBoard = MainBoardFactory.createMainBoard(company, pins);
		if (memoryCompanyIsHere)
		{
			memory = new Memory(memorySize, memoryCompany);
		} else
		{
			memory = new Memory(memorySize);
		}

	}
}
