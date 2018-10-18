/** @version: 1.0
* @Description: package Prototype; 
* @author: Arron
* @date: 2018年10月18日-下午9:50:51
*/ 

package Prototype;

import java.util.HashMap;
import java.util.Map;

public class AnotherPrototypeManager
{
	   /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private static Map<String, AnotherPrototype> map = new HashMap<String,AnotherPrototype>();
    /**
     * 私有化构造方法，避免外部创建实例
     */
    private AnotherPrototypeManager(){}
    /**
     * 向原型管理器里面添加或是修改某个原型注册
     * @param prototypeId 原型编号
     * @param prototype    原型实例
     */
    public synchronized static void setPrototype(String prototypeId , AnotherPrototype prototype){
        map.put(prototypeId, prototype);
    }
    /**
     * 从原型管理器里面删除某个原型注册
     * @param prototypeId 原型编号
     */
    public synchronized static void removePrototype(String prototypeId){
        map.remove(prototypeId);
    }
    /**
     * 获取某个原型编号对应的原型实例
     * @param prototypeId    原型编号
     * @return    原型编号对应的原型实例
     * @throws Exception    如果原型编号对应的实例不存在，则抛出异常
     */
    public synchronized static AnotherPrototype getPrototype(String prototypeId) throws Exception{
        AnotherPrototype prototype = map.get(prototypeId);
        if(prototype == null){
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return prototype;
    }
}
