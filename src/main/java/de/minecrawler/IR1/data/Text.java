//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.23 at 01:41:44 AM CET 
//

package de.minecrawler.IR1.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TEXT")
public class Text {

    @XmlAttribute(name = "TYPE")
    private String type;

    @XmlElement(name = "BODY", required = false)
    private String body;

    @XmlElement(name = "TITLE", required = false)
    private String title;

    @XmlElement(name = "AUTHOR", required = false)
    private String author;

    @XmlElement(name = "DATELINE", required = false)
    private String dateline;

    /**
     * @return The type of the text(for example a letter)
     */
    public String getType() {
        return type;
    }

    /**
     * @return The author of the text
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return The location and the date of the text
     */
    public String getDateline() {
        return dateline;
    }

    /**
     * @return The title of the text
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return The text itselfs
     */
    public String getBody() {
        return body;
    }

}