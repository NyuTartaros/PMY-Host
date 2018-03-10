package com.ys.pmyhost.entity;

import javax.activation.DataHandler;

public class BurnDataEntity {
	
	private DataHandler data;
	private String filename;

	/**
	 * 声明一个包含单个文件的Data实体类
	 * @param data 包含文件的二进制数据的DataHandler实例
	 * @param filename 文件名
	 */
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
