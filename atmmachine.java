import java.util.*;
class atm{
float balance;
int pin=123;
public void chpin(){
System.out.println("=====ENTER PIN=====");
Scanner sc=new Scanner(System.in);
int enteredpin=sc.nextInt();
if(enteredpin==pin){
menu();
}
else{
System.out.println("=====ENTER VALID PIN=====");
}
}
public void menu(){
System.out.println("=====ENTER YOUR CHOICE=====");
System.out.println("1. Check A/C Balance");
System.out.println("2. Withdraw Money");
System.out.println("3. Deposit Money");
System.out.println("4. Exit");

Scanner sc=new Scanner(System.in);
int opt=sc.nextInt();

if(opt==1){
checkbalance();
}
else if(opt==2){
withdrawmoney();
}
else if(opt==3){
depositmoney();
}
else if(opt==4){
System.out.println("Thank You For Using Our Interface");
return;
}
else{
System.out.println("=====ENTER VALID CHOICE=====");
}
}
public void checkbalance(){
System.out.println("Balance: "+balance);
menu();
}

public void withdrawmoney(){
System.out.println("Enter Amount to Withdraw: ");
Scanner sc=new Scanner(System.in);
Float amount=sc.nextFloat();
if(amount>balance){
System.out.println("Insufficient Balance");
}
else{
balance=balance-amount;
System.out.println("Money Withdrawl Successful");
}
menu();
}

public void depositmoney(){
System.out.println("Enter the Amount:");
Scanner sc=new Scanner(System.in);
float amount=sc.nextFloat();
balance=balance+amount;
System.out.println("Money Deposited Successfully");
menu();
}

public void exit(){
menu();
}
}
public class atmmachine{
public static void main(String args[]){
atm obj=new atm();
obj.chpin();
}}