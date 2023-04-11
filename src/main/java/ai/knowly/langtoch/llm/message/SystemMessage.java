package ai.knowly.langtoch.llm.message;

import com.google.auto.value.AutoValue;

/** A message from the system. */
@AutoValue
public abstract class SystemMessage extends BaseChatMessage {
  public static Builder builder() {
    return new AutoValue_SystemMessage.Builder();
  }

  @Override
  public abstract String getMessage();

  @Override
  public Role getRole() {
    return Role.SYSTEM;
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setMessage(String message);

    public abstract SystemMessage build();
  }
}
