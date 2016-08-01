package hello;

/**
 * Created by tlai2 on 8/1/16.
 */
// Greeting
// The object must be converted to JSON. Thanks to Spring's HTTP message converter support, you dont need to do this
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
