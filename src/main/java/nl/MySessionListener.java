package nl;

import javax.inject.Inject;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.apache.log4j.Logger;

@WebListener
public class MySessionListener implements HttpSessionListener {

    @Inject
    MyPojo myPojo;

    private static final Logger LOGGER = Logger.getLogger(MySessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOGGER.info("session created. myPojo null?" + (myPojo == null));
        LOGGER.info("Pojo: " + myPojo.getName());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        LOGGER.info("session ended");
    }

}
