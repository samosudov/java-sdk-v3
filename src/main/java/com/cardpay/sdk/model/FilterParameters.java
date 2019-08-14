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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import lombok.Data;

@Data

public class FilterParameters {
  @SerializedName("request_id")
  private String requestId = null;
  @SerializedName("merchant_order_id")
  private String merchantOrderId = null;
  @SerializedName("payment_method")
  private String paymentMethod = null;
  @SerializedName("start_time")
  private OffsetDateTime startTime = null;
  @SerializedName("end_time")
  private OffsetDateTime endTime = null;
  @SerializedName("max_count")
  private Integer maxCount = null;
  /**
   * Sort based on order of results. &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order (default value)
   */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String text) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortOrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sort_order")
  private SortOrderEnum sortOrder = null;
  @SerializedName("currency")
  private String currency = null;
  
  public void setRequestId(String requestId) {
      this.requestId = requestId;
  }

  /**
   * @param requestId Request ID
   * @return bean instance
   **/
  public FilterParameters requestId(String requestId) {
      this.requestId = requestId;
      return this;
  }

  
  public void setMerchantOrderId(String merchantOrderId) {
      this.merchantOrderId = merchantOrderId;
  }

  /**
   * @param merchantOrderId Merchant order number from the merchant system
   * @return bean instance
   **/
  public FilterParameters merchantOrderId(String merchantOrderId) {
      this.merchantOrderId = merchantOrderId;
      return this;
  }

  
  public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
  }

  /**
   * @param paymentMethod Used payment method type name from payment methods list
   * @return bean instance
   **/
  public FilterParameters paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
  }

  
  public void setStartTime(OffsetDateTime startTime) {
      this.startTime = startTime;
  }

  /**
   * @param startTime Date and time up to milliseconds (in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format) when requested period starts (inclusive), UTC time, default is 24 hours before &#39;end_time&#39; (format: yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;)
   * @return bean instance
   **/
  public FilterParameters startTime(OffsetDateTime startTime) {
      this.startTime = startTime;
      return this;
  }

  
  public void setEndTime(OffsetDateTime endTime) {
      this.endTime = endTime;
  }

  /**
   * @param endTime Date and time up to milliseconds (in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format) when requested period ends (not inclusive), UTC time, must be less than 7 days after &#39;start_time&#39;, default is current time (format: yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;)
   * @return bean instance
   **/
  public FilterParameters endTime(OffsetDateTime endTime) {
      this.endTime = endTime;
      return this;
  }

  
  public void setMaxCount(Integer maxCount) {
      this.maxCount = maxCount;
  }

  /**
   * maximum: 10000
   * @param maxCount Limit number of returned transactions (must be less than 10000, default is 1000)
   * @return bean instance
   **/
  public FilterParameters maxCount(Integer maxCount) {
      this.maxCount = maxCount;
      return this;
  }

  
  public void setSortOrder(SortOrderEnum sortOrder) {
      this.sortOrder = sortOrder;
  }

  /**
   * @param sortOrder Sort based on order of results. &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order (default value)
   * @return bean instance
   **/
  public FilterParameters sortOrder(SortOrderEnum sortOrder) {
      this.sortOrder = sortOrder;
      return this;
  }

  
  public void setCurrency(String currency) {
      this.currency = currency;
  }

  /**
   * @param currency [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of transactions currency
   * @return bean instance
   **/
  public FilterParameters currency(String currency) {
      this.currency = currency;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterParameters {\n");
    
    if (requestId != null) sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    if (merchantOrderId != null) sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    if (paymentMethod != null) sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    if (startTime != null) sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    if (endTime != null) sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    if (maxCount != null) sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    if (sortOrder != null) sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

