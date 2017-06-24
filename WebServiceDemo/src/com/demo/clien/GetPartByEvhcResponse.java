
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
 *         &lt;element name="partByEvhcResponse" type="{http://www.cliffordthames.com/ebusiness/menus/}partByEvhcResponseType"/>
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
    "partByEvhcResponse"
})
@XmlRootElement(name = "getPartByEvhcResponse")
public class GetPartByEvhcResponse {

    @XmlElement(required = true)
    protected PartByEvhcResponseType partByEvhcResponse;

    /**
     * Gets the value of the partByEvhcResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PartByEvhcResponseType }
     *     
     */
    public PartByEvhcResponseType getPartByEvhcResponse() {
        return partByEvhcResponse;
    }

    /**
     * Sets the value of the partByEvhcResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartByEvhcResponseType }
     *     
     */
    public void setPartByEvhcResponse(PartByEvhcResponseType value) {
        this.partByEvhcResponse = value;
    }

}
