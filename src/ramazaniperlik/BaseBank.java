package ramazaniperlik;

public abstract class BaseBank {
    private String bankName;
    private String terminalId;
    private String password;

    public BaseBank(String bankName, String terminalId, String password){
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }
    public String getBankName(){
        return this.bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getTerminalId(){
        return this.terminalId;
    }
    public void setTerminalId(String terminalId){
        this.terminalId = terminalId;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
