/** @version: 1.1
* @Description: 
* @author: Arron
* @date: 2018年10月13日-下午8:44:21
* 
* * 1.1 修改接口方法
*/

package simplyFactory;

public class AmdBoard implements MainBoard
{
	private int cpuHoles = 0;

	public AmdBoard(int cpuHoles)
	{
		super();
		this.cpuHoles = cpuHoles;
	}

	@Override
	public String installCPU()
	{
		return "AMD主板，CPU插槽孔数是：" + cpuHoles + "\n";
	}

}