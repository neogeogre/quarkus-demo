package com.example

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  fun hello() = """{ "foo" : "Hello from RESTEasy Reactive" }"""

}
