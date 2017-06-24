
package com.demo.clien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partByEvhcRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partByEvhcRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealerDetails" type="{http://www.cliffordthames.com/ebusiness/menus/}dealerDetailsType"/>
 *         &lt;element name="evhcProviderDetails" type="{http://www.cliffordthames.com/ebusiness/menus/}evhcProviderDetailsType"/>
 *         &lt;element name="part" type="{http://www.cliffordthames.com/ebusiness/menus/}partType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partByEvhcRequestType", propOrder = {
    "dealerDetails",
    "evhcProviderDetails",
    "part"
})
public class PartByEvhcRequestType {

    @XmlElement(required = true)
    protected DealerDetailsType dealerDetails;
    @XmlElement(required = true)
    protected EvhcProviderDetailsType evhcProviderDetails;
    @XmlElement(required = true)
    protected List<PartType> part;

    /**
     * Gets the value of the dealerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DealerDetailsType }
     *     
     */
    public DealerDetailsType getDealerDetails() {
        return dealerDetails;
    }

    /**
     * Sets the value of the dealerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealerDetailsType }
     *     
     */
    public void setDealerDetails(DealerDetailsType value) {
        this.dealerDetails = value;
    }

    /**
     * Gets the value of the evhcProviderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EvhcProviderDetailsType }
     *     
     */
    public EvhcProviderDetailsType getEvhcProviderDetails() {
        return evhcProviderDetails;
    }

    /**
     * Sets the value of the evhcProviderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvhcProviderDetailsType }
     *     
     */
    public void setEvhcProviderDetails(EvhcProviderDetailsType value) {
        this.evhcProviderDetails = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartType }
     * 
     * 
     */
    public List<PartType> getPart() {
        if (part == null) {
            part = new ArrayList<PartType>();
        }
        return this.part;
    }

}
