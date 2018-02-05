package com.ys.pmyhost.serviceImpl;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;
import com.ys.pmyhost.service.BurnerService;

@MTOM
@WebService(endpointInterface="com.ys.pmyhost.service.BurnService")
public class BurnServiceImpl implements BurnerService{

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
			, @XmlMimeType("*/*") @WebParam(name="data") BurnDataList burnDataList) {
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
