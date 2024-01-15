import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class OptionMenu extends Account{
    Scanner s=new Scanner(System.in);
    DecimalFormat MF=new DecimalFormat("'$'###,##0.00");
    
    Map<Integer,Integer> data=new HashMap<>();
    
    public void getLogin() throws IOException{ 
        int x=1;
        do{
            try {
                data.put(123456,1601);
                data.put(987654,0606);
                
                System.out.println("Welcome to the ATM!");
                System.out.println("Please enter your Customer Number:");
                setCustomerNumber(s.nextInt());
                
                System.out.println("Enter the pin:");
                setPinNumber(s.nextInt());
                
            } catch(Exception e) {
                System.out.println("\n"+"Invalid Character(s)"+"\n");
                x=2;
                
            }
            
            int c=getCustomerNumber();
            int p=getPinNumber();
            if(data.containsKey(c) && data.get(c)==p){
                getAccountType();
            }
            else{
                System.out.println("\n"+"Invalid Customer Number and Pin Numbe");
            }
        }while(x==1);
    }
    
    public void getAccountType(){
    System.out.println("Select the Account Type:"+"\n"+"1-Checking Account"+"\n"+"2-Saving Account"+"\n"+"3-Exit");
    
    int selection=s.nextInt();
    
    switch(selection){
        case 1: getChecking();
        break;
        
        case 2: getSaving();
        break;
        
        case 3:
            System.out.println("Thank you!"+"\n"+"Please Visit Again");
            break;
        
        default:
        System.out.println("Please enter a valid key...");
        getAccountType();
    }
}

    public void getChecking(){
    System.out.println("You have selected Checking Account:"+"\n"+"1-View Balance"+"\n"+"2-Withdraw"+"\n"+"3-Deposit"+"\n"+"4-Exit");
    
    System.out.print("Enter key:");
    
    int selected=s.nextInt();
    
    switch(selected){
        case 1:
            System.out.println("Your Balance:"+MF.format(getCheckingBalance()));
            getAccountType();
            break;
        
        case 2: getCheckingWithdraw();
        getAccountType();
        break;
        
        case 3: getCheckingDeposit();
        getAccountType();
        break;
        
        case 4:
            System.out.println("Thank you!"+"\n"+"Please Visit Again");
            break;
        
        default:
        System.out.println("Please enter a valid key...");
        getChecking();
        
    }
}

    public void getSaving(){
     System.out.println("You have selected Saving Account:"+"\n"+"1-View Balance"+"\n"+"2-Withdraw"+"\n"+"3-Deposit"+"\n"+"4-Exit");
    
    System.out.print("Enter key:");
    
    int selected=s.nextInt();
    
    switch(selected){
        case 1:
            System.out.println("Your Balance:"+MF.format(getSavingBalance()));
            getAccountType();
            break;
        
        case 2: getSavingWithdraw();
        getAccountType();
        break;
        
        case 3: getSavingDeposit();
        getAccountType();
        break;
        
        case 4:
            System.out.println("Thank you!"+"\n"+"Please Visit Again");
            break;
        
        default:
        System.out.println("Please enter a valid key...");
        getSaving();
        
    }
}
}