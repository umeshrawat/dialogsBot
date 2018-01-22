package com.marketbot.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "given-name.original",
        "last-name.original",
        "twilio_sender_id",
        "given-name",
        "last-name"
})
public class Parameters_ {

    @JsonProperty("given-name.original")
    private String givenNameOriginal;
    @JsonProperty("last-name.original")
    private String lastNameOriginal;
    @JsonProperty("twilio_sender_id")
    private String twilioSenderId;
    @JsonProperty("given-name")
    private String givenName;
    @JsonProperty("last-name")
    private String lastName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("given-name.original")
    public String getGivenNameOriginal() {
        return givenNameOriginal;
    }

    @JsonProperty("given-name.original")
    public void setGivenNameOriginal(String givenNameOriginal) {
        this.givenNameOriginal = givenNameOriginal;
    }

    @JsonProperty("last-name.original")
    public String getLastNameOriginal() {
        return lastNameOriginal;
    }

    @JsonProperty("last-name.original")
    public void setLastNameOriginal(String lastNameOriginal) {
        this.lastNameOriginal = lastNameOriginal;
    }

    @JsonProperty("twilio_sender_id")
    public String getTwilioSenderId() {
        return twilioSenderId;
    }

    @JsonProperty("twilio_sender_id")
    public void setTwilioSenderId(String twilioSenderId) {
        this.twilioSenderId = twilioSenderId;
    }

    @JsonProperty("given-name")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("given-name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("last-name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last-name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("givenNameOriginal", givenNameOriginal).append("lastNameOriginal", lastNameOriginal).append("twilioSenderId", twilioSenderId).append("givenName", givenName).append("lastName", lastName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastName).append(twilioSenderId).append(lastNameOriginal).append(additionalProperties).append(givenNameOriginal).append(givenName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters_) == false) {
            return false;
        }
        Parameters_ rhs = ((Parameters_) other);
        return new EqualsBuilder().append(lastName, rhs.lastName).append(twilioSenderId, rhs.twilioSenderId).append(lastNameOriginal, rhs.lastNameOriginal).append(additionalProperties, rhs.additionalProperties).append(givenNameOriginal, rhs.givenNameOriginal).append(givenName, rhs.givenName).isEquals();
    }

}