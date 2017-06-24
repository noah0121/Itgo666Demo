
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
 *         &lt;element name="jobsByEvhcRequest" type="{http://www.cliffordthames.com/ebusiness/menus/}jobsByEvhcRequestType"/>
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
    "jobsByEvhcRequest"
})
@XmlRootElement(name = "getJobsByEvhc")
public class GetJobsByEvhc {

    @XmlElement(required = true)
    protected JobsByEvhcRequestType jobsByEvhcRequest;

    /**
     * Gets the value of the jobsByEvhcRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JobsByEvhcRequestType }
     *     
     */
    public JobsByEvhcRequestType getJobsByEvhcRequest() {
        return jobsByEvhcRequest;
    }

    /**
     * Sets the value of the jobsByEvhcRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobsByEvhcRequestType }
     *     
     */
    public void setJobsByEvhcRequest(JobsByEvhcRequestType value) {
        this.jobsByEvhcRequest = value;
    }

}
