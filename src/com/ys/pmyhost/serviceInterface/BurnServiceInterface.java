package com.ys.pmyhost.serviceInterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlMimeType;

import com.ys.pmyhost.entity.BurnDataList;
import com.ys.pmyhost.entity.BurnRequest;
import com.ys.pmyhost.entity.BurnResponse;
import com.ys.pmyhost.entity.PrintLabelList;

/**
 * Interface of burn service as a WebService.
 * @author NyuTartaros
 *
 */
@WebService  
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BurnServiceInterface {
	
	/**
	 * Start the burn service.
	 * @return true if success
	 */
	@WebMethod
	public boolean startBurnService();
	
	/**
	 * Stop the burn service.
	 * @return true if seccess
	 */
	@WebMethod
	public boolean stopBurnService();

	/**
	 * Set up a new burn job.
	 * @param burnRequest - A BurnRequest instance contains job info
	 * @param burnDataList - A BurnDataList instance contains all data of this 
	 * burn job
	 * @param dataSHA1 - SHA1 of all burn data, String type
	 * @param printLabelList - A PrintLabelList instance contains all print label
	 * @param labelSHA1 - SHA1 of all print label, String type
	 * @return A BurnResponse instance contains job info if success, null if
	 * failed
	 */
	@WebMethod
	public BurnResponse setNewJob(
			@WebParam(name="burnRequese") BurnRequest burnRequest
			, @XmlMimeType("*/*") 
			@WebParam(name="burnDataList") BurnDataList burnDataList
			, @WebParam(name="dataSHA1") String dataSHA1
			, @XmlMimeType("*/*") 
			@WebParam(name="printLabelList") PrintLabelList printLabelList
			, @WebParam(name="labelSHA1") String labelSHA1);
	
	/**
	 * Get status of a given job.
	 * @param burnRequest A BurnRequest instance contains job info
	 * @return A BurnResponse instance contains job info
	 */
	@WebMethod
	public BurnResponse getJobStatus(
			@WebParam(name="burnRequese") BurnRequest burnRequest);

}
