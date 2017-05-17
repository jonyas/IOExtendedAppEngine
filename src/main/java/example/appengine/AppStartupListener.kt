package example.appengine

import com.googlecode.objectify.ObjectifyService
import example.appengine.model.Greeting
import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener

class AppStartupListener : ServletContextListener {

  override fun contextInitialized(arg0: ServletContextEvent) {

  }

  override fun contextDestroyed(arg0: ServletContextEvent) {

  }

  companion object {
    init {
      // You need to register your datatype for Google Datastore in here
      ObjectifyService.register(Greeting::class.java)
    }
  }

}
