package cl.ravenhill.hamcracio.observer

/**
 * An observer for events related to cards.
 */
interface CardObserver {
  /**
   * Called when a card is played.
   *
   * @param card  The card that was played.
   */
  fun onCardPlayed(card: Card?)
}