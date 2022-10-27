package cl.ravenhill.hamcracio.observer

// GameController.kt
class GameController(private val player: Player): CardObserver {
  init {
    player.addCardListener(this)
  }

  override fun onCardPlayed(card: Card?) {
  }
}