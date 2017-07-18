package controllers;

import static play.test.Helpers.GET;
import static play.test.Helpers.route;

import org.junit.Test;

import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

public class HttpsTest extends WithApplication {
	@Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testHttps() {
    	Http.RequestBuilder request = new Http.RequestBuilder()
	        .method(GET)
	        .header(Http.HeaderNames.HOST, "localhost")
	        .uri("/");

        Result result = route(app, request);
        System.out.println("https:"+result.status());
    }
}
