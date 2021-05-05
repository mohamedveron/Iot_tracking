package com.vodafone.iot.tracking.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vodafone.iot.tracking.client.model.SIMCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import lombok.Builder;

/**
 * DeviceDetailsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-06T01:01:45.423+02:00[Africa/Cairo]")

@Builder
public class DeviceDetailsAllOf   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("SIMCard")
  private SIMCard siMCard;

  public DeviceDetailsAllOf id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeviceDetailsAllOf siMCard(SIMCard siMCard) {
    this.siMCard = siMCard;
    return this;
  }

  /**
   * Get siMCard
   * @return siMCard
  */
  @ApiModelProperty(value = "")

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
    DeviceDetailsAllOf deviceDetailsAllOf = (DeviceDetailsAllOf) o;
    return Objects.equals(this.id, deviceDetailsAllOf.id) &&
        Objects.equals(this.siMCard, deviceDetailsAllOf.siMCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siMCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDetailsAllOf {\n");
    
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
