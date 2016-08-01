package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by tlai2 on 8/1/16.
 */

// @RestController
// Spring 4 annotation, marks this class as a controller where everymethod returns a domain object instead of a view
// it is same as @Controller and @ResponseBody together
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // @RequestMapping
    // ensures that HTTP requets to /greeting are mapped to the greeting() method
    // We did not specify GET vs PUT and POST, use @RequestMapping(method=GET) to narrow this mapping
    @RequestMapping("/greeting")

    // @ReqestParam
    // binds the value of the query string paramter name into the name parameter field of the greeting method
    // The query string parameter is optional by default, if none is provided, the default value of "World" is used
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
