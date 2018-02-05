package com.ys.pmyhost.entity;

import javax.activation.DataHandler;

public class PrintLabelTextOrImg {

	private int labelType;
	private String text;
	private DataHandler image;
	private String imgFormat;
	
	public static final int TEXT_TYPE = 0;
	public static final int IMAGE_TYPE = 1;
	
	public PrintLabelTextOrImg(int labelType, String text){
		//TODO ����Ӧ��throwһ��ר�Ŷ��Ƶ�error��
		if(labelType != TEXT_TYPE){
			System.err.println("when param contains text, "
					+ "labelType must be TEXT_TYPE.");
		}
		setText(text);
	}
	
	public PrintLabelTextOrImg(int labelType, DataHandler image, String imgFormat){
		//TODO ����Ӧ��throwһ��ר�Ŷ��Ƶ�error��
		if(labelType != IMAGE_TYPE){
			System.err.println("when param contains image, "
					+ "labelType must be IMAGE_TYPE.");
		}
		//TODO ����Ӧ��throwһ��ר�Ŷ��Ƶ�error��
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
	 * ���ͼƬ��ʽ�Ƿ���Ա���ӡ������
	 * Ŀǰֻ�ܽ���jpg, bmp
	 * @param imgFormat ����ͼƬ�ĸ�ʽ
	 * @return �����Դ�ӡʱ����true
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
