
package com.demo.clien;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jobSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="NSC"/>
 *     &lt;enumeration value="MAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobSourceType")
@XmlEnum
public enum JobSourceType {

    LOC,
    NSC,
    MAN;

    public String value() {
        return name();
    }

    public static JobSourceType fromValue(String v) {
        return valueOf(v);
    }

}
