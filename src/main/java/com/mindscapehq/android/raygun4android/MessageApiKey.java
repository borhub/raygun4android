package main.java.com.mindscapehq.android.raygun4android;

import java.io.Serializable;

public class MessageApiKey implements Serializable {
  public String apiKey;
  public String message;

  public MessageApiKey() { }

  public MessageApiKey(String apiKey, String message)
  {
    this.apiKey = apiKey;
    this.message = message;
  }
}
