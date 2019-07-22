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

public class PayoutResponseCard {
  @SerializedName("issuing_country_code")
  private String issuingCountryCode = null;
  @SerializedName("masked_pan")
  private String maskedPan = null;
  
  public void setIssuingCountryCode(String issuingCountryCode) {
      this.issuingCountryCode = issuingCountryCode;
  }

  /**
   * @param issuingCountryCode Country code of issuing card country
   * @return bean instance
   **/
  public PayoutResponseCard issuingCountryCode(String issuingCountryCode) {
      this.issuingCountryCode = issuingCountryCode;
      return this;
  }

  
  public void setMaskedPan(String maskedPan) {
      this.maskedPan = maskedPan;
  }

  /**
   * @param maskedPan Masked PAN (shows first 6 digits and 4 last digits of the PAN)
   * @return bean instance
   **/
  public PayoutResponseCard maskedPan(String maskedPan) {
      this.maskedPan = maskedPan;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutResponseCard {\n");
    
    if (issuingCountryCode != null) sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
    if (maskedPan != null) sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
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

