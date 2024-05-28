import java.util.HashMap;

public class Bank {
    private HashMap<Integer,BankClient> clients = new HashMap<>();
    public BankClient createBankClient(int money,int max,int id){
        BankClient newClient = new BankClient(money,max,id);
        clients.put(id,newClient);
        return newClient;
    }
    public void blockClient(BankClient client){
        if (!client.getIsBlocked()){
            client.setBlocked(true);
        }else {
            System.out.println("Bank client is already blocked, would you rather unblock it?");
        }
    }
    public void unblockClient(BankClient client){
        if (client.getIsBlocked()){
            client.setBlocked(false);
        }else {
            System.out.println("Bank client is already unblocked, would you rather block it?");
        }
    }
}
