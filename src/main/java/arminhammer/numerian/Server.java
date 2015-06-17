package arminhammer.numerian;

import io.vertx.core.AbstractVerticle;

/**
 * @author Armin Graf
 */
public class Server extends AbstractVerticle {

  @Override
  public void start() {
    // Create an HTTP server which simply returns "Hello World!" to each request.
    vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World1!")).listen(8080);
  }
}
