package com.marketbot.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MessagingServiceSid",
        "ApiVersion",
        "SmsSid",
        "SmsStatus",
        "SmsMessageSid",
        "NumSegments",
        "ToState",
        "From",
        "MessageSid",
        "AccountSid",
        "ToCity",
        "FromCountry",
        "ToZip",
        "FromCity",
        "To",
        "FromZip",
        "ToCountry",
        "Body",
        "NumMedia",
        "FromState"
})
public class Data {

    @JsonProperty("MessagingServiceSid")
    private String messagingServiceSid;
    @JsonProperty("ApiVersion")
    private String apiVersion;
    @JsonProperty("SmsSid")
    private String smsSid;
    @JsonProperty("SmsStatus")
    private String smsStatus;
    @JsonProperty("SmsMessageSid")
    private String smsMessageSid;
    @JsonProperty("NumSegments")
    private String numSegments;
    @JsonProperty("ToState")
    private String toState;
    @JsonProperty("From")
    private String from;
    @JsonProperty("MessageSid")
    private String messageSid;
    @JsonProperty("AccountSid")
    private String accountSid;
    @JsonProperty("ToCity")
    private String toCity;
    @JsonProperty("FromCountry")
    private String fromCountry;
    @JsonProperty("ToZip")
    private String toZip;
    @JsonProperty("FromCity")
    private String fromCity;
    @JsonProperty("To")
    private String to;
    @JsonProperty("FromZip")
    private String fromZip;
    @JsonProperty("ToCountry")
    private String toCountry;
    @JsonProperty("Body")
    private String body;
    @JsonProperty("NumMedia")
    private String numMedia;
    @JsonProperty("FromState")
    private String fromState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MessagingServiceSid")
    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    @JsonProperty("MessagingServiceSid")
    public void setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
    }

    @JsonProperty("ApiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("SmsSid")
    public String getSmsSid() {
        return smsSid;
    }

    @JsonProperty("SmsSid")
    public void setSmsSid(String smsSid) {
        this.smsSid = smsSid;
    }

    @JsonProperty("SmsStatus")
    public String getSmsStatus() {
        return smsStatus;
    }

    @JsonProperty("SmsStatus")
    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    @JsonProperty("SmsMessageSid")
    public String getSmsMessageSid() {
        return smsMessageSid;
    }

    @JsonProperty("SmsMessageSid")
    public void setSmsMessageSid(String smsMessageSid) {
        this.smsMessageSid = smsMessageSid;
    }

    @JsonProperty("NumSegments")
    public String getNumSegments() {
        return numSegments;
    }

    @JsonProperty("NumSegments")
    public void setNumSegments(String numSegments) {
        this.numSegments = numSegments;
    }

    @JsonProperty("ToState")
    public String getToState() {
        return toState;
    }

    @JsonProperty("ToState")
    public void setToState(String toState) {
        this.toState = toState;
    }

    @JsonProperty("From")
    public String getFrom() {
        return from;
    }

    @JsonProperty("From")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("MessageSid")
    public String getMessageSid() {
        return messageSid;
    }

    @JsonProperty("MessageSid")
    public void setMessageSid(String messageSid) {
        this.messageSid = messageSid;
    }

    @JsonProperty("AccountSid")
    public String getAccountSid() {
        return accountSid;
    }

    @JsonProperty("AccountSid")
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    @JsonProperty("ToCity")
    public String getToCity() {
        return toCity;
    }

    @JsonProperty("ToCity")
    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @JsonProperty("FromCountry")
    public String getFromCountry() {
        return fromCountry;
    }

    @JsonProperty("FromCountry")
    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    @JsonProperty("ToZip")
    public String getToZip() {
        return toZip;
    }

    @JsonProperty("ToZip")
    public void setToZip(String toZip) {
        this.toZip = toZip;
    }

    @JsonProperty("FromCity")
    public String getFromCity() {
        return fromCity;
    }

    @JsonProperty("FromCity")
    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    @JsonProperty("To")
    public String getTo() {
        return to;
    }

    @JsonProperty("To")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("FromZip")
    public String getFromZip() {
        return fromZip;
    }

    @JsonProperty("FromZip")
    public void setFromZip(String fromZip) {
        this.fromZip = fromZip;
    }

    @JsonProperty("ToCountry")
    public String getToCountry() {
        return toCountry;
    }

    @JsonProperty("ToCountry")
    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    @JsonProperty("Body")
    public String getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("NumMedia")
    public String getNumMedia() {
        return numMedia;
    }

    @JsonProperty("NumMedia")
    public void setNumMedia(String numMedia) {
        this.numMedia = numMedia;
    }

    @JsonProperty("FromState")
    public String getFromState() {
        return fromState;
    }

    @JsonProperty("FromState")
    public void setFromState(String fromState) {
        this.fromState = fromState;
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
        return new ToStringBuilder(this).append("messagingServiceSid", messagingServiceSid).append("apiVersion", apiVersion).append("smsSid", smsSid).append("smsStatus", smsStatus).append("smsMessageSid", smsMessageSid).append("numSegments", numSegments).append("toState", toState).append("from", from).append("messageSid", messageSid).append("accountSid", accountSid).append("toCity", toCity).append("fromCountry", fromCountry).append("toZip", toZip).append("fromCity", fromCity).append("to", to).append("fromZip", fromZip).append("toCountry", toCountry).append("body", body).append("numMedia", numMedia).append("fromState", fromState).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(to).append(apiVersion).append(fromState).append(body).append(toCountry).append(accountSid).append(smsSid).append(fromZip).append(messageSid).append(from).append(numMedia).append(smsStatus).append(numSegments).append(smsMessageSid).append(toZip).append(messagingServiceSid).append(additionalProperties).append(toState).append(toCity).append(fromCountry).append(fromCity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(to, rhs.to).append(apiVersion, rhs.apiVersion).append(fromState, rhs.fromState).append(body, rhs.body).append(toCountry, rhs.toCountry).append(accountSid, rhs.accountSid).append(smsSid, rhs.smsSid).append(fromZip, rhs.fromZip).append(messageSid, rhs.messageSid).append(from, rhs.from).append(numMedia, rhs.numMedia).append(smsStatus, rhs.smsStatus).append(numSegments, rhs.numSegments).append(smsMessageSid, rhs.smsMessageSid).append(toZip, rhs.toZip).append(messagingServiceSid, rhs.messagingServiceSid).append(additionalProperties, rhs.additionalProperties).append(toState, rhs.toState).append(toCity, rhs.toCity).append(fromCountry, rhs.fromCountry).append(fromCity, rhs.fromCity).isEquals();
    }

}
