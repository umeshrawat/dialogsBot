package com.marketbot.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "parameters",
        "lifespan"
})
public class Context {

    @JsonProperty("name")
    private String name;
    @JsonProperty("parameters")
    private Parameters_ parameters;
    @JsonProperty("lifespan")
    private Integer lifespan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("parameters")
    public Parameters_ getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("lifespan")
    public Integer getLifespan() {
        return lifespan;
    }

    @JsonProperty("lifespan")
    public void setLifespan(Integer lifespan) {
        this.lifespan = lifespan;
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
        return new ToStringBuilder(this).append("name", name).append("parameters", parameters).append("lifespan", lifespan).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(name).append(parameters).append(lifespan).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Context) == false) {
            return false;
        }
        Context rhs = ((Context) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(parameters, rhs.parameters).append(lifespan, rhs.lifespan).isEquals();
    }

}
