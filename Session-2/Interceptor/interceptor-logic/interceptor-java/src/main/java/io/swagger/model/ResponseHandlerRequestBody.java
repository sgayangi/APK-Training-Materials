package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Headers;
import io.swagger.model.InterceptorContext;
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
 * ResponseHandlerRequestBody
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-02T11:19:26.364255+05:30[Asia/Colombo]")


public class ResponseHandlerRequestBody   {
  @JsonProperty("responseCode")

  private Integer responseCode = null;

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

  @JsonProperty("responseHeaders")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Headers responseHeaders = null;

  @JsonProperty("responseTrailers")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Trailers responseTrailers = null;

  @JsonProperty("responseBody")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String responseBody = null;

  @JsonProperty("invocationContext")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InvocationContext invocationContext = null;

  @JsonProperty("interceptorContext")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InterceptorContext interceptorContext = null;


  public ResponseHandlerRequestBody responseCode(Integer responseCode) { 

    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  
  @Schema(example = "200", required = true, description = "")
  
  @NotNull
  public Integer getResponseCode() {  
    return responseCode;
  }



  public void setResponseCode(Integer responseCode) { 

    this.responseCode = responseCode;
  }

  public ResponseHandlerRequestBody requestHeaders(Headers requestHeaders) { 

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

  public ResponseHandlerRequestBody requestTrailers(Trailers requestTrailers) { 

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

  public ResponseHandlerRequestBody requestBody(String requestBody) { 

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

  public ResponseHandlerRequestBody responseHeaders(Headers responseHeaders) { 

    this.responseHeaders = responseHeaders;
    return this;
  }

  /**
   * Get responseHeaders
   * @return responseHeaders
   **/
  
  @Schema(description = "")
  
@Valid
  public Headers getResponseHeaders() {  
    return responseHeaders;
  }



  public void setResponseHeaders(Headers responseHeaders) { 
    this.responseHeaders = responseHeaders;
  }

  public ResponseHandlerRequestBody responseTrailers(Trailers responseTrailers) { 

    this.responseTrailers = responseTrailers;
    return this;
  }

  /**
   * Get responseTrailers
   * @return responseTrailers
   **/
  
  @Schema(description = "")
  
@Valid
  public Trailers getResponseTrailers() {  
    return responseTrailers;
  }



  public void setResponseTrailers(Trailers responseTrailers) { 
    this.responseTrailers = responseTrailers;
  }

  public ResponseHandlerRequestBody responseBody(String responseBody) { 

    this.responseBody = responseBody;
    return this;
  }

  /**
   * Base64 encoded body 
   * @return responseBody
   **/
  
  @Schema(example = "PGhlbGxvPndvcmxkPC9oZWxsbz4K", description = "Base64 encoded body ")
  
  public String getResponseBody() {  
    return responseBody;
  }



  public void setResponseBody(String responseBody) { 
    this.responseBody = responseBody;
  }

  public ResponseHandlerRequestBody invocationContext(InvocationContext invocationContext) { 

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

  public ResponseHandlerRequestBody interceptorContext(InterceptorContext interceptorContext) { 

    this.interceptorContext = interceptorContext;
    return this;
  }

  /**
   * Get interceptorContext
   * @return interceptorContext
   **/
  
  @Schema(description = "")
  
@Valid
  public InterceptorContext getInterceptorContext() {  
    return interceptorContext;
  }



  public void setInterceptorContext(InterceptorContext interceptorContext) { 
    this.interceptorContext = interceptorContext;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHandlerRequestBody responseHandlerRequestBody = (ResponseHandlerRequestBody) o;
    return Objects.equals(this.responseCode, responseHandlerRequestBody.responseCode) &&
        Objects.equals(this.requestHeaders, responseHandlerRequestBody.requestHeaders) &&
        Objects.equals(this.requestTrailers, responseHandlerRequestBody.requestTrailers) &&
        Objects.equals(this.requestBody, responseHandlerRequestBody.requestBody) &&
        Objects.equals(this.responseHeaders, responseHandlerRequestBody.responseHeaders) &&
        Objects.equals(this.responseTrailers, responseHandlerRequestBody.responseTrailers) &&
        Objects.equals(this.responseBody, responseHandlerRequestBody.responseBody) &&
        Objects.equals(this.invocationContext, responseHandlerRequestBody.invocationContext) &&
        Objects.equals(this.interceptorContext, responseHandlerRequestBody.interceptorContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, requestHeaders, requestTrailers, requestBody, responseHeaders, responseTrailers, responseBody, invocationContext, interceptorContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHandlerRequestBody {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestTrailers: ").append(toIndentedString(requestTrailers)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseTrailers: ").append(toIndentedString(responseTrailers)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    invocationContext: ").append(toIndentedString(invocationContext)).append("\n");
    sb.append("    interceptorContext: ").append(toIndentedString(interceptorContext)).append("\n");
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
