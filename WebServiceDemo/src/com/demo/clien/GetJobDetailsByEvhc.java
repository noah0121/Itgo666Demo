
package com.demo.clien;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobDetailsByEvhcRequest" type="{http://www.cliffordthames.com/ebusiness/menus/}jobDetailsByEvhcRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "jobDetailsByEvhcRequest"
})
@XmlRootElement(name = "getJobDetailsByEvhc")
public class GetJobDetailsByEvhc {

    @XmlElement(required = true)
    protected JobDetailsByEvhcRequestType jobDetailsByEvhcRequest;

    /**
     * Gets the value of the jobDetailsByEvhcRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JobDetailsByEvhcRequestType }
     *     
     */
    public JobDetailsByEvhcRequestType getJobDetailsByEvhcRequest() {
        return jobDetailsByEvhcRequest;
    }

    /**
     * Sets the value of the jobDetailsByEvhcRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDetailsByEvhcRequestType }
     *     
     */
    public void setJobDetailsByEvhcRequest(JobDetailsByEvhcRequestType value) {
        this.jobDetailsByEvhcRequest = value;
    }

}
