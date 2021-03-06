package cn.org.awcp.formdesigner.application.service;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.itextpdf.text.DocumentException;

import cn.org.awcp.formdesigner.application.vo.StoreVO;

public interface PrintService {

	@SuppressWarnings("rawtypes")
	public  void printPDF(StoreVO printManageVO,Map dataMap,OutputStream os);
	
	@SuppressWarnings("rawtypes")
	public  void batchPrintPDF(List<StoreVO> printManageVOs,List<Map> dataMaps,
			List<List<JSONObject>> componentsList, OutputStream os);
	
	@SuppressWarnings("rawtypes")
	public  void printPDFByTemplate(StoreVO printManageVO,Map dataMap,OutputStream os,
			List<JSONObject> components) throws DocumentException;
	
	public byte[] getFileByFileId(String fileId);
	
}
