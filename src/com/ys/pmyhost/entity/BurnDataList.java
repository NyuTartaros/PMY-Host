package com.ys.pmyhost.entity;

import java.util.ArrayList;

public class BurnDataList {
	
	//TODO 这里实际上应该是树形结构
	private ArrayList<BurnDataEntity> dataList;
	
	public BurnDataList(ArrayList<BurnDataEntity> dataList){
		setDataList(dataList);
	}
	
	public void setDataList(ArrayList<BurnDataEntity> dataList){
		this.dataList = dataList;
	}
	
	public ArrayList<BurnDataEntity> getDataList(){
		return dataList;
	}
	
	public int size(){
		return dataList.size();
	}
	
	public boolean add(BurnDataEntity data){
		return dataList.add(data);
	}
	
	public boolean remove(BurnDataEntity data){
		return dataList.remove(data);
	}
	
	public BurnDataEntity remove(int index){
		return dataList.remove(index);
	}
	
	public BurnDataEntity get(int index){
		return dataList.get(index);
	}

}
