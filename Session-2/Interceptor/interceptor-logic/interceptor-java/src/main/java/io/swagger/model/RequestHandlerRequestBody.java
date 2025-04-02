package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Headers;
import io.swagger.model.InvocationContext;
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
 * RequestHandlerRequestBody
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-02T11:19:26.364255+05:30[Asia/Colombo]")


public class RequestHandlerRequestBody   {
  @JsonProperty("requestHeaders")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Headers requestHeaders = null;

  @JsonProperty("requestTrailers")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Trailers requestTrailers = null;

  @JsonProperty("requestBody")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String requestBody = null;

  @JsonProperty("invocationContext")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InvocationContext invocationContext = null;


  public RequestHandlerRequestBody requestHeaders(Headers requestHeaders) { 

    this.requestHeaders = requestHeaders;
    return this;
  }

  /**
   * Get requestHeaders
   * @return requestHeaders
   **/
  
  @Schema(description = "")
  
@Valid
  public Headers getRequestHeaders() {  
    return requestHeaders;
  }



  public void setRequestHeaders(Headers requestHeaders) { 
    this.requestHeaders = requestHeaders;
  }

  public RequestHandlerRequestBody requestTrailers(Trailers requestTrailers) { 

    this.requestTrailers = requestTrailers;
    return this;
  }

  /**
   * Get requestTrailers
   * @return requestTrailers
   **/
  
  @Schema(description = "")
  
@Valid
  public Trailers getRequestTrailers() {  
    return requestTrailers;
  }



  public void setRequestTrailers(Trailers requestTrailers) { 
    this.requestTrailers = requestTrailers;
  }

  public RequestHandlerRequestBody requestBody(String requestBody) { 

    this.requestBody = requestBody;
    return this;
  }

  /**
   * Base64 encoded body 
   * @return requestBody
   **/
  
  @Schema(example = "PGhlbGxvPndvcmxkPC9oZWxsbz4K", description = "Base64 encoded body ")
  
  public String getRequestBody() {  
    return requestBody;
  }



  public void setRequestBody(String requestBody) { 
    this.requestBody = requestBody;
  }

  public RequestHandlerRequestBody invocationContext(InvocationContext invocationContext) { 

    this.invocationContext = invocationContext;
    return this;
  }

  /**
   * Get invocationContext
   * @return invocationContext
   **/
  
  @Schema(description = "")
  
@Valid
  public InvocationContext getInvocationContext() {  
    return invocationContext;
  }



  public void setInvocationContext(InvocationContext invocationContext) { 
    this.invocationContext = invocationContext;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHandlerRequestBody requestHandlerRequestBody = (RequestHandlerRequestBody) o;
    return Objects.equals(this.requestHeaders, requestHandlerRequestBody.requestHeaders) &&
        Objects.equals(this.requestTrailers, requestHandlerRequestBody.requestTrailers) &&
        Objects.equals(this.requestBody, requestHandlerRequestBody.requestBody) &&
        Objects.equals(this.invocationContext, requestHandlerRequestBody.invocationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeaders, requestTrailers, requestBody, invocationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHandlerRequestBody {\n");
    
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestTrailers: ").append(toIndentedString(requestTrailers)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    invocationContext: ").append(toIndentedString(invocationContext)).append("\n");
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
