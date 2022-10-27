package cl.ravenhill.hamcracio.observer

import kotlin.properties.Delegates

// Player.kt
class Player {
  private val cardListeners = mutableListOf<CardObserver>()

  var playedCard by Delegates.observable(null) { _, _, new ->
    cardListeners.parallelStream().forEach { it.onCardPlayed(new) }
  }

  fun addCardListener(gameController: CardObserver) {
    cardListeners.add(gameController)
  }
}
