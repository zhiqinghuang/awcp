package BP.WF.DTS;

import BP.DA.*;
import BP.Port.*;
import BP.En.*;
import BP.Sys.*;
import BP.Sys.Frm.MapAttr;
import BP.Sys.Frm.MapAttrs;
import BP.Sys.Frm.MapData;
import BP.Sys.Frm.MapDatas;

/** 
 修改人员编号 的摘要说明
 
*/
public class ChangeUserNo extends Method
{
	/** 
	 不带有参数的方法
	 
	*/
	public ChangeUserNo()
	{
		this.Title = "修改人员编号（原来一个操作中编号叫A,现在修改成B）";
		this.Help = "请慎重执行，执行前请先备份数据库，系统会把生成的SQL放在日志里，打开日志文件(" + BP.Sys.SystemConfig.getPathOfDataUser() + "\\Log)，然后找到这些sql.";
	}
	/** 
	 设置执行变量
	 
	 @return 
	*/
	@Override
	public void Init()
	{
		this.Warning = "您确定要执行吗？";
		getHisAttrs().AddTBString("P1", null, "原用户名", true, false, 0, 10, 10);
		getHisAttrs().AddTBString("P2", null, "新用户名", true, false, 0, 10, 10);
	}
	/** 
	 当前的操纵员是否可以执行这个方法
	 
	*/
	@Override
	public boolean getIsCanDo()
	{ 
		if (WebUser.getNo().equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/** 
	 执行
	 
	 @return 返回执行结果
	*/
	@Override
	public Object Do()
	{
		String oldNo = this.GetValStrByKey("P1");
		String newNo = this.GetValStrByKey("P2");

		String sqls = "";

		sqls += "UPDATE Port_Emp Set No='" + newNo + "' WHERE No='" + oldNo + "'";
		sqls += "\t\n UPDATE Port_EmpDept Set FK_Emp='" + newNo + "' WHERE FK_Emp='" + oldNo + "'";
		sqls += "\t\n UPDATE " + BP.WF.Glo.getEmpStation() + " Set FK_Emp='" + newNo + "' WHERE FK_Emp='" + oldNo + "'";

		MapDatas mds = new MapDatas();
		mds.RetrieveAll();

		for (MapData md : MapDatas.convertMapDatas(mds))
		{
			MapAttrs attrs = new MapAttrs(md.getNo());
			for (MapAttr attr : MapAttrs.convertMapAttrs(attrs))
			{
				if (attr.getUIIsEnable() == false && attr.getDefValReal().equals("@WebUser.No"))
				{
					sqls += "\t\n UPDATE " + md.getPTable() + " SET ";
				}
				continue;

			}
			sqls += "UPDATE";

		}

		return "执行成功..." + sqls;
	}
}