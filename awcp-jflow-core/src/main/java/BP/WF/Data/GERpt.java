package BP.WF.Data;

import BP.DA.DataRow;
import BP.En.*;
import BP.WF.Entity.GenerWorkFlowAttr;
import BP.WF.Entity.WFSta;
import BP.WF.Template.*;
import BP.WF.Template.PubLib.WFState;
import BP.WF.Template.WorkBase.WorkAttr;
import BP.Sys.*;
import BP.Sys.Frm.MapData;


/** 
 报表
 
*/
public class GERpt extends BP.En.EntityOID
{
/**
	 * 
	 */
	private static final long serialVersionUID = 7870529974406664671L;
	//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region attrs
	public final long getOID()
	{
		return this.GetValInt64ByKey(GERptAttr.OID);
	}
	public final void setOID(long value)
	{
		this.SetValByKey(GERptAttr.OID, value);
	}
	/** 
	 流程时间跨度
	 
	*/
	public final int getFlowDaySpan()
	{
		return this.GetValIntByKey(GERptAttr.FlowDaySpan);
	}
	public final void setFlowDaySpan(int value)
	{
		this.SetValByKey(GERptAttr.FlowDaySpan, value);
	}
	public final int getMyNum()
	{
		return this.GetValIntByKey(GERptAttr.MyNum);
	}
	public final void setMyNum(int value)
	{
		this.SetValByKey(GERptAttr.MyNum, value);
	}
	/** 
	 主流程ID
	 
	*/
	public final long getFID()
	{
		return this.GetValInt64ByKey(GERptAttr.FID);
	}
	public final void setFID(long value)
	{
		this.SetValByKey(GERptAttr.FID, value);
	}
	public final String getGUID()
	{
		return this.GetValStringByKey(GERptAttr.GUID);
	}
	public final void setGUID(String value)
	{
		this.SetValByKey(GERptAttr.GUID, value);
	}
	/** 
	 流程参与人员
	 
	*/
	public final String getFlowEmps()
	{
		return this.GetValStringByKey(GERptAttr.FlowEmps);
	}
	public final void setFlowEmps(String value)
	{
		this.SetValByKey(GERptAttr.FlowEmps, value);
	}
	/** 
	 流程备注
	 
	*/
	public final String getFlowNote()
	{
		return this.GetValStringByKey(GERptAttr.FlowNote);
	}
	public final void setFlowNote(String value)
	{
		this.SetValByKey(GERptAttr.FlowNote, value);
	}
	/** 
	 客户编号
	 
	*/
	public final String getGuestNo()
	{
		return this.GetValStringByKey(GERptAttr.GuestNo);
	}
	public final void setGuestNo(String value)
	{
		this.SetValByKey(GERptAttr.GuestNo, value);
	}
	/** 
	 客户名称
	 
	*/
	public final String getGuestName()
	{
		return this.GetValStringByKey(GERptAttr.GuestName);
	}
	public final void setGuestName(String value)
	{
		this.SetValByKey(GERptAttr.GuestName, value);
	}
	public final String getBillNo()
	{
		return this.GetValStringByKey(GERptAttr.BillNo);
	}
	public final void setBillNo(String value)
	{
		this.SetValByKey(GERptAttr.BillNo, value);
	}
	/** 
	 流程发起人
	 
	*/
	public final String getFlowStarter()
	{
		return this.GetValStringByKey(GERptAttr.FlowStarter);
	}
	public final void setFlowStarter(String value)
	{
		this.SetValByKey(GERptAttr.FlowStarter, value);
	}
	/** 
	 流程发起日期
	 
	*/
	public final String getFlowStartRDT()
	{
		return this.GetValStringByKey(GERptAttr.FlowStartRDT);
	}
	public final void setFlowStartRDT(String value)
	{
		this.SetValByKey(GERptAttr.FlowStartRDT, value);
	}
	/** 
	 流程结束者
	 
	*/
	public final String getFlowEnder()
	{
		return this.GetValStringByKey(GERptAttr.FlowEnder);
	}
	public final void setFlowEnder(String value)
	{
		this.SetValByKey(GERptAttr.FlowEnder, value);
	}
	/** 
	 流程结束时间
	 
	*/
	public final String getFlowEnderRDT()
	{
		return this.GetValStringByKey(GERptAttr.FlowEnderRDT);
	}
	public final void setFlowEnderRDT(String value)
	{
		this.SetValByKey(GERptAttr.FlowEnderRDT, value);
	}
	public final String getFlowEndNodeText()
	{
		Node nd = new Node(this.getFlowEndNode());
		return nd.getName();
	}
	public final int getFlowEndNode()
	{
		return this.GetValIntByKey(GERptAttr.FlowEndNode);
	}
	public final void setFlowEndNode(int value)
	{
		this.SetValByKey(GERptAttr.FlowEndNode, value);
	}
	/** 
	 流程标题
	 
	*/
	public final String getTitle()
	{
		return this.GetValStringByKey(GERptAttr.Title);
	}
	public final void setTitle(String value)
	{
		this.SetValByKey(GERptAttr.Title, value);
	}
	/** 
	 隶属年月
	 
	*/
	public final String getFK_NY()
	{
		return this.GetValStringByKey(GERptAttr.FK_NY);
	}
	public final void setFK_NY(String value)
	{
		this.SetValByKey(GERptAttr.FK_NY, value);
	}
	/** 
	 发起人部门
	 
	*/
	public final String getFK_Dept()
	{
		return this.GetValStringByKey(GERptAttr.FK_Dept);
	}
	public final void setFK_Dept(String value)
	{
		this.SetValByKey(GERptAttr.FK_Dept, value);
	}
	/** 
	 流程状态
	 
	*/
	public final WFState getWFState()
	{
		return WFState.forValue(this.GetValIntByKey(GERptAttr.WFState));
	}
	public final void setWFState(WFState value)
	{
			//设置他的值.
		this.SetValByKey(GERptAttr.WFState,value.getValue());

			// 设置 WFSta 的值.
		switch (value)
		{
			case Complete:
				SetValByKey(GenerWorkFlowAttr.WFSta, WFSta.Complete.getValue());
				break;
			case Delete:
			case Blank:
				SetValByKey(GenerWorkFlowAttr.WFSta, WFSta.Delete.getValue());
				break;
			default:
				SetValByKey(GenerWorkFlowAttr.WFSta, WFSta.Runing.getValue());
				break;
		}

	}
	/** 
	 父流程WorkID
	 
	*/
	public final long getPWorkID()
	{
		return this.GetValInt64ByKey(GERptAttr.PWorkID);
	}
	public final void setPWorkID(long value)
	{
		this.SetValByKey(GERptAttr.PWorkID, value);
	}
	/** 
	 发出的节点
	 
	*/
	public final int getPNodeID()
	{
		return this.GetValIntByKey(GERptAttr.PNodeID);
	}
	public final void setPNodeID(int value)
	{
		this.SetValByKey(GERptAttr.PNodeID, value);
	}
	/** 
	 父流程流程编号
	 
	*/
	public final String getPFlowNo()
	{
		return this.GetValStringByKey(GERptAttr.PFlowNo);
	}
	public final void setPFlowNo(String value)
	{
		this.SetValByKey(GERptAttr.PFlowNo, value);
	}
	public final String getPEmp()
	{
		return this.GetValStringByKey(GERptAttr.PEmp);
	}
	public final void setPEmp(String value)
	{
		this.SetValByKey(GERptAttr.PEmp, value);
	}
	/** 
	 延续流程WorkID
	 
	*/
	public final long getCWorkID()
	{
		return this.GetValInt64ByKey(GERptAttr.CWorkID);
	}
	public final void setCWorkID(long value)
	{
		this.SetValByKey(GERptAttr.CWorkID, value);
	}
	/** 
	 延续流程流程编号
	 
	*/
	public final String getCFlowNo()
	{
		return this.GetValStringByKey(GERptAttr.CFlowNo);
	}
	public final void setCFlowNo(String value)
	{
		this.SetValByKey(GERptAttr.CFlowNo, value);
	}
	/** 
	 项目编号
	 
	*/
	public final String getPrjNo()
	{
		return this.GetValStringByKey(GERptAttr.PrjNo);
	}
	public final void setPrjNo(String value)
	{
		this.SetValByKey(GERptAttr.PrjNo, value);
	}
	public final String getPrjName()
	{
		return this.GetValStringByKey(GERptAttr.PrjName);
	}
	public final void setPrjName(String value)
	{
		this.SetValByKey(GERptAttr.PrjName, value);
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion attrs

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region 重写。

	@Override
	public void Copy(DataRow dr)
	{
		for (Attr attr : this.getEnMap().getAttrs())
		{
			if (WorkAttr.CDT.equals(attr.getKey()) || WorkAttr.RDT.equals(attr.getKey()) || WorkAttr.Rec.equals(attr.getKey()) || WorkAttr.FID.equals(attr.getKey()) || WorkAttr.OID.equals(attr.getKey()) || WorkAttr.Emps.equals(attr.getKey()) || GERptAttr.AtPara.equals(attr.getKey()) || GERptAttr.BillNo.equals(attr.getKey()) || GERptAttr.CFlowNo.equals(attr.getKey()) || GERptAttr.CWorkID.equals(attr.getKey()) || GERptAttr.FID.equals(attr.getKey()) || GERptAttr.FK_Dept.equals(attr.getKey()) || GERptAttr.FK_NY.equals(attr.getKey()) || GERptAttr.FlowDaySpan.equals(attr.getKey()) || GERptAttr.FlowEmps.equals(attr.getKey()) || GERptAttr.FlowEnder.equals(attr.getKey()) || GERptAttr.FlowEnderRDT.equals(attr.getKey()) || GERptAttr.FlowEndNode.equals(attr.getKey()) || GERptAttr.FlowNote.equals(attr.getKey()) || GERptAttr.FlowStarter.equals(attr.getKey()) || GERptAttr.GuestName.equals(attr.getKey()) || GERptAttr.GuestNo.equals(attr.getKey()) || GERptAttr.GUID.equals(attr.getKey()) || GERptAttr.PEmp.equals(attr.getKey()) || GERptAttr.PFlowNo.equals(attr.getKey()) || GERptAttr.PNodeID.equals(attr.getKey()) || GERptAttr.PWorkID.equals(attr.getKey()) || GERptAttr.Title.equals(attr.getKey()) || GERptAttr.PrjNo.equals(attr.getKey()) || GERptAttr.PrjName.equals(attr.getKey()) || attr.getKey().equals("No") || attr.getKey().equals("Name"))
			{
				continue;
			}

			if (GERptAttr.MyNum.equals(attr.getKey()))
			{
				this.SetValByKey(attr.getKey(), 1);
				continue;
			}

			try
			{
				this.SetValByKey(attr.getKey(), dr.getValue(attr.getKey()));
			}
			catch (java.lang.Exception e)
			{
			}
		}
	}
	@Override
	public void Copy(Entity fromEn)
	{
		if (fromEn == null)
		{
			return;
		}

		Attrs attrs = fromEn.getEnMap().getAttrs();
		for (Attr attr : attrs)
		{
			if (WorkAttr.CDT.equals(attr.getKey()) || WorkAttr.RDT.equals(attr.getKey()) || WorkAttr.Rec.equals(attr.getKey()) || WorkAttr.FID.equals(attr.getKey()) || WorkAttr.OID.equals(attr.getKey()) || WorkAttr.Emps.equals(attr.getKey()) || GERptAttr.AtPara.equals(attr.getKey()) || GERptAttr.BillNo.equals(attr.getKey()) || GERptAttr.CFlowNo.equals(attr.getKey()) || GERptAttr.CWorkID.equals(attr.getKey()) || GERptAttr.FID.equals(attr.getKey()) || GERptAttr.FK_Dept.equals(attr.getKey()) || GERptAttr.FK_NY.equals(attr.getKey()) || GERptAttr.FlowDaySpan.equals(attr.getKey()) || GERptAttr.FlowEmps.equals(attr.getKey()) || GERptAttr.FlowEnder.equals(attr.getKey()) || GERptAttr.FlowEnderRDT.equals(attr.getKey()) || GERptAttr.FlowEndNode.equals(attr.getKey()) || GERptAttr.FlowNote.equals(attr.getKey()) || GERptAttr.FlowStarter.equals(attr.getKey()) || GERptAttr.GuestName.equals(attr.getKey()) || GERptAttr.GuestNo.equals(attr.getKey()) || GERptAttr.GUID.equals(attr.getKey()) || GERptAttr.PEmp.equals(attr.getKey()) || GERptAttr.PFlowNo.equals(attr.getKey()) || GERptAttr.PNodeID.equals(attr.getKey()) || GERptAttr.PWorkID.equals(attr.getKey()) || GERptAttr.Title.equals(attr.getKey()) || GERptAttr.PrjNo.equals(attr.getKey()) || GERptAttr.PrjName.equals(attr.getKey()) || attr.getKey().equals("No") || attr.getKey().equals("Name"))
			{
				continue;
			}


			if (GERptAttr.MyNum.equals(attr.getKey()))
			{
				this.SetValByKey(attr.getKey(), 1);
				continue;
			}
			this.SetValByKey(attr.getKey(), fromEn.GetValByKey(attr.getKey()));
		}
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region attrs - attrs
	private String _RptName = null;
	public final String getRptName()
	{
		return _RptName;
	}
	public final void setRptName(String value)
	{
		this._RptName = value;

		this._SQLCash = null;
		this.set_enMap(null);
		this.setRow (null);
	}
	@Override
	public String toString()
	{
		return getRptName();
	}
	@Override
	public String getPK()
	{
		return "OID";
	}
	@Override
	public String getPKField()
	{
		return "OID";
	}
	/** 
	 Map
	 
	*/
	@Override
	public Map getEnMap()
	{
		if (this.getRptName() == null)
		{
			BP.Port.Emp emp = new BP.Port.Emp();
			return emp.getEnMap();
		}

		if (this.get_enMap() == null)
		{
			this.set_enMap( MapData.GenerHisMap(this.getRptName()));
		}

		return this.get_enMap();
	}
	/** 
	 报表
	 
	 @param rptName
	*/
	public GERpt(String rptName)
	{
		this.setRptName(rptName);
	}
	public GERpt()
	{
	}
	/** 
	 报表
	 
	 @param rptName
	 @param oid
	*/
	public GERpt(String rptName, long oid)
	{
		this.setRptName(rptName);
		this.setOID((int)oid);
		this.Retrieve();
	}
//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#endregion attrs
}