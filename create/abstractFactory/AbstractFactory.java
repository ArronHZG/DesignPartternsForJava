/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午10:39:32
*/

package abstractFactory;
import simplyFactory.CPU;
import simplyFactory.MainBoard;


public interface AbstractFactory
{
	/**
	 * 创建CPU对象
	 * 
	 * @return CPU对象
	 */
	public CPU createCPU();

	/**
	 * 创建主板对象
	 * 
	 * @return 主板对象
	 */
	public MainBoard createMainBoard();

}
