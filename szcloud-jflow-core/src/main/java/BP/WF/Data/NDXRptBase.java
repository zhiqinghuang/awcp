package BP.WF.Data;

import BP.En.*;
import BP.WF.Template.*;
import BP.WF.Template.PubLib.WFState;
import BP.Sys.*;

/** 
 报表基类
 
*/
public abstract class NDXRptBase extends BP.En.EntityOID
{
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 属性
	/** 
	 工作ID
	 
	*/
	public final long getOID()
	{
		return this.GetValInt64ByKey(NDXRptBaseAttr.OID);
	}
	public final void setOID(long value)
	{
		this.SetValByKey(NDXRptBaseAttr.OID, value);
	}
	/** 
	 流程时间跨度
	 
	*/
	public final int getFlowDaySpan()
	{
		return this.GetValIntByKey(NDXRptBaseAttr.FlowDaySpan);
	}
	public final void setFlowDaySpan(int value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowDaySpan, value);
	}
	/** 
	 数量
	 
	*/
	public final int getMyNum()
	{
		return 1;
	}
	/** 
	 主流程ID
	 
	*/
	public final long getFID()
	{
		return this.GetValInt64ByKey(NDXRptBaseAttr.FID);
	}
	public final void setFID(long value)
	{
		this.SetValByKey(NDXRptBaseAttr.FID, value);
	}
	/** 
	 流程参与人员
	 
	*/
	public final String getFlowEmps()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FlowEmps);
	}
	public final void setFlowEmps(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowEmps, value);
	}
	/** 
	 客户编号
	 
	*/
	public final String getGuestNo()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.GuestNo);
	}
	public final void setGuestNo(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.GuestNo, value);
	}
	/** 
	 客户名称
	 
	*/
	public final String getGuestName()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.GuestName);
	}
	public final void setGuestName(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.GuestName, value);
	}
	public final String getBillNo()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.BillNo);
	}
	public final void setBillNo(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.BillNo, value);
	}
	/** 
	 流程发起人
	 
	*/
	public final String getFlowStarter()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FlowStarter);
	}
	public final void setFlowStarter(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowStarter, value);
	}
	/** 
	 流程发起日期
	 
	*/
	public final String getFlowStartRDT()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FlowStartRDT);
	}
	public final void setFlowStartRDT(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowStartRDT, value);
	}
	/** 
	 流程结束者
	 
	*/
	public final String getFlowEnder()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FlowEnder);
	}
	public final void setFlowEnder(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowEnder, value);
	}
	/** 
	 流程结束时间
	 
	*/
	public final String getFlowEnderRDT()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FlowEnderRDT);
	}
	public final void setFlowEnderRDT(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowEnderRDT, value);
	}
	/** 
	 结束节点名称
	 
	*/
	public final String getFlowEndNodeText()
	{
		Node nd = new Node(this.getFlowEndNode());
		return nd.getName();
	}
	/** 
	 节点节点ID
	 
	*/
	public final int getFlowEndNode()
	{
		return this.GetValIntByKey(NDXRptBaseAttr.FlowEndNode);
	}
	public final void setFlowEndNode(int value)
	{
		this.SetValByKey(NDXRptBaseAttr.FlowEndNode, value);
	}
	/** 
	 流程标题
	 
	*/
	public final String getTitle()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.Title);
	}
	public final void setTitle(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.Title, value);
	}
	/** 
	 隶属年月
	 
	*/
	public final String getFK_NY()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FK_NY);
	}
	public final void setFK_NY(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FK_NY, value);
	}
	/** 
	 发起人部门
	 
	*/
	public final String getFK_Dept()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.FK_Dept);
	}
	public final void setFK_Dept(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.FK_Dept, value);
	}
	/** 
	 流程状态
	 
	*/
	public final WFState getWFState()
	{
		return WFState.forValue(this.GetValIntByKey(NDXRptBaseAttr.WFState));
	}
	public final void setWFState(WFState value)
	{
		this.SetValByKey(NDXRptBaseAttr.WFState, value.getValue());
	}
	/** 
	 状态名称
	 
	*/
	public final String getWFStateText()
	{
		switch (this.getWFState())
		{
			case Complete:
				return "已完成";
			case Delete:
				return "已删除";
			default:
				return "运行中";
		}
	}
	/** 
	 父流程WorkID
	 
	*/
	public final long getPWorkID()
	{
		return this.GetValInt64ByKey(NDXRptBaseAttr.PWorkID);
	}
	public final void setPWorkID(long value)
	{
		this.SetValByKey(NDXRptBaseAttr.PWorkID, value);
	}
	/** 
	 父流程流程编号
	 
	*/
	public final String getPFlowNo()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.PFlowNo);
	}
	public final void setPFlowNo(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.PFlowNo, value);
	}
	/** 
	 延续流程WorkID
	 
	*/
	public final long getCWorkID()
	{
		return this.GetValInt64ByKey(NDXRptBaseAttr.CWorkID);
	}
	public final void setCWorkID(long value)
	{
		this.SetValByKey(NDXRptBaseAttr.CWorkID, value);
	}
	/** 
	 延续流程编号
	 
	*/
	public final String getCFlowNo()
	{
		return this.GetValStringByKey(NDXRptBaseAttr.CFlowNo);
	}
	public final void setCFlowNo(String value)
	{
		this.SetValByKey(NDXRptBaseAttr.CFlowNo, value);
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion attrs

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 构造
	/** 
	 构造
	 
	*/
	protected NDXRptBase()
	{
	}
	/** 
	 根据OID构造实体
	 
	 @param 工作ID workid
	*/
	protected NDXRptBase(int workid)
	{
		super(workid);
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion 构造
}