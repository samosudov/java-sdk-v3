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
import java.math.BigDecimal;
import lombok.Data;

@Data

public class PaymentResponseCryptocurrencyAccount {
  @SerializedName("crypto_address")
  private String cryptoAddress = null;
  @SerializedName("crypto_transaction_id")
  private String cryptoTransactionId = null;
  @SerializedName("prc_amount")
  private BigDecimal prcAmount = null;
  @SerializedName("prc_currency")
  private String prcCurrency = null;
  
  public void setCryptoAddress(String cryptoAddress) {
      this.cryptoAddress = cryptoAddress;
  }

  /**
   * @param cryptoAddress Bitcoin address for created transaction
   * @return bean instance
   **/
  public PaymentResponseCryptocurrencyAccount cryptoAddress(String cryptoAddress) {
      this.cryptoAddress = cryptoAddress;
      return this;
  }

  
  public void setCryptoTransactionId(String cryptoTransactionId) {
      this.cryptoTransactionId = cryptoTransactionId;
  }

  /**
   * @param cryptoTransactionId Id of created transaction in the bitcoin system
   * @return bean instance
   **/
  public PaymentResponseCryptocurrencyAccount cryptoTransactionId(String cryptoTransactionId) {
      this.cryptoTransactionId = cryptoTransactionId;
      return this;
  }

  
  public void setPrcAmount(BigDecimal prcAmount) {
      this.prcAmount = prcAmount;
  }

  /**
   * @param prcAmount Transaction amount (only for FIAT-BTC scenario)
   * @return bean instance
   **/
  public PaymentResponseCryptocurrencyAccount prcAmount(BigDecimal prcAmount) {
      this.prcAmount = prcAmount;
      return this;
  }

  
  public void setPrcCurrency(String prcCurrency) {
      this.prcCurrency = prcCurrency;
  }

  /**
   * @param prcCurrency Currency of transaction (only for FIAT-BTC scenario)
   * @return bean instance
   **/
  public PaymentResponseCryptocurrencyAccount prcCurrency(String prcCurrency) {
      this.prcCurrency = prcCurrency;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponseCryptocurrencyAccount {\n");
    
    if (cryptoAddress != null) sb.append("    cryptoAddress: ").append(toIndentedString(cryptoAddress)).append("\n");
    if (cryptoTransactionId != null) sb.append("    cryptoTransactionId: ").append(toIndentedString(cryptoTransactionId)).append("\n");
    if (prcAmount != null) sb.append("    prcAmount: ").append(toIndentedString(prcAmount)).append("\n");
    if (prcCurrency != null) sb.append("    prcCurrency: ").append(toIndentedString(prcCurrency)).append("\n");
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

