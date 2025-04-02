package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DynamicEndpoint;
import io.swagger.model.HeaderKeys;
import io.swagger.model.Headers;
import io.swagger.model.InterceptorContext;
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
 * RequestHandlerResponseBody
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-02T11:19:26.364255+05:30[Asia/Colombo]")


public class RequestHandlerResponseBody   {
  @JsonProperty("directRespond")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean directRespond = null;

  @JsonProperty("responseCode")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer responseCode = null;

  @JsonProperty("dynamicEndpoint")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private DynamicEndpoint dynamicEndpoint = null;

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

  @JsonProperty("pathToRewrite")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String pathToRewrite = null;

  @JsonProperty("body")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String body = null;

  @JsonProperty("interceptorContext")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InterceptorContext interceptorContext = null;


  public RequestHandlerResponseBody directRespond(Boolean directRespond) { 

    this.directRespond = directRespond;
    return this;
  }

  /**
   * Get directRespond
   * @return directRespond
   **/
  
  @Schema(example = "false", description = "")
  
  public Boolean isDirectRespond() {  
    return directRespond;
  }



  public void setDirectRespond(Boolean directRespond) { 
    this.directRespond = directRespond;
  }

  public RequestHandlerResponseBody responseCode(Integer responseCode) { 

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

  public RequestHandlerResponseBody dynamicEndpoint(DynamicEndpoint dynamicEndpoint) { 

    this.dynamicEndpoint = dynamicEndpoint;
    return this;
  }

  /**
   * Get dynamicEndpoint
   * @return dynamicEndpoint
   **/
  
  @Schema(description = "")
  
@Valid
  public DynamicEndpoint getDynamicEndpoint() {  
    return dynamicEndpoint;
  }



  public void setDynamicEndpoint(DynamicEndpoint dynamicEndpoint) { 
    this.dynamicEndpoint = dynamicEndpoint;
  }

  public RequestHandlerResponseBody headersToAdd(Headers headersToAdd) { 

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

  public RequestHandlerResponseBody headersToReplace(Headers headersToReplace) { 

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

  public RequestHandlerResponseBody headersToRemove(HeaderKeys headersToRemove) { 

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

  public RequestHandlerResponseBody trailersToAdd(Trailers trailersToAdd) { 

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

  public RequestHandlerResponseBody trailersToReplace(Trailers trailersToReplace) { 

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

  public RequestHandlerResponseBody trailersToRemove(HeaderKeys trailersToRemove) { 

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

  public RequestHandlerResponseBody pathToRewrite(String pathToRewrite) { 

    this.pathToRewrite = pathToRewrite;
    return this;
  }

  /**
   * New path that should overwrite the original path 
   * @return pathToRewrite
   **/
  
  @Schema(example = "/hello/1.0.0/test?foo=bar", description = "New path that should overwrite the original path ")
  
  public String getPathToRewrite() {  
    return pathToRewrite;
  }



  public void setPathToRewrite(String pathToRewrite) { 
    this.pathToRewrite = pathToRewrite;
  }

  public RequestHandlerResponseBody body(String body) { 

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

  public RequestHandlerResponseBody interceptorContext(InterceptorContext interceptorContext) { 

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
    RequestHandlerResponseBody requestHandlerResponseBody = (RequestHandlerResponseBody) o;
    return Objects.equals(this.directRespond, requestHandlerResponseBody.directRespond) &&
        Objects.equals(this.responseCode, requestHandlerResponseBody.responseCode) &&
        Objects.equals(this.dynamicEndpoint, requestHandlerResponseBody.dynamicEndpoint) &&
        Objects.equals(this.headersToAdd, requestHandlerResponseBody.headersToAdd) &&
        Objects.equals(this.headersToReplace, requestHandlerResponseBody.headersToReplace) &&
        Objects.equals(this.headersToRemove, requestHandlerResponseBody.headersToRemove) &&
        Objects.equals(this.trailersToAdd, requestHandlerResponseBody.trailersToAdd) &&
        Objects.equals(this.trailersToReplace, requestHandlerResponseBody.trailersToReplace) &&
        Objects.equals(this.trailersToRemove, requestHandlerResponseBody.trailersToRemove) &&
        Objects.equals(this.pathToRewrite, requestHandlerResponseBody.pathToRewrite) &&
        Objects.equals(this.body, requestHandlerResponseBody.body) &&
        Objects.equals(this.interceptorContext, requestHandlerResponseBody.interceptorContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directRespond, responseCode, dynamicEndpoint, headersToAdd, headersToReplace, headersToRemove, trailersToAdd, trailersToReplace, trailersToRemove, pathToRewrite, body, interceptorContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHandlerResponseBody {\n");
    
    sb.append("    directRespond: ").append(toIndentedString(directRespond)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    dynamicEndpoint: ").append(toIndentedString(dynamicEndpoint)).append("\n");
    sb.append("    headersToAdd: ").append(toIndentedString(headersToAdd)).append("\n");
    sb.append("    headersToReplace: ").append(toIndentedString(headersToReplace)).append("\n");
    sb.append("    headersToRemove: ").append(toIndentedString(headersToRemove)).append("\n");
    sb.append("    trailersToAdd: ").append(toIndentedString(trailersToAdd)).append("\n");
    sb.append("    trailersToReplace: ").append(toIndentedString(trailersToReplace)).append("\n");
    sb.append("    trailersToRemove: ").append(toIndentedString(trailersToRemove)).append("\n");
    sb.append("    pathToRewrite: ").append(toIndentedString(pathToRewrite)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
