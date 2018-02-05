package com.ys.pmyhost.serviceImpl;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;
import com.ys.pmyhost.entity.PrintLabelList;
import com.ys.pmyhost.service.BurnServiceInterface;

@MTOM
@WebService(endpointInterface="com.ys.pmyhost.service.BurnServiceInterface")
public class BurnServiceImpl implements BurnServiceInterface{

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
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public BurnResponse getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
