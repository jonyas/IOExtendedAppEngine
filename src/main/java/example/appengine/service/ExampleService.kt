package example.appengine.service

import example.appengine.model.Greeting
import javax.inject.Inject

class ExampleService @Inject constructor() {

  fun sayHi(name: String) = Greeting("Hi! $name")

}
