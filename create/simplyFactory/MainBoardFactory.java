/** @version: 1.0
* @Description: package abstractFactory; 
* @author: Arron
* @date: 2018年10月13日-下午8:54:31
*/

package simplyFactory;

public class MainBoardFactory
{
	public static MainBoard createMainBoard(String company, int pins)
	{
		MainBoard mainBoard = null;
		if (company.toLowerCase().equals("inter"))
		{
			mainBoard = new InterBoard(pins);
		} else if (company.toLowerCase().equals("amd"))
		{
			mainBoard = new AmdBoard(pins);
		} else
		{
			return null;
		}
		return mainBoard;
	}
}
