package example.appengine.model

import com.googlecode.objectify.annotation.Entity
import com.googlecode.objectify.annotation.Id

@Entity
class Greeting {

  /**
   * Empty constructor needed by objectify
   */
  @Suppress("UNUSED")
  constructor()

  constructor(name: String) {
    this.name = name
  }

  @Id lateinit var name: String

}
