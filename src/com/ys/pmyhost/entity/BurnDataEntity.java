package com.ys.pmyhost.entity;

import javax.activation.DataHandler;

public class BurnDataEntity {
	
	private DataHandler data;
	private String filename;

	public BurnDataEntity(DataHandler data, String filename){
		setData(data);
		setFilename(filename);
	}
	
	public void setData(DataHandler data){
		this.data = data;
	}
	
	public DataHandler getData(){
		return data;
	}
	
	public void setFilename(String filename){
		this.filename = filename;
	}
	
	public String getFilename(){
		return filename;
	}
}
