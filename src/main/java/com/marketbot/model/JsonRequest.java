package com.marketbot.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "originalRequest",
        "id",
        "timestamp",
        "lang",
        "result",
        "status",
        "sessionId"
})
public class JsonRequest {

    @JsonProperty("originalRequest")
    private OriginalRequest originalRequest;
    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("result")
    private Result result;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("originalRequest")
    public OriginalRequest getOriginalRequest() {
        return originalRequest;
    }

    @JsonProperty("originalRequest")
    public void setOriginalRequest(OriginalRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
        return new ToStringBuilder(this).append("originalRequest", originalRequest).append("id", id).append("timestamp", timestamp).append("lang", lang).append("result", result).append("status", status).append("sessionId", sessionId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timestamp).append(id).append(result).append(sessionId).append(status).append(additionalProperties).append(originalRequest).append(lang).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JsonRequest) == false) {
            return false;
        }
        JsonRequest rhs = ((JsonRequest) other);
        return new EqualsBuilder().append(timestamp, rhs.timestamp).append(id, rhs.id).append(result, rhs.result).append(sessionId, rhs.sessionId).append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).append(originalRequest, rhs.originalRequest).append(lang, rhs.lang).isEquals();
    }

}
