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

public class TransactionResponseEWalletAccount {
  @SerializedName("id")
  private String id = null;
  
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @param id For ALIPAY - 16 digits number For QIWI - Customer phone number (from 1 to 15 digits) For WEBMONEY - Customer account number For NETELLER - Email address of the customer For YANDEXMONEY - Customer wallet number, 11 to 16 digits, begins with 410 For DIRECTBANKINGNGA - Bank account number For AQRCODE - Customer account number For AIRTEL, MPESA, MTN, UGANDAMOBILE, VODAFONE, TIGO - Customer account number For &#39;Latin America&#39; - Customer’s personal identification number
   * @return bean instance
   **/
  public TransactionResponseEWalletAccount id(String id) {
      this.id = id;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponseEWalletAccount {\n");
    
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

