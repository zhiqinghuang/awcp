package BP.WF;

import java.util.ArrayList;


/** 
 工作发送返回对象集合.
 
*/
public class SendReturnObjs extends ArrayList<SendReturnObj>
{
		///#region 获取系统变量.
	public final long getVarWorkID()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarWorkID.equals(item.MsgFlag))
			{
				return Long.parseLong(item.MsgOfText);
			}
		}
		return 0;
	}
	public final boolean getIsStopFlow()
   {
	   for (SendReturnObj item : this)
	   {
		   if (SendReturnMsgFlag.IsStopFlow.equals(item.MsgFlag))
		   {
			   if (item.MsgOfText.equals("1"))
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
	   }
	   throw new RuntimeException("@没有找到系统变量IsStopFlow");
   }

	/** 
	 到达节点ID
	 
	*/
	public final int getVarToNodeID()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarToNodeID.equals(item.MsgFlag))
			{
				return Integer.parseInt(item.MsgOfText);
			}
		}
		return 0;
	}
	/** 
	 到达节点IDs
	 
	*/
	public final String getVarToNodeIDs()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarToNodeIDs.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return null;
	}
	/** 
	 到达节点名称
	 
	*/
	public final String getVarToNodeName()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarToNodeName.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return "没有找到变量.";
	}
	/** 
	 到达的节点名称
	 
	*/
	public final String getVarCurrNodeName()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarCurrNodeName.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return null;
	}
	public final int getVarCurrNodeID()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarCurrNodeID.equals(item.MsgFlag))
			{
				return Integer.parseInt(item.MsgOfText);
			}
		}
		return 0;
	}
	/** 
	 接受人
	 
	*/
	public final String getVarAcceptersName()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarAcceptersName.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return null;
	}
	/** 
	 接受人IDs
	 
	*/
	public final String getVarAcceptersID()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarAcceptersID.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return null;
	}
	/** 
	 分流向子线程发送时产生的子线程的WorkIDs, 多个有逗号分开.
	 
	*/
	public final String getVarTreadWorkIDs()
	{
		for (SendReturnObj item : this)
		{
			if (SendReturnMsgFlag.VarTreadWorkIDs.equals(item.MsgFlag))
			{
				return item.MsgOfText;
			}
		}
		return null;
	}
		///#endregion

	/** 
	 输出text消息
	 
	*/
	public String OutMessageText = null;
	/** 
	 输出html信息
	 
	*/
	public String OutMessageHtml = null;
	/** 
	 增加消息
	 
	 @param msgFlag 消息标记
	 @param msg 文本消息
	 @param msgOfHtml html消息
	 @param type 消息类型
	*/
	public final void AddMsg(String msgFlag, String msg, String msgOfHtml, SendReturnMsgType type)
	{
		SendReturnObj obj = new SendReturnObj();
		obj.MsgFlag = msgFlag;
		obj.MsgOfText = msg;
		obj.MsgOfHtml = msgOfHtml;
		obj.HisSendReturnMsgType = type;
		for (SendReturnObj item : this)
		{
			if (item.MsgFlag.equals(msgFlag))
			{
				item.MsgFlag = msgFlag;
				item.MsgOfText = msg;
				item.MsgOfHtml = msgOfHtml;
				item.HisSendReturnMsgType = type;
				return;
			}
		}
		this.add(obj);
	}
	/** 
	 转化成特殊的格式
	 
	 @return 
	*/
	public final String ToMsgOfSpecText()
	{
		String msg = "";
		for (SendReturnObj item : this)
		{
			if (item.MsgOfText != null)
			{
				msg += "$" + item.MsgFlag + "^" + item.MsgOfText;
			}
		}

		//增加上 text信息。
		msg += "$" + BP.WF.SendReturnMsgFlag.MsgOfText + "^" + this.ToMsgOfText();

		msg.replace("@@", "@");
		return msg;
	}
	/** 
	 转化成text方式的消息，以方便识别不出来html的设备输出.
	 
	 @return 
	*/
	public final String ToMsgOfText()
	{
		if (this.OutMessageText != null)
		{
			return this.OutMessageText;
		}

		String msg = "";
		for (SendReturnObj item : this)
		{
			if (item.HisSendReturnMsgType == SendReturnMsgType.SystemMsg)
			{
				continue;
			}

			//特殊判断.
			if (SendReturnMsgFlag.IsStopFlow.equals(item.MsgFlag))
			{
				msg += "@" + item.MsgOfHtml;
				continue;
			}


			if (item.MsgOfText != null)
			{
				if (item.MsgOfText.contains("<"))
				{
///#warning 不应该出现.
					BP.DA.Log.DefaultLogWriteLineWarning("@文本信息里面有html标记:" + item.MsgOfText);
					continue;
				}
				msg += "@" + item.MsgOfText;
				continue;
			}

		}
		msg.replace("@@", "@");
		return msg;
	}
	/** 
	 转化成html方式的消息，以方便html的信息输出.
	 
	 @return 
	*/
	public final String ToMsgOfHtml()
	{
		if (this.OutMessageHtml != null)
		{
			return this.OutMessageHtml;
		}

		String msg = "";
		for (SendReturnObj item : this)
		{
			if (item.HisSendReturnMsgType != SendReturnMsgType.Info)
			{
				continue;
			}

			if (item.MsgOfHtml != null)
			{
				msg += "@" + item.MsgOfHtml;
				continue;
			}

			if (item.MsgOfText != null)
			{
				msg += "@" + item.MsgOfText;
				continue;
			}
		}
		msg = msg.replace("@@", "@");
		msg = msg.replace("@@", "@");
		msg = msg.replaceAll("\"","\\\\\"");
		if (msg.equals("@"))
		{
			return "@流程已经完成.";
		}

		return msg;
	}
	
	public final String ToMsgOfHtmlSz()
	{
		if (this.OutMessageHtml != null)
		{
			return this.OutMessageHtml;
		}

		String msg = "";
		for (SendReturnObj item : this)
		{
			if (item.HisSendReturnMsgType != SendReturnMsgType.Info)
			{
				continue;
			}

			if (item.MsgOfHtml != null)
			{
				msg += "@" + item.MsgOfHtml;
				continue;
			}

			if (item.MsgOfText != null)
			{
				msg += "@" + item.MsgOfText;
				continue;
			}
		}
		msg = msg.replace("@@", "@");
		msg = msg.replace("@@", "@");
		if (msg.equals("@"))
		{
			return "@流程已经完成.";
		}

		return msg;
	}

}