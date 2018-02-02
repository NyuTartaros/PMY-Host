package com.ys.pmyhost.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.ys.pmyhost.entity.BurnJob;

@WebService  
@SOAPBinding(style = SOAPBinding.Style.RPC)  
public interface BurnerService {

	@WebMethod
	public BurnJob setNewJob(@WebParam(name="burnJob") BurnJob burnJob);
	
	@WebMethod
	public BurnJob getJobStatus(@WebParam(name="burnJob") BurnJob burnJob);

}
