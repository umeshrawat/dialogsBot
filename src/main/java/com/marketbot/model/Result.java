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
        "source",
        "resolvedQuery",
        "speech",
        "action",
        "actionIncomplete",
        "parameters",
        "contexts",
        "metadata",
        "fulfillment",
        "score"
})
public class Result {

    @JsonProperty("source")
    private String source;
    @JsonProperty("resolvedQuery")
    private String resolvedQuery;
    @JsonProperty("speech")
    private String speech;
    @JsonProperty("action")
    private String action;
    @JsonProperty("actionIncomplete")
    private Boolean actionIncomplete;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("contexts")
    private List<Context> contexts = null;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("score")
    private Double score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("resolvedQuery")
    public String getResolvedQuery() {
        return resolvedQuery;
    }

    @JsonProperty("resolvedQuery")
    public void setResolvedQuery(String resolvedQuery) {
        this.resolvedQuery = resolvedQuery;
    }

    @JsonProperty("speech")
    public String getSpeech() {
        return speech;
    }

    @JsonProperty("speech")
    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("actionIncomplete")
    public Boolean getActionIncomplete() {
        return actionIncomplete;
    }

    @JsonProperty("actionIncomplete")
    public void setActionIncomplete(Boolean actionIncomplete) {
        this.actionIncomplete = actionIncomplete;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("contexts")
    public List<Context> getContexts() {
        return contexts;
    }

    @JsonProperty("contexts")
    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
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
        return new ToStringBuilder(this).append("source", source).append("resolvedQuery", resolvedQuery).append("speech", speech).append("action", action).append("actionIncomplete", actionIncomplete).append("parameters", parameters).append("contexts", contexts).append("metadata", metadata).append("fulfillment", fulfillment).append("score", score).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actionIncomplete).append(speech).append(source).append(additionalProperties).append(fulfillment).append(score).append(action).append(resolvedQuery).append(contexts).append(parameters).append(metadata).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(actionIncomplete, rhs.actionIncomplete).append(speech, rhs.speech).append(source, rhs.source).append(additionalProperties, rhs.additionalProperties).append(fulfillment, rhs.fulfillment).append(score, rhs.score).append(action, rhs.action).append(resolvedQuery, rhs.resolvedQuery).append(contexts, rhs.contexts).append(parameters, rhs.parameters).append(metadata, rhs.metadata).isEquals();
    }

}
