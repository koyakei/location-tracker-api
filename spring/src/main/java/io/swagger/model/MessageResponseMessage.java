package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MessageResponseMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-17T03:25:42.567Z[GMT]")


public class MessageResponseMessage   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("body")
  private String body = null;

  public MessageResponseMessage title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "this is title", value = "")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MessageResponseMessage body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "body", value = "")
  
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
    MessageResponseMessage messageResponseMessage = (MessageResponseMessage) o;
    return Objects.equals(this.title, messageResponseMessage.title) &&
        Objects.equals(this.body, messageResponseMessage.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseMessage {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
