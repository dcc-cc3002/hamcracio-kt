package cl.ravenhill.hamcracio.observer

import kotlin.properties.Delegates

/**
 * A player in the game.
 *
 * @property playedCard The card played by the player.
 *                      This is an observable property.
 */
class Player {
    private val cardListeners = mutableListOf<CardObserver>()

    // The observable delegate receives an initial value and a lambda.
    // The lambda is called every time the property is changed; it receives 3 parameters:
    // 1. The property itself
    // 2. The old value
    // 3. The new value
    // Since the first two parameters are unused, they are replaced with the underscore character.
    var playedCard: Card? by Delegates.observable(null) { _, _, new ->
        // We notify all the listeners that the card has changed; parallelStream() is used to
        // notify the listeners in parallel.
        cardListeners.parallelStream().forEach { it.onCardPlayed(new) }
    }

    /**
     * Adds a listener to the player.
     */
    fun addCardListener(gameController: CardObserver) = cardListeners.add(gameController)
}
