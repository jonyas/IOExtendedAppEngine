package example.appengine.model

class Greeting {

  /**
   * Empty constructor needed by objectify
   */
  @Suppress("UNUSED")
  constructor()

  constructor(name: String) {
    this.name = name
  }

  lateinit var name: String

}
