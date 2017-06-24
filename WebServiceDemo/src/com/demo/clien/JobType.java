
package com.demo.clien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="range" type="{http://www.cliffordthames.com/ebusiness/menus/}rangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotion" type="{http://www.cliffordthames.com/ebusiness/menus/}promotionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partsList" type="{http://www.cliffordthames.com/ebusiness/menus/}partsListType" minOccurs="0"/>
 *         &lt;element name="labours" type="{http://www.cliffordthames.com/ebusiness/menus/}laboursType" minOccurs="0"/>
 *         &lt;element name="jobAddOns" type="{http://www.cliffordthames.com/ebusiness/menus/}jobAddOnsType" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobDifficulty" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="jobSource" use="required" type="{http://www.cliffordthames.com/ebusiness/menus/}jobSourceType" />
 *       &lt;attribute name="core" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="service" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobType", propOrder = {
    "range",
    "promotion",
    "partsList",
    "labours",
    "jobAddOns",
    "notes"
})
public class JobType {

    protected List<RangeType> range;
    protected List<PromotionType> promotion;
    protected PartsListType partsList;
    protected LaboursType labours;
    protected JobAddOnsType jobAddOns;
    protected String notes;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "jobDifficulty")
    protected Integer jobDifficulty;
    @XmlAttribute(name = "jobSource", required = true)
    protected JobSourceType jobSource;
    @XmlAttribute(name = "core", required = true)
    protected boolean core;
    @XmlAttribute(name = "service", required = true)
    protected boolean service;

    /**
     * Gets the value of the range property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeType }
     * 
     * 
     */
    public List<RangeType> getRange() {
        if (range == null) {
            range = new ArrayList<RangeType>();
        }
        return this.range;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

    /**
     * Gets the value of the partsList property.
     * 
     * @return
     *     possible object is
     *     {@link PartsListType }
     *     
     */
    public PartsListType getPartsList() {
        return partsList;
    }

    /**
     * Sets the value of the partsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsListType }
     *     
     */
    public void setPartsList(PartsListType value) {
        this.partsList = value;
    }

    /**
     * Gets the value of the labours property.
     * 
     * @return
     *     possible object is
     *     {@link LaboursType }
     *     
     */
    public LaboursType getLabours() {
        return labours;
    }

    /**
     * Sets the value of the labours property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaboursType }
     *     
     */
    public void setLabours(LaboursType value) {
        this.labours = value;
    }

    /**
     * Gets the value of the jobAddOns property.
     * 
     * @return
     *     possible object is
     *     {@link JobAddOnsType }
     *     
     */
    public JobAddOnsType getJobAddOns() {
        return jobAddOns;
    }

    /**
     * Sets the value of the jobAddOns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobAddOnsType }
     *     
     */
    public void setJobAddOns(JobAddOnsType value) {
        this.jobAddOns = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the jobDifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobDifficulty() {
        return jobDifficulty;
    }

    /**
     * Sets the value of the jobDifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobDifficulty(Integer value) {
        this.jobDifficulty = value;
    }

    /**
     * Gets the value of the jobSource property.
     * 
     * @return
     *     possible object is
     *     {@link JobSourceType }
     *     
     */
    public JobSourceType getJobSource() {
        return jobSource;
    }

    /**
     * Sets the value of the jobSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSourceType }
     *     
     */
    public void setJobSource(JobSourceType value) {
        this.jobSource = value;
    }

    /**
     * Gets the value of the core property.
     * 
     */
    public boolean isCore() {
        return core;
    }

    /**
     * Sets the value of the core property.
     * 
     */
    public void setCore(boolean value) {
        this.core = value;
    }

    /**
     * Gets the value of the service property.
     * 
     */
    public boolean isService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     */
    public void setService(boolean value) {
        this.service = value;
    }

}
