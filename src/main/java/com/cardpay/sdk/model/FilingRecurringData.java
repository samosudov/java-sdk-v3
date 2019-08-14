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

public class FilingRecurringData {
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("dynamic_descriptor")
  private String dynamicDescriptor = null;
  @SerializedName("generate_token")
  private Boolean generateToken = null;
  @SerializedName("initiator")
  private String initiator = null;
  @SerializedName("note")
  private String note = null;
  
  public void setCurrency(String currency) {
      this.currency = currency;
  }

  /**
   * @param currency [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code
   * @return bean instance
   **/
  public FilingRecurringData currency(String currency) {
      this.currency = currency;
      return this;
  }

  
  public void setDynamicDescriptor(String dynamicDescriptor) {
      this.dynamicDescriptor = dynamicDescriptor;
  }

  /**
   * @param dynamicDescriptor Short description of the service or product, must be enabled by CardPay manager to be used
   * @return bean instance
   **/
  public FilingRecurringData dynamicDescriptor(String dynamicDescriptor) {
      this.dynamicDescriptor = dynamicDescriptor;
      return this;
  }

  
  public void setGenerateToken(Boolean generateToken) {
      this.generateToken = generateToken;
  }

  /**
   * @param generateToken This attribute can be received only in first recurring request. If set to &#39;true&#39;, Card token will be generated and returned in GET response for all successful transactions (can&#39;t be generated for declined transactions).
   * @return bean instance
   **/
  public FilingRecurringData generateToken(Boolean generateToken) {
      this.generateToken = generateToken;
      return this;
  }

  
  public void setInitiator(String initiator) {
      this.initiator = initiator;
  }

  /**
   * @param initiator Can be only &#x60;cit&#x60; (cardholder initiated transaction)
   * @return bean instance
   **/
  public FilingRecurringData initiator(String initiator) {
      this.initiator = initiator;
      return this;
  }

  
  public void setNote(String note) {
      this.note = note;
  }

  /**
   * @param note Note about the transaction that will not be displayed to Customer
   * @return bean instance
   **/
  public FilingRecurringData note(String note) {
      this.note = note;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilingRecurringData {\n");
    
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (dynamicDescriptor != null) sb.append("    dynamicDescriptor: ").append(toIndentedString(dynamicDescriptor)).append("\n");
    if (generateToken != null) sb.append("    generateToken: ").append(toIndentedString(generateToken)).append("\n");
    if (initiator != null) sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    if (note != null) sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

