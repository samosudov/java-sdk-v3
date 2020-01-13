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
import java.math.BigDecimal;
import lombok.Data;

@Data

public class RecurringResponseRecurringData {
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("arn")
  private String arn = null;
  @SerializedName("auth_code")
  private String authCode = null;
  @SerializedName("created")
  private String created = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("decline_code")
  private String declineCode = null;
  @SerializedName("decline_reason")
  private String declineReason = null;
  @SerializedName("filing")
  private RecurringResponseFiling filing = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("is_3d")
  private Boolean is3d = null;
  @SerializedName("note")
  private String note = null;
  @SerializedName("rrn")
  private String rrn = null;
  /**
   * Current recurring payment status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DECLINED("DECLINED"),
    
    AUTHORIZED("AUTHORIZED"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    REFUNDED("REFUNDED"),
    
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    
    VOIDED("VOIDED"),
    
    CHARGED_BACK("CHARGED_BACK"),
    
    CHARGEBACK_RESOLVED("CHARGEBACK_RESOLVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("subscription")
  private Subscription subscription = null;
  /**
   * Gets or Sets transType
   */
  @JsonAdapter(TransTypeEnum.Adapter.class)
  public enum TransTypeEnum {
    _01("01"),
    
    _03("03"),
    
    _10("10"),
    
    _11("11"),
    
    _28("28");

    private String value;

    TransTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransTypeEnum fromValue(String text) {
      for (TransTypeEnum b : TransTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("trans_type")
  private TransTypeEnum transType = null;
  /**
   * Recurring payment type name; can be ONECLICK, SCHEDULED, INSTALLMENT
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONECLICK("ONECLICK"),
    
    SCHEDULED("SCHEDULED"),
    
    INSTALLMENT("INSTALLMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;
  
  public void setAmount(BigDecimal amount) {
      this.amount = amount;
  }

  /**
   * @param amount Recurring amount
   * @return bean instance
   **/
  public RecurringResponseRecurringData amount(BigDecimal amount) {
      this.amount = amount;
      return this;
  }

  
  public void setArn(String arn) {
      this.arn = arn;
  }

  /**
   * @param arn ARN (Acquirer Reference Number), supplied by the acquiring financial institution, return only after receiving ARN from bank acquirer *(for BANKCARD payment method only)*
   * @return bean instance
   **/
  public RecurringResponseRecurringData arn(String arn) {
      this.arn = arn;
      return this;
  }

  
  public void setAuthCode(String authCode) {
      this.authCode = authCode;
  }

  /**
   * @param authCode Authorization code, provided by bank
   * @return bean instance
   **/
  public RecurringResponseRecurringData authCode(String authCode) {
      this.authCode = authCode;
      return this;
  }

  
  public void setCreated(String created) {
      this.created = created;
  }

  /**
   * @param created Date and time when this recurring payment was created, [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
   * @return bean instance
   **/
  public RecurringResponseRecurringData created(String created) {
      this.created = created;
      return this;
  }

  
  public void setCurrency(String currency) {
      this.currency = currency;
  }

  /**
   * @param currency Recurring currency code ([ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code)
   * @return bean instance
   **/
  public RecurringResponseRecurringData currency(String currency) {
      this.currency = currency;
      return this;
  }

  
  public void setDeclineCode(String declineCode) {
      this.declineCode = declineCode;
  }

  /**
   * @param declineCode Decline code (only in decline case)
   * @return bean instance
   **/
  public RecurringResponseRecurringData declineCode(String declineCode) {
      this.declineCode = declineCode;
      return this;
  }

  
  public void setDeclineReason(String declineReason) {
      this.declineReason = declineReason;
  }

  /**
   * @param declineReason Bank&#39;s message about transaction decline reason (only in decline case)
   * @return bean instance
   **/
  public RecurringResponseRecurringData declineReason(String declineReason) {
      this.declineReason = declineReason;
      return this;
  }

  
  public void setFiling(RecurringResponseFiling filing) {
      this.filing = filing;
  }

  /**
   * @param filing CardPay&#39;s filing data
   * @return bean instance
   **/
  public RecurringResponseRecurringData filing(RecurringResponseFiling filing) {
      this.filing = filing;
      return this;
  }

  
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @param id CardPay&#39;s recurring id
   * @return bean instance
   **/
  public RecurringResponseRecurringData id(String id) {
      this.id = id;
      return this;
  }

  
  public void setIs3d(Boolean is3d) {
      this.is3d = is3d;
  }

  /**
   * @param is3d Was 3-D Secure authentication made or not
   * @return bean instance
   **/
  public RecurringResponseRecurringData is3d(Boolean is3d) {
      this.is3d = is3d;
      return this;
  }

  
  public void setNote(String note) {
      this.note = note;
  }

  /**
   * @param note Payment note
   * @return bean instance
   **/
  public RecurringResponseRecurringData note(String note) {
      this.note = note;
      return this;
  }

  
  public void setRrn(String rrn) {
      this.rrn = rrn;
  }

  /**
   * @param rrn RRN (Retrieval Reference Number), supplied by the acquiring financial institution
   * @return bean instance
   **/
  public RecurringResponseRecurringData rrn(String rrn) {
      this.rrn = rrn;
      return this;
  }

  
  public void setStatus(StatusEnum status) {
      this.status = status;
  }

  /**
   * @param status Current recurring payment status
   * @return bean instance
   **/
  public RecurringResponseRecurringData status(StatusEnum status) {
      this.status = status;
      return this;
  }

  
  public void setSubscription(Subscription subscription) {
      this.subscription = subscription;
  }

  /**
   * @param subscription Subscription data. Mandatory if scheduled payment is requested.
   * @return bean instance
   **/
  public RecurringResponseRecurringData subscription(Subscription subscription) {
      this.subscription = subscription;
      return this;
  }

  
  public void setTransType(TransTypeEnum transType) {
      this.transType = transType;
  }

  /**
   * @param transType transType
   * @return bean instance
   **/
  public RecurringResponseRecurringData transType(TransTypeEnum transType) {
      this.transType = transType;
      return this;
  }

  
  public void setType(TypeEnum type) {
      this.type = type;
  }

  /**
   * @param type Recurring payment type name; can be ONECLICK, SCHEDULED, INSTALLMENT
   * @return bean instance
   **/
  public RecurringResponseRecurringData type(TypeEnum type) {
      this.type = type;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringResponseRecurringData {\n");
    
    if (amount != null) sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    if (arn != null) sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    if (authCode != null) sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    if (created != null) sb.append("    created: ").append(toIndentedString(created)).append("\n");
    if (currency != null) sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    if (declineCode != null) sb.append("    declineCode: ").append(toIndentedString(declineCode)).append("\n");
    if (declineReason != null) sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
    if (filing != null) sb.append("    filing: ").append(toIndentedString(filing)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (is3d != null) sb.append("    is3d: ").append(toIndentedString(is3d)).append("\n");
    if (note != null) sb.append("    note: ").append(toIndentedString(note)).append("\n");
    if (rrn != null) sb.append("    rrn: ").append(toIndentedString(rrn)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (subscription != null) sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    if (transType != null) sb.append("    transType: ").append(toIndentedString(transType)).append("\n");
    if (type != null) sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

