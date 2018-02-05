package com.ys.pmyhost.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlMimeType;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;

@WebService  
@SOAPBinding(style = SOAPBinding.Style.RPC)  
public interface BurnerService {
	
	@WebMethod
	public boolean startBurnService();
	
	@WebMethod
	public boolean stopBurnService();

	@WebMethod
	public BurnResponse setNewJob(
			@WebParam(name="burnRequese") BurnRequest burnRequest
			, @XmlMimeType("*/*") @WebParam(name="data") BurnDataList burnDataList);
	
	@WebMethod
	public BurnResponse getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest);

}
