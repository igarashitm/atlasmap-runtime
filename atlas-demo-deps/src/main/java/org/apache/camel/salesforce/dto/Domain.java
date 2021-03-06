/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Mar 02 02:58:34 EST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject Domain
 */
@XStreamAlias("Domain")
public class Domain extends AbstractSObjectBase {

    // DomainType
    @XStreamConverter(PicklistEnumConverter.class)
    private DomainTypeEnum DomainType;

    @JsonProperty("DomainType")
    public DomainTypeEnum getDomainType() {
        return this.DomainType;
    }

    @JsonProperty("DomainType")
    public void setDomainType(DomainTypeEnum DomainType) {
        this.DomainType = DomainType;
    }

    // Domain
    private String Domain;

    @JsonProperty("Domain")
    public String getDomain() {
        return this.Domain;
    }

    @JsonProperty("Domain")
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

}
