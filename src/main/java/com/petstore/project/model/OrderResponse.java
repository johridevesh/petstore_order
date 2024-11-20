package com.petstore.project.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrderResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T08:50:38.096367Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderResponse {

  private Integer id;

  private Integer customerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime orderDate;

  private String status;

  private Double totalAmount;

  public OrderResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderResponse customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  
  @Schema(name = "customer_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer_id")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public OrderResponse orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
   */
  @Valid 
  @Schema(name = "order_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_date")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public OrderResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrderResponse totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
   */
  
  @Schema(name = "total_amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_amount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.id, orderResponse.id) &&
        Objects.equals(this.customerId, orderResponse.customerId) &&
        Objects.equals(this.orderDate, orderResponse.orderDate) &&
        Objects.equals(this.status, orderResponse.status) &&
        Objects.equals(this.totalAmount, orderResponse.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, orderDate, status, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
