/** @version: 1.1
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午8:42:22
* 
* * 1.1 修改接口方法
*/

package abstractFactory;

public class InterBoard implements MainBoard
{
	private int cpuHoles = 0;

	public InterBoard(int cpuHoles)
	{
		super();
		this.cpuHoles = cpuHoles;
	}

	@Override
	public String installCPU()
	{
		return "Intel主板，CPU插槽孔数是：" + cpuHoles + "\n";
	}
}
