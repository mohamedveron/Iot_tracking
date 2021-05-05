package com.vodafone.iot.tracking.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vodafone.iot.tracking.client.model.Device;
import com.vodafone.iot.tracking.client.model.DeviceDetailsAllOf;
import com.vodafone.iot.tracking.client.model.SIMCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import lombok.Builder;

/**
 * DeviceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-06T01:01:45.423+02:00[Africa/Cairo]")

@Builder
public class DeviceDetails   {
  @JsonProperty("status")
  private String status;

  @JsonProperty("temperature")
  private Float temperature = null;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("SIMCard")
  private SIMCard siMCard;

  public DeviceDetails status(String status) {
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

  public DeviceDetails temperature(Float temperature) {
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

  public DeviceDetails id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeviceDetails siMCard(SIMCard siMCard) {
    this.siMCard = siMCard;
    return this;
  }

  /**
   * Get siMCard
   * @return siMCard
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SIMCard getSiMCard() {
    return siMCard;
  }

  public void setSiMCard(SIMCard siMCard) {
    this.siMCard = siMCard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDetails deviceDetails = (DeviceDetails) o;
    return Objects.equals(this.status, deviceDetails.status) &&
        Objects.equals(this.temperature, deviceDetails.temperature) &&
        Objects.equals(this.id, deviceDetails.id) &&
        Objects.equals(this.siMCard, deviceDetails.siMCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, temperature, id, siMCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDetails {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siMCard: ").append(toIndentedString(siMCard)).append("\n");
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
