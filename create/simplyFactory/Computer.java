/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午9:21:43
*/

package simplyFactory;

public class Computer
{
	private CPU cpu = null;
	private MainBoard mainBoard = null;
	private Memory memory = null;

	public Computer(CPU cpu, MainBoard mainBoard, Memory memory)
	{
		super();
		this.cpu = cpu;
		this.mainBoard = mainBoard;
		this.memory = memory;
	}

	@Override
	public String toString()
	{
		return "This Computer:\n" + cpu.calulate() + mainBoard.installCPU() + memory.information();
	}

}
