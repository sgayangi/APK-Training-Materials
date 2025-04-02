package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DynamicEndpoint
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-02T11:19:26.364255+05:30[Asia/Colombo]")


public class DynamicEndpoint   {
  @JsonProperty("endpointName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String endpointName = null;


  public DynamicEndpoint endpointName(String endpointName) { 

    this.endpointName = endpointName;
    return this;
  }

  /**
   * Get endpointName
   * @return endpointName
   **/
  
  @Schema(example = "my-dynamic-endpoint", description = "")
  
  public String getEndpointName() {  
    return endpointName;
  }



  public void setEndpointName(String endpointName) { 
    this.endpointName = endpointName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEndpoint dynamicEndpoint = (DynamicEndpoint) o;
    return Objects.equals(this.endpointName, dynamicEndpoint.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEndpoint {\n");
    
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
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
