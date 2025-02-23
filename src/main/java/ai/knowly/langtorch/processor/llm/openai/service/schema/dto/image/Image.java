package ai.knowly.langtorch.processor.llm.openai.service.schema.dto.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * An object containing either a URL or a base 64 encoded image.
 *
 * <p>https://beta.openai.com/docs/api-reference/images
 */
@Data
public class Image {
  /** The URL where the image can be accessed. */
  String url;

  /** Base64 encoded image string. */
  @JsonProperty("b64_json")
  String b64Json;
}
