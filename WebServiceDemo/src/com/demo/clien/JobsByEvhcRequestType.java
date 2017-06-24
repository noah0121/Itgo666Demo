
package com.demo.clien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobsByEvhcRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobsByEvhcRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealerDetails" type="{http://www.cliffordthames.com/ebusiness/menus/}dealerDetailsType"/>
 *         &lt;element name="evhcProviderDetails" type="{http://www.cliffordthames.com/ebusiness/menus/}evhcProviderDetailsType"/>
 *         &lt;element name="vehicleMatch" type="{http://www.cliffordthames.com/ebusiness/menus/}vehicleType"/>
 *         &lt;element name="job" type="{http://www.cliffordthames.com/ebusiness/menus/}jobType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobsByEvhcRequestType", propOrder = {
    "dealerDetails",
    "evhcProviderDetails",
    "vehicleMatch",
    "job"
})
public class JobsByEvhcRequestType {

    @XmlElement(required = true)
    protected DealerDetailsType dealerDetails;
    @XmlElement(required = true)
    protected EvhcProviderDetailsType evhcProviderDetails;
    @XmlElement(required = true)
    protected VehicleType vehicleMatch;
    protected List<JobType> job;

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
     * Gets the value of the vehicleMatch property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicleMatch() {
        return vehicleMatch;
    }

    /**
     * Sets the value of the vehicleMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicleMatch(VehicleType value) {
        this.vehicleMatch = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobType }
     * 
     * 
     */
    public List<JobType> getJob() {
        if (job == null) {
            job = new ArrayList<JobType>();
        }
        return this.job;
    }

}
