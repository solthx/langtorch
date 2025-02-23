package ai.knowly.langtorch.processor.llm.openai.service.schema.dto.completion.chat;

import ai.knowly.langtorch.schema.chat.ChatMessage;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/** A chat completion generated by OpenAI */
@Data
public class ChatCompletionChoice {

  /** This index of this completion in the returned list. */
  Integer index;

  /** The {@link ChatMessageRole#assistant} message or delta (when streaming) which was generated */
  @JsonAlias("delta")
  ChatMessage message;

  /** The reason why GPT stopped generating, for example "length". */
  @JsonProperty("finish_reason")
  String finishReason;
}
