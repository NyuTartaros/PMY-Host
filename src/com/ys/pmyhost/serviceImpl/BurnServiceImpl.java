package com.ys.pmyhost.serviceImpl;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;
import com.ys.pmyhost.entity.PrintLabelList;
import com.ys.pmyhost.service.BurnService;
import com.ys.pmyhost.serviceInterface.BurnServiceInterface;

@MTOM
@WebService(endpointInterface="com.ys.pmyhost.serviceInterface.BurnServiceInterface")
public class BurnServiceImpl implements BurnServiceInterface{
	
	private BurnService burnService;
	
	public BurnServiceImpl(BurnService burnService) {
		// TODO Auto-generated constructor stub
		this.burnService = burnService;
	}

	@Override
	public boolean startBurnService() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopBurnService() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BurnResponse setNewJob(
			@WebParam(name="burnRequese") BurnRequest burnRequest
			, @XmlMimeType("*/*") 
			@WebParam(name="burnDataList") BurnDataList burnDataList
			, @WebParam(name="dataSHA1") String dataSHA1
			, @XmlMimeType("*/*") 
			@WebParam(name="printLabelList") PrintLabelList printLabelList
			, @WebParam(name="labelSHA1") String labelSHA1) {
		//TODO burnRequest参数合法性校验
		
		//TODO data SHA1校验
		
		//TODO label SHA1校验
		
		
		//burnService.setNewJob(newJob);
		return null;
	}

	@Override
	public BurnResponse getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest) {
		//TODO burnRequest参数合法性校验
		
		
		//burnService.getJobStatus(burnRequest.getJobId());
		return null;
	}

}
