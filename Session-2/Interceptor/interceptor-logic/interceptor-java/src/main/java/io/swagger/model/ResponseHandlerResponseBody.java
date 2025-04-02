package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.HeaderKeys;
import io.swagger.model.Headers;
import io.swagger.model.Trailers;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseHandlerResponseBody
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-02T11:19:26.364255+05:30[Asia/Colombo]")


public class ResponseHandlerResponseBody   {
  @JsonProperty("responseCode")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer responseCode = null;

  @JsonProperty("headersToAdd")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Headers headersToAdd = null;

  @JsonProperty("headersToReplace")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Headers headersToReplace = null;

  @JsonProperty("headersToRemove")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private HeaderKeys headersToRemove = null;

  @JsonProperty("trailersToAdd")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Trailers trailersToAdd = null;

  @JsonProperty("trailersToReplace")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Trailers trailersToReplace = null;

  @JsonProperty("trailersToRemove")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private HeaderKeys trailersToRemove = null;

  @JsonProperty("body")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String body = null;


  public ResponseHandlerResponseBody responseCode(Integer responseCode) { 

    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  
  @Schema(example = "200", description = "")
  
  public Integer getResponseCode() {  
    return responseCode;
  }



  public void setResponseCode(Integer responseCode) { 
    this.responseCode = responseCode;
  }

  public ResponseHandlerResponseBody headersToAdd(Headers headersToAdd) { 

    this.headersToAdd = headersToAdd;
    return this;
  }

  /**
   * Get headersToAdd
   * @return headersToAdd
   **/
  
  @Schema(description = "")
  
@Valid
  public Headers getHeadersToAdd() {  
    return headersToAdd;
  }



  public void setHeadersToAdd(Headers headersToAdd) { 
    this.headersToAdd = headersToAdd;
  }

  public ResponseHandlerResponseBody headersToReplace(Headers headersToReplace) { 

    this.headersToReplace = headersToReplace;
    return this;
  }

  /**
   * Get headersToReplace
   * @return headersToReplace
   **/
  
  @Schema(description = "")
  
@Valid
  public Headers getHeadersToReplace() {  
    return headersToReplace;
  }



  public void setHeadersToReplace(Headers headersToReplace) { 
    this.headersToReplace = headersToReplace;
  }

  public ResponseHandlerResponseBody headersToRemove(HeaderKeys headersToRemove) { 

    this.headersToRemove = headersToRemove;
    return this;
  }

  /**
   * Get headersToRemove
   * @return headersToRemove
   **/
  
  @Schema(description = "")
  
@Valid
  public HeaderKeys getHeadersToRemove() {  
    return headersToRemove;
  }



  public void setHeadersToRemove(HeaderKeys headersToRemove) { 
    this.headersToRemove = headersToRemove;
  }

  public ResponseHandlerResponseBody trailersToAdd(Trailers trailersToAdd) { 

    this.trailersToAdd = trailersToAdd;
    return this;
  }

  /**
   * Get trailersToAdd
   * @return trailersToAdd
   **/
  
  @Schema(description = "")
  
@Valid
  public Trailers getTrailersToAdd() {  
    return trailersToAdd;
  }



  public void setTrailersToAdd(Trailers trailersToAdd) { 
    this.trailersToAdd = trailersToAdd;
  }

  public ResponseHandlerResponseBody trailersToReplace(Trailers trailersToReplace) { 

    this.trailersToReplace = trailersToReplace;
    return this;
  }

  /**
   * Get trailersToReplace
   * @return trailersToReplace
   **/
  
  @Schema(description = "")
  
@Valid
  public Trailers getTrailersToReplace() {  
    return trailersToReplace;
  }



  public void setTrailersToReplace(Trailers trailersToReplace) { 
    this.trailersToReplace = trailersToReplace;
  }

  public ResponseHandlerResponseBody trailersToRemove(HeaderKeys trailersToRemove) { 

    this.trailersToRemove = trailersToRemove;
    return this;
  }

  /**
   * Get trailersToRemove
   * @return trailersToRemove
   **/
  
  @Schema(description = "")
  
@Valid
  public HeaderKeys getTrailersToRemove() {  
    return trailersToRemove;
  }



  public void setTrailersToRemove(HeaderKeys trailersToRemove) { 
    this.trailersToRemove = trailersToRemove;
  }

  public ResponseHandlerResponseBody body(String body) { 

    this.body = body;
    return this;
  }

  /**
   * Base64 encoded body 
   * @return body
   **/
  
  @Schema(example = "PGhlbGxvPndvcmxkPC9oZWxsbz4K", description = "Base64 encoded body ")
  
  public String getBody() {  
    return body;
  }



  public void setBody(String body) { 
    this.body = body;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHandlerResponseBody responseHandlerResponseBody = (ResponseHandlerResponseBody) o;
    return Objects.equals(this.responseCode, responseHandlerResponseBody.responseCode) &&
        Objects.equals(this.headersToAdd, responseHandlerResponseBody.headersToAdd) &&
        Objects.equals(this.headersToReplace, responseHandlerResponseBody.headersToReplace) &&
        Objects.equals(this.headersToRemove, responseHandlerResponseBody.headersToRemove) &&
        Objects.equals(this.trailersToAdd, responseHandlerResponseBody.trailersToAdd) &&
        Objects.equals(this.trailersToReplace, responseHandlerResponseBody.trailersToReplace) &&
        Objects.equals(this.trailersToRemove, responseHandlerResponseBody.trailersToRemove) &&
        Objects.equals(this.body, responseHandlerResponseBody.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, headersToAdd, headersToReplace, headersToRemove, trailersToAdd, trailersToReplace, trailersToRemove, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHandlerResponseBody {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    headersToAdd: ").append(toIndentedString(headersToAdd)).append("\n");
    sb.append("    headersToReplace: ").append(toIndentedString(headersToReplace)).append("\n");
    sb.append("    headersToRemove: ").append(toIndentedString(headersToRemove)).append("\n");
    sb.append("    trailersToAdd: ").append(toIndentedString(trailersToAdd)).append("\n");
    sb.append("    trailersToReplace: ").append(toIndentedString(trailersToReplace)).append("\n");
    sb.append("    trailersToRemove: ").append(toIndentedString(trailersToRemove)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
