package com.leadville.lambda.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.leadville.lambda.client.model.Device;
import com.leadville.lambda.client.model.DeviceDetailsAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import lombok.Builder;

/**
 * DeviceDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-04T19:43:38.242+02:00[Africa/Cairo]")

@Builder
public class DeviceDetails   {
  @JsonProperty("pilotPostId")
  private Long pilotPostId;

  @JsonProperty("frequentFlyer")
  private Boolean frequentFlyer;

  @JsonProperty("about")
  private String about;

  @JsonProperty("flyingDetails")
  private String flyingDetails;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("imageUrl")
  private String imageUrl;

  @JsonProperty("gender")
  private String gender;

  public DeviceDetails pilotPostId(Long pilotPostId) {
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

  public DeviceDetails frequentFlyer(Boolean frequentFlyer) {
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

  public DeviceDetails about(String about) {
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

  public DeviceDetails flyingDetails(String flyingDetails) {
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

  public DeviceDetails imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public DeviceDetails gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
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
    return Objects.equals(this.pilotPostId, deviceDetails.pilotPostId) &&
        Objects.equals(this.frequentFlyer, deviceDetails.frequentFlyer) &&
        Objects.equals(this.about, deviceDetails.about) &&
        Objects.equals(this.flyingDetails, deviceDetails.flyingDetails) &&
        Objects.equals(this.id, deviceDetails.id) &&
        Objects.equals(this.imageUrl, deviceDetails.imageUrl) &&
        Objects.equals(this.gender, deviceDetails.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pilotPostId, frequentFlyer, about, flyingDetails, id, imageUrl, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDetails {\n");
    
    sb.append("    pilotPostId: ").append(toIndentedString(pilotPostId)).append("\n");
    sb.append("    frequentFlyer: ").append(toIndentedString(frequentFlyer)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    flyingDetails: ").append(toIndentedString(flyingDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
