public abstract  class Bank {
    
    abstract void deposite();
}

class Account extends Bank{

    deposite(){
        System.out.println("this is method")
    }
    public static void main(String[] args) {
        Bank obj=new Account();
        obj.Bank;
    }

}
