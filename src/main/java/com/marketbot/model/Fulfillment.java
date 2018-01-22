package com.marketbot.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speech",
        "messages"
})
public class Fulfillment {

    @JsonProperty("speech")
    private String speech;
    @JsonProperty("messages")
    private List<Message> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speech")
    public String getSpeech() {
        return speech;
    }

    @JsonProperty("speech")
    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
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
        return new ToStringBuilder(this).append("speech", speech).append("messages", messages).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(speech).append(additionalProperties).append(messages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fulfillment) == false) {
            return false;
        }
        Fulfillment rhs = ((Fulfillment) other);
        return new EqualsBuilder().append(speech, rhs.speech).append(additionalProperties, rhs.additionalProperties).append(messages, rhs.messages).isEquals();
    }

}
