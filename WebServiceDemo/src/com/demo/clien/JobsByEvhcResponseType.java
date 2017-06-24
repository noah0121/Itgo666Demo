
package com.demo.clien;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobsByEvhcResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobsByEvhcResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.cliffordthames.com/ebusiness/menus/}statusType"/>
 *         &lt;element name="vehicle" type="{http://www.cliffordthames.com/ebusiness/menus/}vehicleType" minOccurs="0"/>
 *         &lt;element name="jobHierarchy" type="{http://www.cliffordthames.com/ebusiness/menus/}jobHierarchyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobsByEvhcResponseType", propOrder = {
    "status",
    "vehicle",
    "jobHierarchy"
})
public class JobsByEvhcResponseType {

    @XmlElement(required = true)
    protected StatusType status;
    protected VehicleType vehicle;
    protected JobHierarchyType jobHierarchy;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the jobHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link JobHierarchyType }
     *     
     */
    public JobHierarchyType getJobHierarchy() {
        return jobHierarchy;
    }

    /**
     * Sets the value of the jobHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobHierarchyType }
     *     
     */
    public void setJobHierarchy(JobHierarchyType value) {
        this.jobHierarchy = value;
    }

}
