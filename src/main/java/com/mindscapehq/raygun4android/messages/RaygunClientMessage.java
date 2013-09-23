package main.java.com.mindscapehq.raygun4android.messages;

public class RaygunClientMessage {

  private String version;
  private String clientUrlString;
  private String name;

  public RaygunClientMessage()
  {
    setName("Raygun4Android");
    setVersion("1.0.0.0");
    setClientUrlString("https://github.com/MindscapeHQ/raygun4android");
  }

  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  public String getClientUrlString() {
    return clientUrlString;
  }
  public void setClientUrlString(String clientUrlString) {
    this.clientUrlString = clientUrlString;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}
