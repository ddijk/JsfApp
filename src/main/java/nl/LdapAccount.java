package nl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LDAP_ACCOUNTS")
public class LdapAccount {

    @Id
    @SequenceGenerator(name = "SEQ_LDAP_ACCOUNTS", initialValue = Integer.MIN_VALUE)
    @GeneratedValue(generator = "SEQ_LDAP_ACCOUNTS")
    @Column(name = "ACCOUNT_ID")
    private Long accountId;
    @Column(name = "USER_NAME")
    private String userName;

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getAccountId() {
        return accountId;
    }

}
