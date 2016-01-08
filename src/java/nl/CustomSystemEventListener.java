package nl;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class CustomSystemEventListener implements SystemEventListener {

    @Override
    public boolean isListenerForSource(Object value) {
        //only for Application
        System.out.println("** source is " + value);
        return true;
    }

    @Override
    public void processEvent(SystemEvent event)
            throws AbortProcessingException {
        System.out.println(" ** processEvent " + event.toString());
    }
}
