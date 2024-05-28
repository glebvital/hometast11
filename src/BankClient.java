public class BankClient {
    private int id;
    private int money;
    private int max;
    private int pulledMoney;
    private boolean IsBlocked;

    public BankClient(int money,int max,int id) {
        this.id = id;
        if (max>=0){
            this.max = max;
        }else {
            this.max = 1000000;
        }
        IsBlocked = false;
        if (money<max){
            this.money = money;
        }else{
            System.out.println("balance is greater than maximum");
        }
        this.pulledMoney = 0;
    }

    public void addMoney(int num){
        if (money+num <= max&&!IsBlocked){
            money=money+num;
            System.out.println("current balance: "+money);
        }else {
            System.out.println("you can't add more money than maximum or client is blocked");
        }
    }
    public void pullMoney(int num){
        if (money-num>=0&&!IsBlocked){
            pulledMoney = num;
            money = money-num;
            System.out.println("current balance: "+money);
        }else {
            System.out.println("your balance is lesser than summary that you want to pull or client is blocked");
        }
    }
    public void sendMoney(int num,BankClient client){
        if (money-num>=0&&!IsBlocked&&this.id!=client.id){
            client.money = client.money+num;
            money = money-num;
            System.out.println("current balance: "+money);
        }else{
            System.out.println("your balance is lesser than summary that you want to send or id of your and getter bank client is same or client is blocked");
        }
    }
    public boolean getIsBlocked(){
        return IsBlocked;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public int getMax() {
        return max;
    }

    public int getPulledMoney() {
        return pulledMoney;
    }

    public void setBlocked(boolean blocked) {
        IsBlocked = blocked;
    }
}
