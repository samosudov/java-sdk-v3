/*
 * CardPay REST API
 * Welcome to the CardPay REST API. The CardPay API uses HTTP verbs and a [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) resources endpoint structure (see more info about REST). Request and response payloads are formatted as JSON. Merchant uses API to create payments, refunds, payouts or recurrings, check or update transaction status and get information about created transactions. In API authentication process based on [OAuth 2.0](https://oauth.net/2/) standard. For recent changes see changelog section.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cardpay.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import lombok.Data;

@Data

public class RenamedPlanData {
  @SerializedName("id")
  private String id = null;
  @SerializedName("details")
  private String details = null;
  @SerializedName("updated")
  private OffsetDateTime updated = null;
  @SerializedName("is_executed")
  private Boolean isExecuted = null;
  @SerializedName("name_to")
  private String nameTo = null;
  @SerializedName("name")
  private String name = null;
  /**
   * New state of plan (active or hold) -  for CHANGE_STATUS operation only
   */
  @JsonAdapter(StatusToEnum.Adapter.class)
  public enum StatusToEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusToEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusToEnum fromValue(String text) {
      for (StatusToEnum b : StatusToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusToEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusToEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusToEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusToEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status_to")
  private StatusToEnum statusTo = null;
  /**
   * Status of modified plan (&#39;ACTIVE&#39; or &#39;HOLD&#39;). Will be returned for &#x60;CHANGE_STATUS&#x60; operation
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;
  
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @param id Represents the ID of the modified plan
   * @return bean instance
   **/
  public RenamedPlanData id(String id) {
      this.id = id;
      return this;
  }

  
  public void setDetails(String details) {
      this.details = details;
  }

  /**
   * @param details The reason why request was unsuccessful
   * @return bean instance
   **/
  public RenamedPlanData details(String details) {
      this.details = details;
      return this;
  }

  
  public void setUpdated(OffsetDateTime updated) {
      this.updated = updated;
  }

  /**
   * @param updated Plan update date
   * @return bean instance
   **/
  public RenamedPlanData updated(OffsetDateTime updated) {
      this.updated = updated;
      return this;
  }

  
  public void setIsExecuted(Boolean isExecuted) {
      this.isExecuted = isExecuted;
  }

  /**
   * @param isExecuted Indicates was the request successful or not
   * @return bean instance
   **/
  public RenamedPlanData isExecuted(Boolean isExecuted) {
      this.isExecuted = isExecuted;
      return this;
  }

  
  public void setNameTo(String nameTo) {
      this.nameTo = nameTo;
  }

  /**
   * @param nameTo New plan name -  for RENAME operation only
   * @return bean instance
   **/
  public RenamedPlanData nameTo(String nameTo) {
      this.nameTo = nameTo;
      return this;
  }

  
  public void setName(String name) {
      this.name = name;
  }

  /**
   * @param name Name of modified plan. Will be returned for &#x60;RENAME&#x60; operation
   * @return bean instance
   **/
  public RenamedPlanData name(String name) {
      this.name = name;
      return this;
  }

  
  public void setStatusTo(StatusToEnum statusTo) {
      this.statusTo = statusTo;
  }

  /**
   * @param statusTo New state of plan (active or hold) -  for CHANGE_STATUS operation only
   * @return bean instance
   **/
  public RenamedPlanData statusTo(StatusToEnum statusTo) {
      this.statusTo = statusTo;
      return this;
  }

  
  public void setStatus(StatusEnum status) {
      this.status = status;
  }

  /**
   * @param status Status of modified plan (&#39;ACTIVE&#39; or &#39;HOLD&#39;). Will be returned for &#x60;CHANGE_STATUS&#x60; operation
   * @return bean instance
   **/
  public RenamedPlanData status(StatusEnum status) {
      this.status = status;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenamedPlanData {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (details != null) sb.append("    details: ").append(toIndentedString(details)).append("\n");
    if (updated != null) sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    if (isExecuted != null) sb.append("    isExecuted: ").append(toIndentedString(isExecuted)).append("\n");
    if (nameTo != null) sb.append("    nameTo: ").append(toIndentedString(nameTo)).append("\n");
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (statusTo != null) sb.append("    statusTo: ").append(toIndentedString(statusTo)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

