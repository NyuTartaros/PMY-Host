package com.ys.pmyhost.entity;

import java.util.ArrayList;

public class PrintLabelList {
	
	private ArrayList<PrintLabelTextOrImg> labelList;
	
	public PrintLabelList(){
		labelList = new ArrayList<PrintLabelTextOrImg>();
	}

	/**
	 * 声明一个包含一次打印任务中所有PrintLabel的List实例
	 * @param labelList 一次打印任务中所有PrintLabel组成的ArrayList
	 */
	public PrintLabelList(ArrayList<PrintLabelTextOrImg> labelList){
		this.labelList = labelList;
	}

	public ArrayList<PrintLabelTextOrImg> getlist(){
		return labelList;
	}
	
	public int size(){
		return labelList.size();
	}
	
	public boolean add(PrintLabelTextOrImg label){
		return labelList.add(label);
	}
	
	public boolean remove(PrintLabelTextOrImg label){
		return labelList.remove(label);
	}
	
	public PrintLabelTextOrImg remove(int index){
		return labelList.remove(index);
	}
	
	public PrintLabelTextOrImg get(int index){
		return labelList.get(index);
	}

}
