//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.24 at 07:58:49 PM CET 
//


package se.mattec.id2208.project.output;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchedOperationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchedOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputOperationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InputOperationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OpScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MacthedElement" type="{http://www.kth.se/ict/id2208/Matching}MatchedElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchedOperationType", propOrder = {
    "outputOperationName",
    "inputOperationName",
    "opScore",
    "macthedElement"
})
public class MatchedOperationType {

    @XmlElement(name = "OutputOperationName", required = true)
    protected String outputOperationName;
    @XmlElement(name = "InputOperationName", required = true)
    protected String inputOperationName;
    @XmlElement(name = "OpScore")
    protected double opScore;
    @XmlElement(name = "MacthedElement", required = true)
    protected List<MatchedElementType> macthedElement;

    /**
     * Gets the value of the outputOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOperationName() {
        return outputOperationName;
    }

    /**
     * Sets the value of the outputOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOperationName(String value) {
        this.outputOperationName = value;
    }

    /**
     * Gets the value of the inputOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputOperationName() {
        return inputOperationName;
    }

    /**
     * Sets the value of the inputOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputOperationName(String value) {
        this.inputOperationName = value;
    }

    /**
     * Gets the value of the opScore property.
     * 
     */
    public double getOpScore() {
        return opScore;
    }

    /**
     * Sets the value of the opScore property.
     * 
     */
    public void setOpScore(double value) {
        this.opScore = value;
    }

    /**
     * Gets the value of the macthedElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macthedElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacthedElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchedElementType }
     * 
     * 
     */
    public List<MatchedElementType> getMacthedElement() {
        if (macthedElement == null) {
            macthedElement = new ArrayList<MatchedElementType>();
        }
        return this.macthedElement;
    }

}