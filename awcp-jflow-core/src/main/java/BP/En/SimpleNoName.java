package BP.En;

import BP.DA.Depositary;
import BP.En.Map;

public abstract class SimpleNoName extends EntityNoName
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 构造
	public SimpleNoName()
	{
		//	this.No  = this.GenerNewNo ;
	}

	protected SimpleNoName(String _No)
	{
		super(_No);
	}
	@Override
	public Map getEnMap()
	{
		if (this.get_enMap()!=null)
		{
			return this.get_enMap();
		}
		Map map = new Map(this.getPhysicsTable());
		map.setEnDesc(this.getDesc());
		map.setCodeStruct("3");
		map.setIsAutoGenerNo(true);
		map.setDepositaryOfEntity(Depositary.Application);
		map.setDepositaryOfMap(Depositary.Application);

		map.AddTBStringPK(SimpleNoNameAttr.No, null, "编号", true, true, 1, 20, 10);
		map.AddTBString(SimpleNoNameAttr.Name, null, "名称", true, false, 0, 400, 100);

		this.set_enMap(map);
		return this.get_enMap();
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 需要子类重写的方法
	/** 
	 指定表
	 
	*/
	public abstract String getPhysicsTable();
	/** 
	 描述
	 
	*/
	public abstract String getDesc();
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion
}