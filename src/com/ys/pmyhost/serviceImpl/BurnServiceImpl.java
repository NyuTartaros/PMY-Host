package com.ys.pmyhost.serviceImpl;

import javax.jws.WebService;

import com.ys.pmyhost.entity.BurnJob;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.service.BurnerService;

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
	public BurnJob setNewJob(BurnRequest burnRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BurnJob getJobStatus(BurnRequest burnRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
