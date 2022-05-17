package Staples.League

import Staples.Game

//players actually competing in a game
class Lineup extends Roster{
    Game game
    Map<Integer,Player> activePlayers
}
