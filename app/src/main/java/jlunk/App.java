/* (C)2022 */
package jlunk;

import com.google.common.base.Optional;
import java.io.IOException;
import java.util.List;
import models.DataOrigin;
import models.Parameters;
import models.sources.ESEventSource;
import models.sources.ESEventTeamsSource;
import okhttp3.OkHttpClient;

public class App {

  public static final OkHttpClient httpClient = new OkHttpClient();

  static final DataOrigin ES = new DataOrigin("ES", "https://es02.firstinspires.org/");

  public static void main(String[] args) throws IOException {
    var x = new ESEventSource(ES);
    var z = x.fetch(Parameters.builder().build());

    var a = new ESEventTeamsSource(ES);
    var p = Parameters.builder().eventIds(Optional.of(List.of(57244))).build();
    a.fetch(p)
        .value()
        .forEach(
            et -> {
              et.getTeams()
                  .get()
                  .forEach(
                      t -> {
                        System.out.println(t);
                      });
            });

    // Javalin app = Javalin.create().start(7070);
    // app.get(
    //         "/all",
    //         (ctx) -> {
    //             ctx.result("yo");
    //             ctx.result(
    //                     z.value().stream()
    //                             .sorted(Comparator.comparing((Event e) ->
    // e.getCode().or("")))
    //                             .map(
    //                                     e ->
    //                                             String.format(
    //                                                     "%s - %s",
    //                                                     e.getCode().or("[no code]"),
    //                                                     e.getName().or("[no name]")))
    //                             .collect(Collectors.joining("\n")));
    //         });
  }
}
