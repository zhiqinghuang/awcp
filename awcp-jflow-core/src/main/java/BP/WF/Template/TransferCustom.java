package BP.WF.Template;

import BP.DA.*;
import BP.En.*;
import BP.WF.*;
import BP.Port.*;

/**
 * 自定义运行路径
 */
public class TransferCustom extends EntityMyPK {
	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	// /#region 属性
	/**
	 * 节点ID
	 */
	public final int getFK_Node() {
		return this.GetValIntByKey(TransferCustomAttr.FK_Node);
	}

	public final void setFK_Node(int value) {
		this.SetValByKey(TransferCustomAttr.FK_Node, value);
	}

	public final long getWorkID() {
		return this.GetValInt64ByKey(TransferCustomAttr.WorkID);
	}

	public final void setWorkID(long value) {
		this.SetValByKey(TransferCustomAttr.WorkID, value);
	}

	/**
	 * 处理人
	 */
	public final String getWorker() {
		return this.GetValStringByKey(TransferCustomAttr.Worker);
	}

	public final void setWorker(String value) {
		this.SetValByKey(TransferCustomAttr.Worker, value);
	}

	/**
	 * 要启用的子流程编号
	 */
	public final String getSubFlowNo() {
		return this.GetValStringByKey(TransferCustomAttr.SubFlowNo);
	}

	public final void setSubFlowNo(String value) {
		this.SetValByKey(TransferCustomAttr.SubFlowNo, value);
	}

	/**
	 * 顺序
	 */
	public final int getIdx() {
		return this.GetValIntByKey(TransferCustomAttr.Idx);
	}

	public final void setIdx(int value) {
		this.SetValByKey(TransferCustomAttr.Idx, value);
	}

	/**
	 * 发起时间（可以为空）
	 */
	public final String getStartDT() {
		return this.GetValStringByKey(TransferCustomAttr.StartDT);
	}

	public final void setStartDT(String value) {
		this.SetValByKey(TransferCustomAttr.StartDT, value);
	}

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	// /#endregion

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	// /#region 构造函数
	/**
	 * TransferCustom
	 */
	public TransferCustom() {
	}

	/**
	 * 重写基类方法
	 */
	@Override
	public Map getEnMap() {
		if (this.get_enMap() != null) {
			return this.get_enMap();
		}
		Map map = new Map("WF_TransferCustom");
		map.setEnDesc("自定义运行路径"); // 负责人liuxianchen.
		map.setEnType(EnType.Admin);

		map.AddMyPK(); // 唯一的主键.

		// 主键.
		map.AddTBInt(TransferCustomAttr.WorkID, 0, "WorkID", true, false);
		map.AddTBInt(TransferCustomAttr.FK_Node, 0, "工作ID", true, false);
		map.AddTBString(TransferCustomAttr.Worker, null, "处理人", true, false, 0,
				200, 10);
		map.AddTBString(TransferCustomAttr.SubFlowNo, null, "要经过的子流程编号", true,
				false, 0, 3, 10);
		map.AddTBDateTime(TransferCustomAttr.RDT, null, "日期时间", true, false);
		map.AddTBInt(TransferCustomAttr.Idx, 0, "顺序号", true, false);

		// map.AddTBString(TransferCustomAttr.StartDT, null, "发起时间", true,
		// false, 0, 20, 10);

		this.set_enMap(map);
		return this.get_enMap();
	}

	// C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
	// /#endregion

	/**
	 * 获取下一个要到达的定义路径. 要分析如下几种情况: 1, 当前节点不存在队列里面，就返回第一个. 2, 如果当前队列为空,就认为需要结束掉,
	 * 返回null. 3, 如果当前节点是最后一个,就返回null,表示要结束流程.
	 * 
	 * @param workid
	 *            当前工作ID
	 * @param currNodeID
	 *            当前节点ID
	 * @return 获取下一个要到达的定义路径,如果没有就返回空.
	 */
	public static TransferCustom GetNextTransferCustom(long workid,
			int currNodeID) {
		TransferCustoms ens = new TransferCustoms();
		ens.Retrieve(TransferCustomAttr.WorkID, workid, TransferCustomAttr.Idx);
		if (ens.size() == 0) {
			return null;
		}

		// 获取最后一个
//		TransferCustom tEnd = (TransferCustom) ((ens[ens.size() - 1] instanceof TransferCustom) ? ens[ens
//				.size() - 1] : null);
		TransferCustom tEnd = (TransferCustom) ((ens.get(ens.size() - 1) instanceof TransferCustom) ? ens.get(ens.size() - 1) : null);
		if (tEnd.getFK_Node() == currNodeID) {
			return null; // 表示要结束，因为这是最后一个环节.
		}

		// 开始找, 找到当前节点的下一个.
		boolean isRec = false;
		for (TransferCustom en : TransferCustoms.convertTransferCustoms(ens)) {
			if (en.getFK_Node() == currNodeID) {
				isRec = true;
				continue;
			}
			if (isRec) {
				return en;
			}
		}

		// 如果没有找到，就返回最后一个.
		return (TransferCustom) ens.get(0);
	}
}