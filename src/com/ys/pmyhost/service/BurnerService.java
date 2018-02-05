package com.ys.pmyhost.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.ys.pmyhost.entity.BurnJob;
import com.ys.pmyhost.entity.BurnRequest;

@WebService  
@SOAPBinding(style = SOAPBinding.Style.RPC)  
public interface BurnerService {
	
	@WebMethod
	public boolean startBurnService();
	
	@WebMethod
	public boolean stopBurnService();

	@WebMethod
	public BurnJob setNewJob(@WebParam(name="burnRequese") BurnRequest burnRequest);
	
	@WebMethod
	public BurnJob getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest);

}
