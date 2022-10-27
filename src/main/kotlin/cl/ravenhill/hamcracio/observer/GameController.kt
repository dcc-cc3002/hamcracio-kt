package cl.ravenhill.hamcracio.observer

/**
 * The controller for the game.
 *
 * A controller is an object that controls the flow of the game. It is responsible for
 * starting the game, ending the game, and handling events that occur during the game.
 *
 * @param player  The "player one" of the game.
 *
 * @constructor Creates a new game controller.
 */
class GameController(private val player: Player) : CardObserver {
    init {
        player.addCardListener(this)
    }

    override fun onCardPlayed(card: Card?) = println("The player played a card!")

    /**
     * Plays a card for the player.
     */
    fun playCard(card: Card) {
        player.playedCard = card    // This will trigger the onCardPlayed() method.
    }
}