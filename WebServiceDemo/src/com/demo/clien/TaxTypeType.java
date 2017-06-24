
package com.demo.clien;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taxTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="Remanufactured"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taxTypeType")
@XmlEnum
public enum TaxTypeType {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Remanufactured")
    REMANUFACTURED("Remanufactured");
    private final String value;

    TaxTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeType fromValue(String v) {
        for (TaxTypeType c: TaxTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
