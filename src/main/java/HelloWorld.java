import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    public static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String args[]){
        LOGGER.debug("Hello Welcome to {}!", "JCornerStone");
    }
}
