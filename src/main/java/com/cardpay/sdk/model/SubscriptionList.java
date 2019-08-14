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
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data

public class SubscriptionList {
  @SerializedName("data")
  private List<SubscriptionGetResponse> data = null;
  @SerializedName("has_more")
  private Boolean hasMore = null;
  
  public void setData(List<SubscriptionGetResponse> data) {
      this.data = data;
  }

  /**
   * @param data List of found objects
   * @return bean instance
   **/
  public SubscriptionList data(List<SubscriptionGetResponse> data) {
      this.data = data;
      return this;
  }

  public SubscriptionList addDataItem(SubscriptionGetResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  
  public void setHasMore(Boolean hasMore) {
      this.hasMore = hasMore;
  }

  /**
   * @param hasMore Indicates if there are more elements for this period than were returned
   * @return bean instance
   **/
  public SubscriptionList hasMore(Boolean hasMore) {
      this.hasMore = hasMore;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionList {\n");
    
    if (data != null) sb.append("    data: ").append(toIndentedString(data)).append("\n");
    if (hasMore != null) sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

