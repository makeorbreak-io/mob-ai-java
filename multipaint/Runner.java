package multipaint;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Scanner;

import multipaint.Bot;
import multipaint.Board;
import multipaint.Ready;
import multipaint.Action;

public class Runner {
  public static void run(Bot bot) {
    Gson parser = new Gson();
    Scanner input = new Scanner(System.in);

    bot.setPlayerId(parser.fromJson(input.nextLine(), Ready.class).player_id);

    System.out.println("{\"ready\":true}");

    while (true) {
      Board msg = parser.fromJson(input.nextLine(), Board.class);

      Action action = bot.nextMove(msg);

      JsonElement actionJson = parser.toJsonTree(action);

      actionJson.getAsJsonObject().addProperty("turns_left", msg.turns_left);

      System.out.println(parser.toJson(actionJson));
    }
  }
}
