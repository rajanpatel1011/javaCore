public abstract class AccountInfo {
private String acctNo;
private String acctName;
private double balance;
public String getAcctNo() {return acctNo;}
public void setAcctNo(String no) {acctNo = no;}
public String getAcctName() {return acctName;}
public void setAcctName(String name){acctName = name;}
public double getBalance() {return balance;}
public void setBalance(double bal) {balance = bal;}
public abstract void printAccountInfo(); // Missing code
}