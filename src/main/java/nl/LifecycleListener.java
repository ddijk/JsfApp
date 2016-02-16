/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.Collection;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewParameter;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.view.ViewMetadata;
import org.apache.log4j.Logger;

public class LifecycleListener implements PhaseListener {

    private static final Logger LOGGER = Logger.getLogger(LifecycleListener.class);

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    public void beforePhase(PhaseEvent event) {
        LOGGER.info("START PHASE " + event.getPhaseId());
        if (event.getPhaseId() == PhaseId.RESTORE_VIEW) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "mijn bericht from LifecycleListener", "mijn detail from LifecycleListener");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        } else {
            logViewParams();
        }

    }

    public void afterPhase(PhaseEvent event) {
        LOGGER.info("END PHASE " + event.getPhaseId());
        //  logViewParams();

    }

    private void logViewParams() {

        UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
        if (root == null) {
            LOGGER.info("root NULL");
            return;
        }
        Collection<UIViewParameter> viewParams = ViewMetadata.getViewParameters(root);
        if (viewParams == null || viewParams.isEmpty()) {
            LOGGER.info("GEEN VIEW PARAMS");
            return;
        }
        LOGGER.info("ViewParams:");
        for (UIViewParameter p : viewParams) {
            LOGGER.info("" + p.getName() + ", value: " + p.getValue() + "(submitted:" + p.getSubmittedValue() + ")");
        }
    }

}
