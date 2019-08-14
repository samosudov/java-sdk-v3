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

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data

public class PayoutRequestMerchantOrder {
  @SerializedName("description")
  private String description = null;
  @SerializedName("id")
  private String id = null;
  
  public void setDescription(String description) {
      this.description = description;
  }

  /**
   * @param description Payout description
   * @return bean instance
   **/
  public PayoutRequestMerchantOrder description(String description) {
      this.description = description;
      return this;
  }

  
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @param id Order ID used by Merchant in Merchant&#39;s system
   * @return bean instance
   **/
  public PayoutRequestMerchantOrder id(String id) {
      this.id = id;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutRequestMerchantOrder {\n");
    
    if (description != null) sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

