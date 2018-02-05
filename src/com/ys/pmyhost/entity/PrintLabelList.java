package com.ys.pmyhost.entity;

import java.util.ArrayList;

public class PrintLabelList {
	
	private ArrayList<PrintLabelTextOrImg> labelList;
	
	public PrintLabelList(){
		labelList = new ArrayList<PrintLabelTextOrImg>();
	}

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
