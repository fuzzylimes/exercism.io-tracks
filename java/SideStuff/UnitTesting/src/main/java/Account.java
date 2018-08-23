public class Account {

    private final int accountNumber;
    private String fname;
    private String lname;
    private double total;

    Account(int accountNumber, String fname, String lname) {
        this.accountNumber = accountNumber;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
