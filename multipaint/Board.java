package multipaint;

public class Board {
  public int turns_left;
  public int width;
  public int height;
  public String[][] colors;
  public java.util.Map<String, multipaint.Action>[] previous_actions;
  public java.util.Map<String, int[]> player_positions;
}
