package com.ys.pmyhost.entity;

public class BurnJob {
	
	private String jobId;
	private String clientId;
	private int importance;
	private String dataPath;
	private boolean deleteFiles;
	private boolean closeDisc;
	private int copyNum;
	private String printLabel;
	private PrintLabelList mergeField;
	private String volumeName;
	private int burnSpeed;
	private boolean verifyDisc;
	private boolean rejectIfNotBlank;
	private boolean notifyClient;
	private boolean preMasterData;
	private int printQuality;
	private int printInnerDiam;
	private int printOuterMargin;
	
	public BurnJob() {
		
	}
	
	public BurnJob(String jobId, String clientId, int importance, String dataPath, 
			boolean deleteFiles, boolean closeDisc, int copyNum, String printLabel, 
			PrintLabelList mergeField, String volumeName, int burnSpeed, 
			boolean verifyDisc, boolean rejectIfNotBlank, boolean notifyClient, 
			boolean preMasterData, int printQuality, int printInnerDiam, 
			int printOuterMargin) {
		super();
		this.jobId = jobId;
		this.clientId = clientId;
		this.importance = importance;
		this.dataPath = dataPath;
		this.deleteFiles = deleteFiles;
		this.closeDisc = closeDisc;
		this.copyNum = copyNum;
		this.printLabel = printLabel;
		this.mergeField = mergeField;
		this.volumeName = volumeName;
		this.burnSpeed = burnSpeed;
		this.verifyDisc = verifyDisc;
		this.rejectIfNotBlank = rejectIfNotBlank;
		this.notifyClient = notifyClient;
		this.preMasterData = preMasterData;
		this.printQuality = printQuality;
		this.printInnerDiam = printInnerDiam;
		this.printOuterMargin = printOuterMargin;
	}

	public void setJobId(String jobId){
		this.jobId = jobId;
	}
	
	public String getJobId(){
		return jobId;
	}
	
	public void setClientId(String clientId){
		this.clientId = clientId;
	}
	
	public String getClientId(){
		return clientId;
	}
	
	public void setImportance(int importance){
		this.importance = importance;
	}
	
	public int getImportance(){
		return importance;
	}
	
	public void setDataPath(String dataPath)
	{
		this.dataPath = dataPath;
	}
	
	public String getDataPath(){
		return dataPath;
	}
	
	public void setDeleteFiles(boolean deleteFiles){
		this.deleteFiles = deleteFiles;
	}
	
	public boolean getDeleteFiles(){
		return deleteFiles;
	}
	
	public void setCloseDisc(boolean closeDisc){
		this.closeDisc = closeDisc;
	}
	
	public boolean getCloseDisc(){
		return closeDisc;
	}
	
	public void setCopyNum(int copyNum){
		this.copyNum = copyNum;
	}
	
	public int getCopyNum(){
		return copyNum;
	}
	
	public void setPrintLabel(String printLabel){
		this.printLabel = printLabel;
	}
	
	public String getPrintLabel(){
		return printLabel;
	}
	
	public void setMergeField(PrintLabelList mergeField){
		this.mergeField = mergeField;
	}
	
	public PrintLabelList getMergeField(){
		return mergeField;
	}
	
	public void setVolumeName(String volumeName){
		this.volumeName = volumeName;
	}
	
	public String getVolumeName(){
		return volumeName;
	}
	
	public void setBurnSpeed(int burnSpeed){
		this.burnSpeed = burnSpeed;
	}
	
	public int getBurnSpeed(){
		return burnSpeed;
	}
	
	public void setVerifyDisc(boolean verifyDisc){
		this.verifyDisc = verifyDisc;
	}
	
	public boolean getVerifyDisc(){
		return verifyDisc;
	}
	
	public void setRejectIfNotBlank(boolean rejectIfNotBlank){
		this.rejectIfNotBlank = rejectIfNotBlank;
	}
	
	public boolean getRejectIfNotBlank(){
		return rejectIfNotBlank;
	}
	
	public void setNotifyClient(boolean notifyClient){
		this.notifyClient = notifyClient;
	}
	
	public boolean getNotifyClient(){
		return notifyClient;
	}
	
	public void setPreMasterData(boolean preMasterData){
		this.preMasterData = preMasterData;
	}
	
	public boolean getPreMasterData(){
		return preMasterData;
	}
	
	public void setPrintQuality(int printQuality){
		this.printQuality = printQuality;
	}
	
	public int getPrintQuality() {
		return printQuality;
	}
	
	public int getPrintInnerDiam() {
		return printInnerDiam;
	}

	public void setPrintInnerDiam(int printInnerDiam) {
		this.printInnerDiam = printInnerDiam;
	}

	public int getPrintOuterMargin() {
		return printOuterMargin;
	}

	public void setPrintOuterMargin(int printOuterMargin) {
		this.printOuterMargin = printOuterMargin;
	}



}