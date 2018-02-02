package com.ys.pmyhost.serviceImpl;

import javax.jws.WebService;

import com.ys.pmyhost.entity.BurnJob;
import com.ys.pmyhost.service.BurnerService;

@WebService(endpointInterface="com.ys.pmyhost.service.BurnService")
public class BurnServiceImpl implements BurnerService{

	@Override
	public BurnJob setNewJob(BurnJob burnJob) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public BurnJob getJobStatus(BurnJob burnJob) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
