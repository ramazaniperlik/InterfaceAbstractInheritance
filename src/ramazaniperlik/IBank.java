package ramazaniperlik;

public interface IBank {
    final String hostIpAadress = "127.0.0.1";

    boolean connect(String ipAdress);
    boolean payment(String cardNumber, String date, String cvc);
}
