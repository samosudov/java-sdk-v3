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

public class BillingAddress {
  @SerializedName("city")
  private String city = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("street")
  private String street = null;
  @SerializedName("zip")
  private String zip = null;
  
  public void setCity(String city) {
      this.city = city;
  }

  /**
   * @param city Billing city. May include whitespaces, hyphens, apostrophes, commas and dots
   * @return bean instance
   **/
  public BillingAddress city(String city) {
      this.city = city;
      return this;
  }

  
  public void setCountry(String country) {
      this.country = country;
  }

  /**
   * @param country [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) code of billing country: 2 or 3 latin letters or numeric code 
   * @return bean instance
   **/
  public BillingAddress country(String country) {
      this.country = country;
      return this;
  }

  
  public void setPhone(String phone) {
      this.phone = phone;
  }

  /**
   * @param phone Valid Customer phone number
   * @return bean instance
   **/
  public BillingAddress phone(String phone) {
      this.phone = phone;
      return this;
  }

  
  public void setState(String state) {
      this.state = state;
  }

  /**
   * @param state Billing state or province. May include whitespaces, hyphens, apostrophes, commas and dots
   * @return bean instance
   **/
  public BillingAddress state(String state) {
      this.state = state;
      return this;
  }

  
  public void setStreet(String street) {
      this.street = street;
  }

  /**
   * @param street Billing street address. May include whitespaces, hyphens, apostrophes, commas, quotes, dots, slashes and semicolons
   * @return bean instance
   **/
  public BillingAddress street(String street) {
      this.street = street;
      return this;
  }

  
  public void setZip(String zip) {
      this.zip = zip;
  }

  /**
   * @param zip Billing postal code
   * @return bean instance
   **/
  public BillingAddress zip(String zip) {
      this.zip = zip;
      return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAddress {\n");
    
    if (city != null) sb.append("    city: ").append(toIndentedString(city)).append("\n");
    if (country != null) sb.append("    country: ").append(toIndentedString(country)).append("\n");
    if (phone != null) sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    if (state != null) sb.append("    state: ").append(toIndentedString(state)).append("\n");
    if (street != null) sb.append("    street: ").append(toIndentedString(street)).append("\n");
    if (zip != null) sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

