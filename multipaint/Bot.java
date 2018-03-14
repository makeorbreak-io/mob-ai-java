package multipaint;

import multipaint.Board;
import multipaint.Action;

public interface Bot {
  public void setPlayerId(String playerId);
  public Action nextMove(Board state);
}
