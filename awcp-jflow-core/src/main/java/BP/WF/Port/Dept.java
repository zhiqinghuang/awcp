package BP.WF.Port;

import BP.DA.*;
import BP.En.*;
import BP.Web.*;

/** 
 部门
 
*/
public class Dept extends EntityNoName
{
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 属性
	/** 
	 父节点编号
	 
	*/
	public final String getParentNo()
	{
		return this.GetValStrByKey(DeptAttr.ParentNo);
	}
	public final void setParentNo(String value)
	{
		this.SetValByKey(DeptAttr.ParentNo, value);
	}

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 构造函数
	/** 
	 部门
	 
	*/
	public Dept()
	{
	}
	/** 
	 部门
	 
	 @param no 编号
	*/
	public Dept(String no)
	{
		super(no);
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 重写方法
	/** 
	 UI界面上的访问控制
	 
	*/
	@Override
	public UAC getHisUAC()
	{
		UAC uac = new UAC();
		uac.OpenForSysAdmin();
		return uac;
	}
	/** 
	 Map
	 
	*/
	@Override
	public Map getEnMap()
	{
		if (this.get_enMap() != null)
		{
			return this.get_enMap();
		}

		Map map = new Map();
		map.setEnDBUrl (new DBUrl(DBUrlType.AppCenterDSN)); //连接到的那个数据库上. (默认的是: AppCenterDSN )
		map.setPhysicsTable ("Port_Dept");
		map.setEnType  (EnType.Admin);

		map.setEnDesc  ("部门"); // "部门";// 实体的描述.
		map.setDepositaryOfEntity (Depositary.Application); //实体map的存放位置.
		map.setDepositaryOfMap (Depositary.Application); // Map 的存放位置.

		map.setAdjunctType (AdjunctType.None);

		map.AddTBStringPK(DeptAttr.No, null, "编号", true, false, 1, 30, 40);
		map.AddTBString(DeptAttr.Name, null,"名称", true, false, 0, 60, 200);
		map.AddTBString(DeptAttr.ParentNo, null, "父节点编号", true, false, 0, 30, 40);
		  //  map.AddTBString(DeptAttr.FK_Unit, "1", "隶属单位", false, false, 0, 50, 10);

		this.set_enMap (map);
		return this.get_enMap();
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion
}