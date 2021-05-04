package com.leadville.lambda.client.model;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-04T19:43:38.242+02:00[Africa/Cairo]")

@Builder
public class Device   {
  @JsonProperty("pilotPostId")
  private Long pilotPostId;

  @JsonProperty("frequentFlyer")
  private Boolean frequentFlyer;

  @JsonProperty("about")
  private String about;

  @JsonProperty("flyingDetails")
  private String flyingDetails;

  public Device pilotPostId(Long pilotPostId) {
    this.pilotPostId = pilotPostId;
    return this;
  }

  /**
   * Get pilotPostId
   * @return pilotPostId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getPilotPostId() {
    return pilotPostId;
  }

  public void setPilotPostId(Long pilotPostId) {
    this.pilotPostId = pilotPostId;
  }

  public Device frequentFlyer(Boolean frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
    return this;
  }

  /**
   * Get frequentFlyer
   * @return frequentFlyer
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getFrequentFlyer() {
    return frequentFlyer;
  }

  public void setFrequentFlyer(Boolean frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
  }

  public Device about(String about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
  */
  @ApiModelProperty(example = "about me", value = "")


  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public Device flyingDetails(String flyingDetails) {
    this.flyingDetails = flyingDetails;
    return this;
  }

  /**
   * Get flyingDetails
   * @return flyingDetails
  */
  @ApiModelProperty(example = "I've been flying for 5 years", value = "")


  public String getFlyingDetails() {
    return flyingDetails;
  }

  public void setFlyingDetails(String flyingDetails) {
    this.flyingDetails = flyingDetails;
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
    return Objects.equals(this.pilotPostId, device.pilotPostId) &&
        Objects.equals(this.frequentFlyer, device.frequentFlyer) &&
        Objects.equals(this.about, device.about) &&
        Objects.equals(this.flyingDetails, device.flyingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pilotPostId, frequentFlyer, about, flyingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    pilotPostId: ").append(toIndentedString(pilotPostId)).append("\n");
    sb.append("    frequentFlyer: ").append(toIndentedString(frequentFlyer)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    flyingDetails: ").append(toIndentedString(flyingDetails)).append("\n");
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
