package jlunk;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetUtil {
  public static OkHttpClient httpClient = new OkHttpClient();

  public static Response get(String url) throws IOException {
    return httpClient.newCall(new Request.Builder().url(url).build()).execute();
  }
}
