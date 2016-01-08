package nl;

import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DickD
 */
@Named
@Stateless
public class MyController2 {

    String investmentStrategy = "InitialInvStrat";

    List<String> investmentStrategies = Arrays.asList("Blue", "Red", "Green");

    @PersistenceContext
    EntityManager em;

    public String getInvestmentStrategy() {
        return investmentStrategy;
    }

    public void setInvestmentStrategy(String investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }

    public void handleChangeInvestmentStrategy() {
        System.out.println("handleChangeInvestmentStrategy investmentStrategy=" + investmentStrategy);
    }

    public List<String> getInvestmentStrategies() {
        System.out.println("getInvestmentStrategies:" + investmentStrategies);
        return investmentStrategies;
    }

    public void setInvestmentStrategies(List<String> investmentStrategies) {
        this.investmentStrategies = investmentStrategies;
    }

    public void createLDAPUser() {
        LdapAccount la = new LdapAccount();
        la.setUserName("dick");
        ///  em.persist(la);
    }

}
