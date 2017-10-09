package org.szcloud.framework.formdesigner.application.service;

import java.util.List;
import java.util.Map;

import org.szcloud.framework.core.common.exception.MRTException;
import org.szcloud.framework.core.domain.BaseExample;
import org.szcloud.framework.formdesigner.application.vo.SuggestionVO;

import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface SuggestionService {

	/**
	 * 
	 * @param dynamicPageId
	 * @return
	 */
	SuggestionVO findById(String id);
			
	/**
	 * 
	 * 等值查询
	 * @param queryStr
	 * @param params
	 * @param currentPage
	 * @param pageSize
	 * @param sortString
	 * @return
	 */
	public PageList<SuggestionVO> queryPagedResult(String queryStr,Map<String, Object> params, 
			int currentPage, int pageSize,String sortString);

	/**
	 * 模糊查询分页显示
	 * 
	 * @param example
	 *            查询条件
	 * @param currentPage
	 *            当前页数
	 * @param pageSize
	 *            每页显示记录数
	 * @param sortString
	 *            排序
	 * @return
	 */
	public PageList<SuggestionVO> selectPagedByExample(BaseExample example,
			int currentPage, int pageSize, String sortString);
	
	public String save(SuggestionVO vo);
	
	public boolean delete(String[] ids);
	
	public List<SuggestionVO> queryResult(String queryStr,Map<String, Object> params)throws MRTException;

}
