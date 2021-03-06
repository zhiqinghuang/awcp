package BP.WF.Template.PubLib;

/** 
 抄送数据写入规则
 
*/
public enum CCWriteTo
{
	/** 
	 抄送列表
	 
	*/
	CCList,
	/** 
	 待办列表
	 
	*/
	Todolist,
	/** 
	 抄送与待办列表
	 
	*/
	All;

	public int getValue()
	{
		return this.ordinal();
	}

	public static CCWriteTo forValue(int value)
	{
		return values()[value];
	}
}