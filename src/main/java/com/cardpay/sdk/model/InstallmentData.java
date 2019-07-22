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
import java.time.OffsetDateTime;
import lombok.Data;

@Data

public class InstallmentData {
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("dynamic_descriptor")
  private String dynamicDescriptor = null;
  @SerializedName("generate_token")
  private Boolean generateToken = null;
  @SerializedName("initiator")
  private String initiator = null;
  @SerializedName("interval")
  private Integer interval = null;
  @SerializedName("note")
  private String note = null;
  @SerializedName("payments")
  private Integer payments = null;
  /**
   * Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60;
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    MINUTE("minute"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period")
  private PeriodEnum period = null;
  @SerializedName("retries")
  private Integer retries = null;
  @SerializedName("subscription_start")
  private OffsetDateTime subscriptionStart = null;
  
  public void setAmount(BigDecimal amount) {
      this.amount = amount;
  }

  /**
   * @param amount The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions
   * @return bean instance
   **/
  public InstallmentData amount(BigDecimal amount) {
      this.amount = amount;
      return this;
  }

  
  public void setCurrency(String currency) {
      this.currency = currency;
  }

  /**
   * @param currency [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code
   * @return bean instance
   **/
  public InstallmentData currency(String currency) {
      this.currency = currency;
      return this;
  }

  
  public void setDynamicDescriptor(String dynamicDescriptor) {
      this.dynamicDescriptor = dynamicDescriptor;
  }

  /**
   * @param dynamicDescriptor Short description of the service or product, must be enabled by CardPay manager to be used.
   * @return bean instance
   **/
  public InstallmentData dynamicDescriptor(String dynamicDescriptor) {
      this.dynamicDescriptor = dynamicDescriptor;
      return this;
  }

  
  public void setGenerateToken(Boolean generateToken) {
      this.generateToken = generateToken;
  }

  /**
   * @param generateToken This attribute can be received only in first recurring request. In all requests with recurring_id card.token can&#39;t be generated. If set to &#39;true&#39;, Card token will be generated and returned in GET response. Will be generated only for successful transactions (not for declined).
   * @return bean instance
   **/
  public InstallmentData generateToken(Boolean generateToken) {
      this.generateToken = generateToken;
      return this;
  }

  
  public void setInitiator(String initiator) {
      this.initiator = initiator;
  }

  /**
   * @param initiator Use &#x60;cit&#x60; for initiator attribute (cardholder initiated transaction).
   * @return bean instance
   **/
  public InstallmentData initiator(String initiator) {
      this.initiator = initiator;
      return this;
  }

  
  public void setInterval(Integer interval) {
      this.interval = interval;
  }

  /**
   * minimum: 1
   * @param interval Frequency interval of period, can be 1-365 depending on selected period value. Minimum value of period + interval can be 7 days / 1 week. Maximum value of period + interval plan can be 365 days / 52 weeks / 12 months / 1 year. 1-60 minutes - for **sandbox environment** and testing purpose only.
   * @return bean instance
   **/
  public InstallmentData interval(Integer interval) {
      this.interval = interval;
      return this;
  }

  
  public void setNote(String note) {
      this.note = note;
  }

  /**
   * @param note Note about the recurring that will not be displayed to customer.
   * @return bean instance
   **/
  public InstallmentData note(String note) {
      this.note = note;
      return this;
  }

  
  public void setPayments(Integer payments) {
      this.payments = payments;
  }

  /**
   * minimum: 2
   * maximum: 200
   * @param payments Number of total payments to be charged per defined interval, can be 2-200.
   * @return bean instance
   **/
  public InstallmentData payments(Integer payments) {
      this.payments = payments;
      return this;
  }

  
  public void setPeriod(PeriodEnum period) {
      this.period = period;
  }

  /**
   * @param period Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60;
   * @return bean instance
   **/
  public InstallmentData period(PeriodEnum period) {
      this.period = period;
      return this;
  }

  
  public void setRetries(Integer retries) {
      this.retries = retries;
  }

  /**
   * minimum: 1
   * maximum: 15
   * @param retries Number of daily basis retry attempts in case of payment has not been captured successfully, from 1 to 15 attempts can be specified.
   * @return bean instance
   **/
  public InstallmentData retries(Integer retries) {
      this.retries = retries;
      return this;
  }

  
  public void setSubscriptionStart(OffsetDateTime subscriptionStart) {
      this.subscriptionStart = subscriptionStart;
  }

  /**
   * @param subscriptionStart The date in yyyy-MM-dd format when subscription will actually become activated (grace period). Auth request will be created but Customer will be charged only when subscription start date comes. Leave it empty or specify the current date to activate subscription at once without any grace period applied.
   * @return bean instance
   **/
  public InstallmentData subscriptionStart(OffsetDateTime subscriptionStart) {
      this.subscriptionStart = subscriptionStart;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (dynamicDescriptor != null) sb.append("    dynamicDescriptor: ").append(toIndentedString(dynamicDescriptor)).append("\n");
    if (generateToken != null) sb.append("    generateToken: ").append(toIndentedString(generateToken)).append("\n");
    if (initiator != null) sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    if (interval != null) sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    if (note != null) sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (payments != null) sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    if (period != null) sb.append("    period: ").append(toIndentedString(period)).append("\n");
    if (retries != null) sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    if (subscriptionStart != null) sb.append("    subscriptionStart: ").append(toIndentedString(subscriptionStart)).append("\n");
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

