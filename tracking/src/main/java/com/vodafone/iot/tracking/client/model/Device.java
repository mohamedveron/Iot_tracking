package com.vodafone.iot.tracking.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import lombok.Builder;

/**
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-06T01:01:45.423+02:00[Africa/Cairo]")

@Builder
public class Device   {
  @JsonProperty("status")
  private String status;

  @JsonProperty("temperature")
  private Float temperature = null;

  public Device status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(example = "ready", value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Device temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  */
  @ApiModelProperty(example = "-25.0", required = true, value = "")
  @NotNull


  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.status, device.status) &&
        Objects.equals(this.temperature, device.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, temperature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
