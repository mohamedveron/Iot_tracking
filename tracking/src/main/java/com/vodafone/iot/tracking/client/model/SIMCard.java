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
 * SIMCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-05T23:50:48.228+02:00[Africa/Cairo]")

@Builder
public class SIMCard   {
  @JsonProperty("operatorCode")
  private String operatorCode;

  @JsonProperty("status")
  private String status;

  @JsonProperty("country")
  private String country;

  public SIMCard operatorCode(String operatorCode) {
    this.operatorCode = operatorCode;
    return this;
  }

  /**
   * Get operatorCode
   * @return operatorCode
  */
  @ApiModelProperty(example = "true", required = true, value = "")
  @NotNull


  public String getOperatorCode() {
    return operatorCode;
  }

  public void setOperatorCode(String operatorCode) {
    this.operatorCode = operatorCode;
  }

  public SIMCard status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(example = "active", required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SIMCard country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(example = "Egypt", value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCard siMCard = (SIMCard) o;
    return Objects.equals(this.operatorCode, siMCard.operatorCode) &&
        Objects.equals(this.status, siMCard.status) &&
        Objects.equals(this.country, siMCard.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorCode, status, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCard {\n");
    
    sb.append("    operatorCode: ").append(toIndentedString(operatorCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
