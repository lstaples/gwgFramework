package Staples.Result

import Staples.Game
import Staples.League.Team
import Staples.League.Player
import Staples.Pool.Bettor

class GameResult extends Game{
    Team winningTeam
    Player gameWinningGoalScorer
    Boolean seriesWinner
    Bettor winner
}
