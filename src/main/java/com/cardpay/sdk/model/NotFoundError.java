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

public class NotFoundError {
  @SerializedName("message")
  private String message = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("request_id")
  private String requestId = null;
  
  public void setMessage(String message) {
      this.message = message;
  }

  /**
   * @param message A human-readable explanation specific to this occurrence of the problem.
   * @return bean instance
   **/
  public NotFoundError message(String message) {
      this.message = message;
      return this;
  }

  
  public void setName(String name) {
      this.name = name;
  }

  /**
   * @param name A short, human-readable summary of the problem that *should not* change from occurrence to occurrence of the problem, except for purposes of localization.
   * @return bean instance
   **/
  public NotFoundError name(String name) {
      this.name = name;
      return this;
  }

  
  public void setRequestId(String requestId) {
      this.requestId = requestId;
  }

  /**
   * @param requestId Request ID
   * @return bean instance
   **/
  public NotFoundError requestId(String requestId) {
      this.requestId = requestId;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundError {\n");
    
    if (message != null) sb.append("    message: ").append(toIndentedString(message)).append("\n");
    if (name != null) sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (requestId != null) sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

