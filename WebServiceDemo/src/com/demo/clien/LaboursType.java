
package com.demo.clien;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laboursType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laboursType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labour" type="{http://www.cliffordthames.com/ebusiness/menus/}labourTimeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.cliffordthames.com/ebusiness/menus/}labourSourceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "laboursType", propOrder = {
    "labour"
})
public class LaboursType {

    @XmlElement(required = true)
    protected List<LabourTimeType> labour;
    @XmlAttribute(name = "type", required = true)
    protected LabourSourceType type;

    /**
     * Gets the value of the labour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourTimeType }
     * 
     * 
     */
    public List<LabourTimeType> getLabour() {
        if (labour == null) {
            labour = new ArrayList<LabourTimeType>();
        }
        return this.labour;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LabourSourceType }
     *     
     */
    public LabourSourceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabourSourceType }
     *     
     */
    public void setType(LabourSourceType value) {
        this.type = value;
    }

}
