
package com.demo.clien;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vinMatch" type="{http://www.cliffordthames.com/ebusiness/menus/}vinType" minOccurs="0"/>
 *         &lt;element name="regMatch" type="{http://www.cliffordthames.com/ebusiness/menus/}regType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleType", propOrder = {
    "vinMatch",
    "regMatch"
})
public class VehicleType {

    protected String vinMatch;
    protected String regMatch;

    /**
     * Gets the value of the vinMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinMatch() {
        return vinMatch;
    }

    /**
     * Sets the value of the vinMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinMatch(String value) {
        this.vinMatch = value;
    }

    /**
     * Gets the value of the regMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegMatch() {
        return regMatch;
    }

    /**
     * Sets the value of the regMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegMatch(String value) {
        this.regMatch = value;
    }

}
