package com.ys.pmyhost.entity;

import java.util.ArrayList;

public class BurnDataList {
	
	//TODO 这里实际上应该是树形结构
	private ArrayList<BurnDataEntity> dataList;
	
	/**
	 * 声明包含一个刻录任务的所有文件的List实例
	 * @param dataList 所有需要打印的文件生成的BurnDataEntity组成的ArrayList
	 */
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
