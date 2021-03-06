package BP.WF.Template.Form.Sys.Sln;

import BP.DA.*;
import BP.En.*;
import BP.Sys.Frm.MapAttrAttr;
import BP.Tools.StringHelper;
import BP.WF.Port.*;
import BP.WF.*;

/** 
 表单字段方案
 
*/
public class FrmField extends EntityMyPK
{
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 基本属性
	/** 
	 元素类型.
	 
	*/
	public final String getEleType()
	{
		return this.GetValStringByKey(FrmFieldAttr.EleType);
	}
	public final void setEleType(String value)
	{
		this.SetValByKey(FrmFieldAttr.EleType, value);
	}
	/** 
	 正则表达式
	 
	*/
	public final String getRegularExp()
	{
		return this.GetValStringByKey(FrmFieldAttr.RegularExp);
	}
	public final void setRegularExp(String value)
	{
		this.SetValByKey(FrmFieldAttr.RegularExp, value);
	}
	public final String getName()
	{
		return this.GetValStringByKey(FrmFieldAttr.Name);
	}
	public final void setName(String value)
	{
		this.SetValByKey(FrmFieldAttr.Name, value);
	}
	/** 
	 是否为空
	 
	*/
	public final boolean getIsNotNull()
	{
		return this.GetValBooleanByKey(FrmFieldAttr.IsNotNull);
	}
	public final void setIsNotNull(boolean value)
	{
		this.SetValByKey(FrmFieldAttr.IsNotNull, value);
	}
	/** 
	 是否写入流程数据表
	 
	*/
	public final boolean getIsWriteToFlowTable()
	{
		return this.GetValBooleanByKey(FrmFieldAttr.IsWriteToFlowTable);
	}
	public final void setIsWriteToFlowTable(boolean value)
	{
		this.SetValByKey(FrmFieldAttr.IsWriteToFlowTable, value);
	}

	/** 
	 表单ID
	 
	*/
	public final String getFK_MapData()
	{
		return this.GetValStringByKey(FrmFieldAttr.FK_MapData);
	}
	public final void setFK_MapData(String value)
	{
		this.SetValByKey(FrmFieldAttr.FK_MapData, value);
	}
	/** 
	 字段
	 
	*/
	public final String getKeyOfEn()
	{
		return this.GetValStringByKey(FrmFieldAttr.KeyOfEn);
	}
	public final void setKeyOfEn(String value)
	{
		this.SetValByKey(FrmFieldAttr.KeyOfEn, value);
	}
	/** 
	 流程编号
	 
	*/
	public final String getFK_Flow()
	{
		return this.GetValStringByKey(FrmFieldAttr.FK_Flow);
	}
	public final void setFK_Flow(String value)
	{
		this.SetValByKey(FrmFieldAttr.FK_Flow, value);
	}
	/** 
	 解决方案
	 
	*/
	public final int getFK_Node()
	{
		return this.GetValIntByKey(FrmFieldAttr.FK_Node);
	}
	public final void setFK_Node(int value)
	{
		this.SetValByKey(FrmFieldAttr.FK_Node, value);
	}
	/** 
	 是否可见
	 
	*/
	public final boolean getUIVisible()
	{
		return this.GetValBooleanByKey(MapAttrAttr.UIVisible);
	}
	public final void setUIVisible(boolean value)
	{
		this.SetValByKey(MapAttrAttr.UIVisible, value);
	}
	/** 
	 是否可用
	 
	*/
	public final boolean getUIIsEnable()
	{
		return this.GetValBooleanByKey(MapAttrAttr.UIIsEnable);
	}
	public final void setUIIsEnable(boolean value)
	{
		this.SetValByKey(MapAttrAttr.UIIsEnable, value);
	}
	public final String getDefVal()
	{
		return this.GetValStringByKey(MapAttrAttr.DefVal);
	}
	public final void setDefVal(String value)
	{
		this.SetValByKey(MapAttrAttr.DefVal, value);
	}
	/** 
	 是否是数字签名?
	 
	*/
	public final boolean getIsSigan()
	{
		return this.GetValBooleanByKey(MapAttrAttr.IsSigan);
	}
	public final void setIsSigan(boolean value)
	{
		this.SetValByKey(MapAttrAttr.IsSigan, value);
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 构造方法
	/** 
	 表单字段方案
	 
	*/
	public FrmField()
	{
	}
	/** 
	 表单字段方案
	 
	 @param no
	*/
	public FrmField(String mypk)
	{
		super(mypk);
	}
	/** 
	 重写基类方法
	 
	*/
	@Override
	public Map getEnMap()
	{
		if (this.get_enMap() != null)
		{
			return this.get_enMap();
		}

		Map map = new Map("Sys_FrmSln");

		map.setEnDesc ( "表单字段方案");
		map.setDepositaryOfEntity ( Depositary.None);
		map.setDepositaryOfMap ( Depositary.Application);
		map.setCodeStruct ( "4");
		map.setIsAutoGenerNo ( false);

		map.AddMyPK();

			//该表单对应的表单ID
		map.AddTBString(FrmFieldAttr.FK_Flow, null, "流程编号", true, false, 0, 4, 4);
		map.AddTBInt(FrmFieldAttr.FK_Node, 0, "节点", true, false);

		map.AddTBString(FrmFieldAttr.FK_MapData, null, "表单ID", true, false, 0, 100, 10);
		map.AddTBString(FrmFieldAttr.KeyOfEn, null, "字段", true, false, 0, 200, 20);
		map.AddTBString(FrmFieldAttr.Name, null, "字段名", true, false, 0, 500, 20);
		map.AddTBString(FrmFieldAttr.EleType, null, "类型", true, false, 0, 20, 20);

			//控制内容.
		map.AddBoolean(MapAttrAttr.UIIsEnable, true, "是否可用", true, true);
		map.AddBoolean(MapAttrAttr.UIVisible, true, "是否可见", true, true);
		map.AddBoolean(MapAttrAttr.IsSigan, false, "是否签名", true, true);

			// Add 2013-12-26.
		map.AddTBInt(FrmFieldAttr.IsNotNull, 0, "是否为空", true, false);
		map.AddTBString(FrmFieldAttr.RegularExp, null, "正则表达式", true, false, 0, 500, 20);

			// 是否写入流程表? 2014-01-26，如果是，则首先写入该节点的数据表，然后copy到流程数据表里
			// 在节点发送时有ccflow自动写入，写入目的就是为了
		map.AddTBInt(FrmFieldAttr.IsWriteToFlowTable, 0, "是否写入流程表", true, false);


		map.AddBoolean(MapAttrAttr.IsSigan, false, "是否签名", true, true);

		map.AddTBString(MapAttrAttr.DefVal, null, "默认值", true, false, 0, 200, 20);

		this.set_enMap ( map);
		return this.get_enMap();
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

	@Override
	protected boolean beforeInsert()
	{
		if (StringHelper.isNullOrEmpty(this.getEleType()))
		{
			this.setEleType(FrmEleType.Field);
		}

		this.setMyPK ( this.getFK_MapData() + "_" + this.getFK_Flow() + "_" + this.getFK_Node() + "_" + this.getKeyOfEn() + "_" + this.getEleType());
		return super.beforeInsert();
	}
}