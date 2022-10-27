package cl.ravenhill.hamcracio.observer


fun main() {
    // We create an empty object that implements the interface.
    val card = object : Card {}
    val player = Player()
    val controller = GameController(player)
    controller.playCard(card)
}