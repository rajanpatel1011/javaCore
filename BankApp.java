public class BankApp {
public static void main(String[] args) {
Savings pesoAcct = new Savings();
pesoAcct.setAcctNo("001");
pesoAcct.setAcctName("Juan dela Cruz");
pesoAcct.setBalance(500);
pesoAcct.printAccountInfo();
}
}