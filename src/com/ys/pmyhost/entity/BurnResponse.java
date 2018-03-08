package com.ys.pmyhost.entity;

public class BurnResponse {

	private String jobId;
	private String volumeName;
	private int copyNum;
	private int burnSpeed;
	private int statu;
	
	public BurnResponse(String jobId, String volumeName, int copyNum, int burnSpeed, int statu) {
		super();
		this.jobId = jobId;
		this.volumeName = volumeName;
		this.copyNum = copyNum;
		this.burnSpeed = burnSpeed;
		this.statu = statu;
	}

	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getVolumeName() {
		return volumeName;
	}
	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}
	public int getCopyNum() {
		return copyNum;
	}
	public void setCopyNum(int copyNum) {
		this.copyNum = copyNum;
	}
	public int getBurnSpeed() {
		return burnSpeed;
	}
	public void setBurnSpeed(int burnSpeed) {
		this.burnSpeed = burnSpeed;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}
	
}
