package nl;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.component.UIViewParameter;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewMetadata;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class MyBB implements Serializable {

    String naam;

    @PostConstruct
    public void init() {
        UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
        Collection<UIViewParameter> viewParams = ViewMetadata.getViewParameters(root);
        System.out.println("ViewParams:");
        for (UIViewParameter p : viewParams) {
            System.out.println("" + p.getName() + ", value: " + p.getSubmittedValue());
        }
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        System.out.println("setNaam called");
        this.naam = naam;
    }

}
