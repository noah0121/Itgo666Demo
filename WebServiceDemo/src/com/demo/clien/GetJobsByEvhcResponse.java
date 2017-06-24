
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
 *         &lt;element name="jobsByEvhcResponse" type="{http://www.cliffordthames.com/ebusiness/menus/}jobsByEvhcResponseType"/>
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
    "jobsByEvhcResponse"
})
@XmlRootElement(name = "getJobsByEvhcResponse")
public class GetJobsByEvhcResponse {

    @XmlElement(required = true)
    protected JobsByEvhcResponseType jobsByEvhcResponse;

    /**
     * Gets the value of the jobsByEvhcResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JobsByEvhcResponseType }
     *     
     */
    public JobsByEvhcResponseType getJobsByEvhcResponse() {
        return jobsByEvhcResponse;
    }

    /**
     * Sets the value of the jobsByEvhcResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobsByEvhcResponseType }
     *     
     */
    public void setJobsByEvhcResponse(JobsByEvhcResponseType value) {
        this.jobsByEvhcResponse = value;
    }

}
