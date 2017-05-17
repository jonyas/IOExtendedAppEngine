package example.appengine.di

import dagger.Component
import example.appengine.endpoint.ExampleEndpoint
import javax.inject.Singleton

@Singleton
@Component()
interface Injector {

  fun inject(exampleEndpoint: ExampleEndpoint)
}
