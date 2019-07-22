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
import lombok.Data;

@Data

public class Flight {
  @SerializedName("carrier_code")
  private String carrierCode = null;
  @SerializedName("destination_code")
  private String destinationCode = null;
  @SerializedName("fare_basis_code")
  private String fareBasisCode = null;
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("number")
  private String number = null;
  @SerializedName("service_class_code")
  private Integer serviceClassCode = null;
  @SerializedName("stop_over_code")
  private String stopOverCode = null;
  
  public void setCarrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
  }

  /**
   * @param carrierCode Carrier code
   * @return bean instance
   **/
  public Flight carrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
      return this;
  }

  
  public void setDestinationCode(String destinationCode) {
      this.destinationCode = destinationCode;
  }

  /**
   * @param destinationCode Code of airport of destination, IATA code
   * @return bean instance
   **/
  public Flight destinationCode(String destinationCode) {
      this.destinationCode = destinationCode;
      return this;
  }

  
  public void setFareBasisCode(String fareBasisCode) {
      this.fareBasisCode = fareBasisCode;
  }

  /**
   * @param fareBasisCode Fare basis code
   * @return bean instance
   **/
  public Flight fareBasisCode(String fareBasisCode) {
      this.fareBasisCode = fareBasisCode;
      return this;
  }

  
  public void setIndex(Integer index) {
      this.index = index;
  }

  /**
   * @param index Sequence number (index) of the flight, each index number must be unique in one flights section
   * @return bean instance
   **/
  public Flight index(Integer index) {
      this.index = index;
      return this;
  }

  
  public void setNumber(String number) {
      this.number = number;
  }

  /**
   * @param number IATA or ICAO flight number
   * @return bean instance
   **/
  public Flight number(String number) {
      this.number = number;
      return this;
  }

  
  public void setServiceClassCode(Integer serviceClassCode) {
      this.serviceClassCode = serviceClassCode;
  }

  /**
   * @param serviceClassCode Code of service class
   * @return bean instance
   **/
  public Flight serviceClassCode(Integer serviceClassCode) {
      this.serviceClassCode = serviceClassCode;
      return this;
  }

  
  public void setStopOverCode(String stopOverCode) {
      this.stopOverCode = stopOverCode;
  }

  /**
   * @param stopOverCode Stop over code
   * @return bean instance
   **/
  public Flight stopOverCode(String stopOverCode) {
      this.stopOverCode = stopOverCode;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flight {\n");
    
    if (carrierCode != null) sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    if (destinationCode != null) sb.append("    destinationCode: ").append(toIndentedString(destinationCode)).append("\n");
    if (fareBasisCode != null) sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
    if (index != null) sb.append("    index: ").append(toIndentedString(index)).append("\n");
    if (number != null) sb.append("    number: ").append(toIndentedString(number)).append("\n");
    if (serviceClassCode != null) sb.append("    serviceClassCode: ").append(toIndentedString(serviceClassCode)).append("\n");
    if (stopOverCode != null) sb.append("    stopOverCode: ").append(toIndentedString(stopOverCode)).append("\n");
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

