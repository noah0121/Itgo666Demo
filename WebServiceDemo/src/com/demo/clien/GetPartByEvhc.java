
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
 *         &lt;element name="partByEvhcRequest" type="{http://www.cliffordthames.com/ebusiness/menus/}partByEvhcRequestType"/>
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
    "partByEvhcRequest"
})
@XmlRootElement(name = "getPartByEvhc")
public class GetPartByEvhc {

    @XmlElement(required = true)
    protected PartByEvhcRequestType partByEvhcRequest;

    /**
     * Gets the value of the partByEvhcRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PartByEvhcRequestType }
     *     
     */
    public PartByEvhcRequestType getPartByEvhcRequest() {
        return partByEvhcRequest;
    }

    /**
     * Sets the value of the partByEvhcRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartByEvhcRequestType }
     *     
     */
    public void setPartByEvhcRequest(PartByEvhcRequestType value) {
        this.partByEvhcRequest = value;
    }

}
