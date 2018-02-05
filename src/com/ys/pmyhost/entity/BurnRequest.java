package com.ys.pmyhost.entity;

public class BurnRequest {
	
	private String jobId;
	private String volumeName;
	private int copyNum;
	private int burnSpeed;
	
	public BurnRequest(String jobId, String volumeName
			, int copyNum, int burnSpeed){
		setJobId(jobId);
		setVolumeName(volumeName);
		setCopyNum(copyNum);
		setBurnSpeed(burnSpeed);
	}
	
	public void setJobId(String jobId){
		this.jobId = jobId;
	}

	public String getJobId(){
		return jobId;
	}
	
	public void setVolumeName(String volumeName){
		this.volumeName = volumeName;
	}
	
	public String getVolumeName(){
		return volumeName;
	}
	
	public void setCopyNum(int copyNum){
		this.copyNum = copyNum;
	}
	
	public int getCopyNum(){
		return copyNum;
	}
	
	public void setBurnSpeed(int burnSpeed){
		this.burnSpeed = burnSpeed;
	}
	
	public int getBurnSpeed(){
		return burnSpeed;
	}
	
}
