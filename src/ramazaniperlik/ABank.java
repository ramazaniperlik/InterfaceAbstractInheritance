package ramazaniperlik;

public class ABank extends BaseBank implements IBank{

    public ABank(String bankName, String terminalId, String password){
       super(bankName,terminalId,password);
    }

    @Override
    public boolean connect(String ipAdress){
        System.out.println(this.hostIpAadress + "makinesine bağlanıldı.");
        System.out.println(ipAdress + " ip adresi ile "+ getBankName() + "'na Bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(String cardNumber, String date, String cvc){
        System.out.println("Bankadan cevap bekleniyor...");
        //TODO: The payment process will be continued.
        System.out.println("İşlem başarılı oldu.");
        return true;
    }

}
