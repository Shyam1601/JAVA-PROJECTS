import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Account{
    private int  cno;
    private int pno;
    private double cbal=0;
    private double sbal=0;
    
    Scanner s=new Scanner(System.in);
    DecimalFormat mF=new DecimalFormat("'$'###,##0.00");
    
    public int setCustomerNumber(int cno){
        this.cno=cno;
        return cno;
    }
    public int getCustomerNumber(){
        return cno;
    }
    public int setPinNumber(int pno){
        this.pno=pno;
        return pno;
    }
    public int getPinNumber(){
        return pno;
    }
    public double getCheckingBalance(){
        return cbal;
    }
    public double getSavingBalance(){
        return sbal;
    }
    
    public double calCheckingWithdraw(double amount){
        cbal=(cbal-amount);
        return cbal;
    }
    
    public double calSavingWithdraw(double amount){
        sbal=(sbal-amount);
        return sbal;
    }
    
    public double calSavingDeposit(double amount){
        sbal=(sbal+amount);
        return sbal;
    }
    
    public double calCheckingDeposit(double amount){
        cbal=(cbal+amount);
        return cbal;
    }
    
    public void getCheckingWithdraw(){
        System.out.println("Your Balance:"+mF.format(cbal));
        System.out.println("Enter the amount to Withdraw:");
        double amount=s.nextDouble();
        
        if(cbal-amount>=0){
            calCheckingWithdraw(amount);
            System.out.println("Updated Balance:"+mF.format(cbal));
        }
        else{
            System.out.println("Insufficent Balance...:(");
        }
    }
    
    public void getSavingWithdraw(){
        System.out.println("Your Balance:"+mF.format(sbal));
        System.out.println("Enter the amount to Withdraw:");
        double amount=s.nextDouble();
        
        if(sbal-amount>=0){
            calSavingWithdraw(amount);
            System.out.println("Updated Balance:"+mF.format(sbal));
        }
        else{
            System.out.println("Insufficent Balance...:(");
        }
    }
    
    public void getCheckingDeposit(){
        System.out.println("Your Balance:"+mF.format(cbal));
        System.out.println("Enter the amount to Deposit:");
        double amount=s.nextDouble();
        if(cbal+amount>=0){
        calCheckingDeposit(amount);
        System.out.println("Updated Balance:"+mF.format(cbal));
        }
        else{
            System.out.println("Please enter valid amount..");
        }
    }
    
    public void getSavingDeposit(){
        System.out.println("Your Balance:"+mF.format(sbal));
        System.out.println("Enter the amount to Deposit:");
        double amount=s.nextDouble();
        if(sbal+amount>=0){
        calSavingDeposit(amount);
        System.out.println("Updated Balance:"+mF.format(sbal));
        }
        else{
            System.out.println("Please enter valid amount..");
        }
    }
}