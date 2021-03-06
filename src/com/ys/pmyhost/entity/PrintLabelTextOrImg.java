package com.ys.pmyhost.entity;

import javax.activation.DataHandler;

public class PrintLabelTextOrImg {

	private int labelType;
	private String text;
	private DataHandler image;
	private String imgFormat;
	
	public static final int TEXT_TYPE = 0;
	public static final int IMAGE_TYPE = 1;
	
	/**
	 * 声明一个文字形式的PrintLabel的实例
	 * @param text 
	 */
	public PrintLabelTextOrImg(String text){
		setText(text);
	}
	
	/**
	 * 声明一个图片形式的PrintLabel的实例
	 * @param image 包含了图片二进制数据的DataHandler实例
	 * @param imgFormat 图片格式
	 */
	public PrintLabelTextOrImg(DataHandler image, String imgFormat){
		//TODO 这里应该throw一个专门定制的error类
		if(!checkImgFormat(imgFormat)){
			System.err.println("image format illegal.");
		}
		setImage(image);
		setImgFormat(imgFormat);
	}
	
	public void setLabelType(int labelType){
		this.labelType = labelType;
	}
	
	public int getLabelType(){
		return labelType;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText(){
		return text;
	}
	
	public void setImage(DataHandler image){
		this.image = image;
	}
	
	public DataHandler getImage(){
		return image;
	}
	
	public void setImgFormat(String imgFormat){
		this.imgFormat = imgFormat;
	}
	
	public String getImgFormat(){
		return imgFormat;
	}
	
	/**
	 * 检查图片格式是否可以被打印到盘面
	 * 目前只能接受jpg, bmp
	 * @param imgFormat 盘面图片的格式
	 * @return 当可以打印时返回true
	 */
	public static boolean checkImgFormat(String imgFormat){
		String[] permittedFormats = {
				".bmp", ".jpg"
		};
		for(int i=0; i<permittedFormats.length; i++){
			if(imgFormat.equals(permittedFormats[i])){
				return true;
			}
		}
		return false;
	}
	
}
