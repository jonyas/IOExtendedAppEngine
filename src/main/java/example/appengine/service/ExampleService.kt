package example.appengine.service

import com.googlecode.objectify.ObjectifyService.ofy
import example.appengine.model.Greeting
import javax.inject.Inject

class ExampleService @Inject constructor() {

  fun sayHi(name: String): Greeting {
    val answer = Greeting(name)
    ofy().save().entity(answer).now()
    return answer
  }

  fun getAll(): List<Greeting> = ofy().load().type(Greeting::class.java).list().toList()

}
