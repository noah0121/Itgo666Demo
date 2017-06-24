
package com.demo.clien;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EvhcSoap", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EvhcSoap {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.demo.clien.GetPartByEvhcResponse
     */
    @WebMethod(operationName = "GetPartByEvhc", action = "http://www.cliffordthames.com/ebusiness/menus/GetPartByEvhc")
    @WebResult(name = "getPartByEvhcResponse", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
    public GetPartByEvhcResponse getPartByEvhc(
        @WebParam(name = "getPartByEvhc", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
        GetPartByEvhc parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.demo.clien.GetJobsByEvhcResponse
     */
    @WebMethod(operationName = "GetJobsByEvhc", action = "http://www.cliffordthames.com/ebusiness/menus/GetJobsByEvhc")
    @WebResult(name = "getJobsByEvhcResponse", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
    public GetJobsByEvhcResponse getJobsByEvhc(
        @WebParam(name = "getJobsByEvhc", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
        GetJobsByEvhc parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.demo.clien.GetJobDetailsByEvhcResponse
     */
    @WebMethod(operationName = "GetJobDetailsByEvhc", action = "http://www.cliffordthames.com/ebusiness/menus/GetJobDetailsByEvhc")
    @WebResult(name = "getJobDetailsByEvhcResponse", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
    public GetJobDetailsByEvhcResponse getJobDetailsByEvhc(
        @WebParam(name = "getJobDetailsByEvhc", targetNamespace = "http://www.cliffordthames.com/ebusiness/menus/", partName = "parameters")
        GetJobDetailsByEvhc parameters);

}
