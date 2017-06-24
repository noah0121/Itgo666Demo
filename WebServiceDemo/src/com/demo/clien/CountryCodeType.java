
package com.demo.clien;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="countryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="xx"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BL"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BQ"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="GG"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="GQ"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="GY"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HM"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JE"/>
 *     &lt;enumeration value="JM"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LC"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MF"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="QA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="SX"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="SZ"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="TF"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VC"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VG"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VU"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="YU"/>
 *     &lt;enumeration value="YT"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "countryCodeType")
@XmlEnum
public enum CountryCodeType {

    @XmlEnumValue("xx")
    XX("xx"),
    AD("AD"),
    AE("AE"),
    AF("AF"),
    AG("AG"),
    AI("AI"),
    AL("AL"),
    AM("AM"),
    AO("AO"),
    AQ("AQ"),
    AR("AR"),
    AS("AS"),
    AT("AT"),
    AU("AU"),
    AW("AW"),
    AX("AX"),
    AZ("AZ"),
    BA("BA"),
    BB("BB"),
    BD("BD"),
    BE("BE"),
    BF("BF"),
    BG("BG"),
    BH("BH"),
    BI("BI"),
    BJ("BJ"),
    BL("BL"),
    BM("BM"),
    BN("BN"),
    BO("BO"),
    BQ("BQ"),
    BR("BR"),
    BS("BS"),
    BT("BT"),
    BV("BV"),
    BW("BW"),
    BY("BY"),
    BZ("BZ"),
    CA("CA"),
    CC("CC"),
    CD("CD"),
    CF("CF"),
    CG("CG"),
    CH("CH"),
    CI("CI"),
    CK("CK"),
    CL("CL"),
    CM("CM"),
    CN("CN"),
    CO("CO"),
    CR("CR"),
    CS("CS"),
    CU("CU"),
    CV("CV"),
    CW("CW"),
    CX("CX"),
    CY("CY"),
    CZ("CZ"),
    DE("DE"),
    DJ("DJ"),
    DK("DK"),
    DM("DM"),
    DO("DO"),
    DZ("DZ"),
    EC("EC"),
    EE("EE"),
    EG("EG"),
    EH("EH"),
    ER("ER"),
    ES("ES"),
    ET("ET"),
    FI("FI"),
    FJ("FJ"),
    FK("FK"),
    FM("FM"),
    FO("FO"),
    FR("FR"),
    GA("GA"),
    GB("GB"),
    GD("GD"),
    GE("GE"),
    GF("GF"),
    GG("GG"),
    GH("GH"),
    GI("GI"),
    GL("GL"),
    GM("GM"),
    GN("GN"),
    GP("GP"),
    GQ("GQ"),
    GR("GR"),
    GS("GS"),
    GT("GT"),
    GU("GU"),
    GW("GW"),
    GY("GY"),
    HK("HK"),
    HM("HM"),
    HN("HN"),
    HR("HR"),
    HT("HT"),
    HU("HU"),
    ID("ID"),
    IE("IE"),
    IL("IL"),
    IM("IM"),
    IN("IN"),
    IO("IO"),
    IQ("IQ"),
    IR("IR"),
    IS("IS"),
    IT("IT"),
    JE("JE"),
    JM("JM"),
    JO("JO"),
    JP("JP"),
    KE("KE"),
    KG("KG"),
    KH("KH"),
    KI("KI"),
    KM("KM"),
    KN("KN"),
    KP("KP"),
    KR("KR"),
    KW("KW"),
    KY("KY"),
    KZ("KZ"),
    LA("LA"),
    LB("LB"),
    LC("LC"),
    LI("LI"),
    LK("LK"),
    LR("LR"),
    LS("LS"),
    LT("LT"),
    LU("LU"),
    LV("LV"),
    LY("LY"),
    MA("MA"),
    MC("MC"),
    MD("MD"),
    ME("ME"),
    MF("MF"),
    MG("MG"),
    MH("MH"),
    MK("MK"),
    ML("ML"),
    MM("MM"),
    MN("MN"),
    MO("MO"),
    MP("MP"),
    MQ("MQ"),
    MR("MR"),
    MS("MS"),
    MT("MT"),
    MU("MU"),
    MV("MV"),
    MW("MW"),
    MX("MX"),
    MY("MY"),
    MZ("MZ"),
    NA("NA"),
    NC("NC"),
    NE("NE"),
    NF("NF"),
    NG("NG"),
    NI("NI"),
    NL("NL"),
    NO("NO"),
    NP("NP"),
    NR("NR"),
    NU("NU"),
    NZ("NZ"),
    OM("OM"),
    PA("PA"),
    PE("PE"),
    PF("PF"),
    PG("PG"),
    PH("PH"),
    PK("PK"),
    PL("PL"),
    PM("PM"),
    PN("PN"),
    PR("PR"),
    PS("PS"),
    PT("PT"),
    PW("PW"),
    PY("PY"),
    QA("QA"),
    RE("RE"),
    RO("RO"),
    RS("RS"),
    RU("RU"),
    RW("RW"),
    SA("SA"),
    SB("SB"),
    SC("SC"),
    SD("SD"),
    SE("SE"),
    SG("SG"),
    SH("SH"),
    SI("SI"),
    SJ("SJ"),
    SK("SK"),
    SL("SL"),
    SM("SM"),
    SN("SN"),
    SO("SO"),
    SR("SR"),
    SS("SS"),
    ST("ST"),
    SV("SV"),
    SX("SX"),
    SY("SY"),
    SZ("SZ"),
    TC("TC"),
    TD("TD"),
    TF("TF"),
    TG("TG"),
    TH("TH"),
    TJ("TJ"),
    TK("TK"),
    TL("TL"),
    TM("TM"),
    TN("TN"),
    TO("TO"),
    TR("TR"),
    TT("TT"),
    TV("TV"),
    TW("TW"),
    TZ("TZ"),
    UA("UA"),
    UG("UG"),
    UM("UM"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VA("VA"),
    VC("VC"),
    VE("VE"),
    VG("VG"),
    VI("VI"),
    VN("VN"),
    VU("VU"),
    WF("WF"),
    WS("WS"),
    YE("YE"),
    YU("YU"),
    YT("YT"),
    ZA("ZA"),
    ZM("ZM"),
    ZW("ZW");
    private final String value;

    CountryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryCodeType fromValue(String v) {
        for (CountryCodeType c: CountryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
