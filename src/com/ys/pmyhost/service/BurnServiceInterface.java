package com.ys.pmyhost.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlMimeType;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;
import com.ys.pmyhost.entity.PrintLabelList;

@WebService  
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BurnServiceInterface {
	
	@WebMethod
	public boolean startBurnService();
	
	@WebMethod
	public boolean stopBurnService();

	@WebMethod
	public BurnResponse setNewJob(
			@WebParam(name="burnRequese") BurnRequest burnRequest
			, @XmlMimeType("*/*") 
			@WebParam(name="burnDataList") BurnDataList burnDataList
			, @WebParam(name="dataSHA1") String dataSHA1
			, @XmlMimeType("*/*") 
			@WebParam(name="printLabelList") PrintLabelList printLabelList
			, @WebParam(name="labelSHA1") String labelSHA1);
	
	@WebMethod
	public BurnResponse getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest);

}
