public class Withdraw {
    private String name;
    private double Accbalance;
    private double withdrawal;

    public Withdraw(String name, double accbalance, double withdrawal) {
        this.name = name;
        this.Accbalance = accbalance;
        this.withdrawal = withdrawal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccbalance() {
        return Accbalance;
    }

    public void setAccbalance(double accbalance) {
        Accbalance = accbalance;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

       public void remAcc(double Withdrawal){
        Accbalance = Accbalance - Withdrawal;     }
    }
