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

public class TransactionUpdateRequest {
  @SerializedName("request")
  private Request request = null;
  @SerializedName("transaction_data")
  private RequestUpdatedTransactionData transactionData = null;
  
  public void setRequest(Request request) {
      this.request = request;
  }

  /**
   * @param request Request
   * @return bean instance
   **/
  public TransactionUpdateRequest request(Request request) {
      this.request = request;
      return this;
  }

  
  public void setTransactionData(RequestUpdatedTransactionData transactionData) {
      this.transactionData = transactionData;
  }

  /**
   * @param transactionData Transaction data
   * @return bean instance
   **/
  public TransactionUpdateRequest transactionData(RequestUpdatedTransactionData transactionData) {
      this.transactionData = transactionData;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionUpdateRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (transactionData != null) sb.append("    transactionData: ").append(toIndentedString(transactionData)).append("\n");
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

