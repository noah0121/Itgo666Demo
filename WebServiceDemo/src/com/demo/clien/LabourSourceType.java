
package com.demo.clien;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for labourSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="labourSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="NSC"/>
 *     &lt;enumeration value="MAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "labourSourceType")
@XmlEnum
public enum LabourSourceType {

    LOC,
    NSC,
    MAN;

    public String value() {
        return name();
    }

    public static LabourSourceType fromValue(String v) {
        return valueOf(v);
    }

}
