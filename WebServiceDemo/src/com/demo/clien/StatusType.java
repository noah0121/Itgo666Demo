
package com.demo.clien;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for statusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communication" type="{http://www.cliffordthames.com/ebusiness/menus/}communicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeInput" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="timeOutput" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="timeSLA" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusType", propOrder = {
    "communication"
})
public class StatusType {

    protected List<CommunicationType> communication;
    @XmlAttribute(name = "timeInput")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeInput;
    @XmlAttribute(name = "timeOutput")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOutput;
    @XmlAttribute(name = "timeSLA")
    protected BigDecimal timeSLA;
    @XmlAttribute(name = "state", required = true)
    protected int state;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType }
     * 
     * 
     */
    public List<CommunicationType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationType>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the timeInput property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeInput() {
        return timeInput;
    }

    /**
     * Sets the value of the timeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeInput(XMLGregorianCalendar value) {
        this.timeInput = value;
    }

    /**
     * Gets the value of the timeOutput property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOutput() {
        return timeOutput;
    }

    /**
     * Sets the value of the timeOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOutput(XMLGregorianCalendar value) {
        this.timeOutput = value;
    }

    /**
     * Gets the value of the timeSLA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeSLA() {
        return timeSLA;
    }

    /**
     * Sets the value of the timeSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeSLA(BigDecimal value) {
        this.timeSLA = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
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

}
