package arminhammer.numerian;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

/**
 * @author Armin Graf
 */
public class Server extends AbstractVerticle {

  @Override
  public void start() {

    Router router = Router.router(vertx);

    router.route().handler(BodyHandler.create());
    router.get("/").handler(this::handleGetIndex);
    //router.put("/products/:productID").handler(this::handleAddProduct);
    //router.get("/products").handler(this::handleListProducts);

    // Create an HTTP server which simply returns "Hello World!" to each request.
    vertx.createHttpServer().requestHandler(router::accept).listen(8080);

  }

  private void handleGetIndex(RoutingContext routingContext) {
    routingContext.response().end("Hello World!");
  }

}
