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

public class RecurringCreationResponse {
  @SerializedName("redirect_url")
  private String redirectUrl = null;
  @SerializedName("payment_method")
  private String paymentMethod = null;
  @SerializedName("merchant_order")
  private TransactionResponseMerchantOrder merchantOrder = null;
  @SerializedName("recurring_data")
  private RecurringResponseRecurringData recurringData = null;
  @SerializedName("customer")
  private PaymentRequestCustomer customer = null;
  @SerializedName("card_account")
  private PaymentResponseCardAccount cardAccount = null;
  
  public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
  }

  /**
   * @param redirectUrl URL Customer should be redirected to
   * @return bean instance
   **/
  public RecurringCreationResponse redirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
  }

  
  public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
  }

  /**
   * @param paymentMethod Payment method
   * @return bean instance
   **/
  public RecurringCreationResponse paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
  }

  
  public void setMerchantOrder(TransactionResponseMerchantOrder merchantOrder) {
      this.merchantOrder = merchantOrder;
  }

  /**
   * @param merchantOrder Merchant order data
   * @return bean instance
   **/
  public RecurringCreationResponse merchantOrder(TransactionResponseMerchantOrder merchantOrder) {
      this.merchantOrder = merchantOrder;
      return this;
  }

  
  public void setRecurringData(RecurringResponseRecurringData recurringData) {
      this.recurringData = recurringData;
  }

  /**
   * @param recurringData Recurring data
   * @return bean instance
   **/
  public RecurringCreationResponse recurringData(RecurringResponseRecurringData recurringData) {
      this.recurringData = recurringData;
      return this;
  }

  
  public void setCustomer(PaymentRequestCustomer customer) {
      this.customer = customer;
  }

  /**
   * @param customer Customer data
   * @return bean instance
   **/
  public RecurringCreationResponse customer(PaymentRequestCustomer customer) {
      this.customer = customer;
      return this;
  }

  
  public void setCardAccount(PaymentResponseCardAccount cardAccount) {
      this.cardAccount = cardAccount;
  }

  /**
   * @param cardAccount Card account data *(for BANKCARD payment method only)*
   * @return bean instance
   **/
  public RecurringCreationResponse cardAccount(PaymentResponseCardAccount cardAccount) {
      this.cardAccount = cardAccount;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringCreationResponse {\n");
    
    if (redirectUrl != null) sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    if (paymentMethod != null) sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (merchantOrder != null) sb.append("    merchantOrder: ").append(toIndentedString(merchantOrder)).append("\n");
    if (recurringData != null) sb.append("    recurringData: ").append(toIndentedString(recurringData)).append("\n");
    if (customer != null) sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    if (cardAccount != null) sb.append("    cardAccount: ").append(toIndentedString(cardAccount)).append("\n");
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

