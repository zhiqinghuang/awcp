package BP.WF.Template;

import java.io.File;
import java.util.ArrayList;

import BP.DA.DataType;
import BP.En.EntitiesNoName;
import BP.En.Entity;
import BP.En.QueryObject;
import BP.Sys.SystemConfig;
import BP.WF.Template.PubLib.FlowAttr;

/**
 * 流程集合
 * 
 */
public class Flows extends EntitiesNoName {
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #region 查询
	public static ArrayList<Flow> convertFlows(Object obj) {
		return (ArrayList<Flow>) obj;
	}

	public static void GenerHtmlRpts() {
		Flows fls = new Flows();
		fls.RetrieveAll();

		for (Flow fl : Flows.convertFlows(fls)) {
			fl.DoCheck();
			fl.GenerFlowXmlTemplete();
		}

		// 生成索引界面
		String path = SystemConfig.getPathOfWorkDir() + File.separator + "VisualFlow" + File.separator + "DataUser"
				+ File.separator + "FlowDesc" + File.separator;
		String msg = "";
		msg += "<html>";
		msg += "\r\n<title>.net工作流程引擎设计，流程模板</title>";

		msg += "\r\n<body>";

		msg += "\r\n<h1>驰骋流程模板网</h1> <br><a href=index.htm >返回首页</a> - <a href='http://ccFlow.org' >访问驰骋工作流程管理系统，工作流引擎官方网站</a> 流程系统建设请联系:QQ:793719823,Tel:18660153393<hr>";

		for (Flow fl : Flows.convertFlows(fls)) {
			msg += "\r\n <h3><b><a href='./" + fl.getNo() + "/index.htm' target=_blank>" + fl.getName()
					+ "</a></b> - <a href='" + fl.getNo() + ".gif' target=_blank  >" + fl.getName() + "流程图</a></h3>";

			msg += "\r\n<UL>";
			Nodes nds = fl.getHisNodes();
			for (Node nd : Nodes.convertNodes(nds)) {
				msg += "\r\n<li><a href='./" + fl.getNo() + "/" + nd.getNodeID() + "_" + nd.getFlowName() + "_"
						+ nd.getName() + "表单.doc' target=_blank>步骤" + nd.getStep() + ", - " + nd.getName()
						+ "模板</a> -<a href='./" + fl.getNo() + "/" + nd.getNodeID() + "_" + nd.getName()
						+ "_表单模板.htm' target=_blank>Html版</a></li>";
			}
			msg += "\r\n</UL>";
		}
		msg += "\r\n</body>";
		msg += "\r\n</html>";

		try {
			String pathDef = SystemConfig.getPathOfWorkDir() + File.separator + "VisualFlow" + File.separator
					+ "DataUser" + File.separator + "FlowDesc" + File.separator + SystemConfig.getCustomerNo()
					+ "_index.htm";
			DataType.WriteFile(pathDef, msg);

			pathDef = SystemConfig.getPathOfWorkDir() + File.separator + "VisualFlow" + File.separator + "DataUser"
					+ File.separator + "FlowDesc" + File.separator + "index.htm";
			DataType.WriteFile(pathDef, msg);
			Runtime.getRuntime().exec(SystemConfig.getPathOfWorkDir() + File.separator + "VisualFlow" + File.separator
					+ "DataUser" + File.separator + "FlowDesc" + File.separator);
			// System.getDiagnostics().Process.Start(SystemConfig.PathOfWorkDir
			// + "\\VisualFlow\\DataUser\\FlowDesc\\");
		} catch (java.lang.Exception e) {
		}
	}
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #endregion 查询

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #region 查询
	/**
	 * 查出来全部的自动流程
	 * 
	 */
	public final void RetrieveIsAutoWorkFlow() {
		QueryObject qo = new QueryObject(this);
		qo.AddWhere(FlowAttr.FlowType, 1);
		qo.addOrderBy(FlowAttr.No);
		qo.DoQuery();
	}

	/**
	 * 查询出来全部的在生存期间内的流程
	 * 
	 * @param flowSort
	 *            流程类别
	 * @param IsCountInLifeCycle
	 *            是不是计算在生存期间内 true 查询出来全部的
	 */
	public final int Retrieve(String flowSort) {
		QueryObject qo = new QueryObject(this);
		qo.AddWhere(FlowAttr.FK_FlowSort, flowSort);
		qo.addOrderBy(FlowAttr.No);
		return qo.DoQuery();
	}
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #endregion

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #region 构造方法
	/**
	 * 工作流程
	 * 
	 */
	public Flows() {
	}

	/**
	 * 工作流程
	 * 
	 * @param fk_sort
	 */
	public Flows(String fk_sort) {
		this.Retrieve(FlowAttr.FK_FlowSort, fk_sort);
	}
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #endregion

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #region 得到实体
	/**
	 * 得到它的 Entity
	 * 
	 */
	@Override
	public Entity getGetNewEntity() {
		return new Flow();
	}
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	/// #endregion
}