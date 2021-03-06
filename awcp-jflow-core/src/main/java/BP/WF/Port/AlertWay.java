package BP.WF.Port;

import BP.DA.*;
import BP.En.*;
import BP.WF.*;
import BP.Port.*;
import BP.Port.*;
import BP.En.*;
import BP.Web.*;

public enum AlertWay
{
	/** 
	 不提示
	 
	*/
	None,
	/** 
	 手机短信
	 
	*/
	SMS,
	/** 
	 邮件
	 
	*/
	Email,
	/** 
	 手机短信+邮件
	 
	*/
	SMSAndEmail,
	/** 
	 内部消息
	 
	*/
	AppSystemMsg;

	public int getValue()
	{
		return this.ordinal();
	}

	public static AlertWay forValue(int value)
	{
		return values()[value];
	}
}