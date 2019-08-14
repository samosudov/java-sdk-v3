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

public class RecurringCreationRequest {
  @SerializedName("request")
  private Request request = null;
  @SerializedName("card_account")
  private PaymentRequestCardAccount cardAccount = null;
  @SerializedName("customer")
  private RecurringCustomer customer = null;
  @SerializedName("merchant_order")
  private PaymentRequestMerchantOrder merchantOrder = null;
  @SerializedName("payment_method")
  private String paymentMethod = null;
  @SerializedName("recurring_data")
  private RecurringRequestRecurringData recurringData = null;
  @SerializedName("return_urls")
  private ReturnUrls returnUrls = null;
  
  public void setRequest(Request request) {
      this.request = request;
  }

  /**
   * @param request Request
   * @return bean instance
   **/
  public RecurringCreationRequest request(Request request) {
      this.request = request;
      return this;
  }

  
  public void setCardAccount(PaymentRequestCardAccount cardAccount) {
      this.cardAccount = cardAccount;
  }

  /**
   * @param cardAccount Information about card
   * @return bean instance
   **/
  public RecurringCreationRequest cardAccount(PaymentRequestCardAccount cardAccount) {
      this.cardAccount = cardAccount;
      return this;
  }

  
  public void setCustomer(RecurringCustomer customer) {
      this.customer = customer;
  }

  /**
   * @param customer Information about Customer
   * @return bean instance
   **/
  public RecurringCreationRequest customer(RecurringCustomer customer) {
      this.customer = customer;
      return this;
  }

  
  public void setMerchantOrder(PaymentRequestMerchantOrder merchantOrder) {
      this.merchantOrder = merchantOrder;
  }

  /**
   * @param merchantOrder Merchant order data
   * @return bean instance
   **/
  public RecurringCreationRequest merchantOrder(PaymentRequestMerchantOrder merchantOrder) {
      this.merchantOrder = merchantOrder;
      return this;
  }

  
  public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
  }

  /**
   * @param paymentMethod Used payment method type name from payment methods list
   * @return bean instance
   **/
  public RecurringCreationRequest paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
  }

  
  public void setRecurringData(RecurringRequestRecurringData recurringData) {
      this.recurringData = recurringData;
  }

  /**
   * @param recurringData Recurring data
   * @return bean instance
   **/
  public RecurringCreationRequest recurringData(RecurringRequestRecurringData recurringData) {
      this.recurringData = recurringData;
      return this;
  }

  
  public void setReturnUrls(ReturnUrls returnUrls) {
      this.returnUrls = returnUrls;
  }

  /**
   * @param returnUrls Merchant Return URLs
   * @return bean instance
   **/
  public RecurringCreationRequest returnUrls(ReturnUrls returnUrls) {
      this.returnUrls = returnUrls;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringCreationRequest {\n");
    
    if (request != null) sb.append("    request: ").append(toIndentedString(request)).append("\n");
    if (cardAccount != null) sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (paymentMethod != null) sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (recurringData != null) sb.append("    recurringData: ").append(toIndentedString(recurringData)).append("\n");
    if (returnUrls != null) sb.append("    returnUrls: ").append(toIndentedString(returnUrls)).append("\n");
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

