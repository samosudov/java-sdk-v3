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

public class PaymentRequestMerchantOrder {
  @SerializedName("description")
  private String description = null;
  @SerializedName("flights")
  private Flights flights = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("items")
  private List<Item> items = null;
  @SerializedName("shipping_address")
  private ShippingAddress shippingAddress = null;
  
  public void setDescription(String description) {
      this.description = description;
  }

  /**
   * @param description Description of product/service being sold
   * @return bean instance
   **/
  public PaymentRequestMerchantOrder description(String description) {
      this.description = description;
      return this;
  }

  
  public void setFlights(Flights flights) {
      this.flights = flights;
  }

  /**
   * @param flights Flights data *(for BANKCARD payment method only)*
   * @return bean instance
   **/
  public PaymentRequestMerchantOrder flights(Flights flights) {
      this.flights = flights;
      return this;
  }

  
  public void setId(String id) {
      this.id = id;
  }

  /**
   * @param id Order ID used by Merchant&#39;s shopping cart
   * @return bean instance
   **/
  public PaymentRequestMerchantOrder id(String id) {
      this.id = id;
      return this;
  }

  
  public void setItems(List<Item> items) {
      this.items = items;
  }

  /**
   * @param items Array of items (in the shopping cart)
   * @return bean instance
   **/
  public PaymentRequestMerchantOrder items(List<Item> items) {
      this.items = items;
      return this;
  }

  public PaymentRequestMerchantOrder addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  
  public void setShippingAddress(ShippingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
  }

  /**
   * @param shippingAddress Shipping Address
   * @return bean instance
   **/
  public PaymentRequestMerchantOrder shippingAddress(ShippingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestMerchantOrder {\n");
    
    if (description != null) sb.append("    description: ").append(toIndentedString(description)).append("\n");
    if (flights != null) sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (items != null) sb.append("    items: ").append(toIndentedString(items)).append("\n");
    if (shippingAddress != null) sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

