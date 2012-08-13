//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.12 at 09:56:19 PM CEST 
//


package home_automation.settings.ports;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADCType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADCPorts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence>
 *                     &lt;element name="port" type="{ports.settings.home_automation}Info" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADCType", propOrder = {
    "type",
    "adcPorts"
})
public class ADCType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "ADCPorts", required = true)
    protected ADCType.ADCPorts adcPorts;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the adcPorts property.
     * 
     * @return
     *     possible object is
     *     {@link ADCType.ADCPorts }
     *     
     */
    public ADCType.ADCPorts getADCPorts() {
        return adcPorts;
    }

    /**
     * Sets the value of the adcPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADCType.ADCPorts }
     *     
     */
    public void setADCPorts(ADCType.ADCPorts value) {
        this.adcPorts = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;sequence>
     *           &lt;element name="port" type="{ports.settings.home_automation}Info" maxOccurs="unbounded"/>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "port"
    })
    public static class ADCPorts {

        @XmlElement(required = true)
        protected List<Info> port;

        /**
         * Gets the value of the port property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the port property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Info }
         * 
         * 
         */
        public List<Info> getPort() {
            if (port == null) {
                port = new ArrayList<Info>();
            }
            return this.port;
        }

    }

}