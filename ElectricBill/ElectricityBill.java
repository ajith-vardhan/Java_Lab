import java.util.Scanner;
//imported scanner class to take input from user
// created a class called electricity bill to calculate the elecricity bill of the respected user
class ElectricityBill{
    //data members or inatances of the object
    private int consumerNo;
    private String consumerName , typeOfEB;
    private double previousReading;
    private double currentReading , amo,actualReading;
    //created a constructor
    ElectricityBill(int cno , String cn , double pr , double cr , String type){
        consumerNo = cno;
        consumerName = cn;
        previousReading = pr;
        currentReading = cr;
        typeOfEB = type;
        actualReading = Math.max(cr,pr)-Math.min(cr,pr);
    }
    //the method returns a double type of bill amount of the user
    double getBillAmount(){
        if(typeOfEB == "d"){
            if(this.actualReading<=100){
                amo = this.actualReading*1.0;
            }
            else if(101<=this.actualReading && this.actualReading<=200){
                amo =this.currentReading*2.50;
            }
            else if(201<=this.actualReading && this.actualReading<=500){
                amo =this.actualReading*4.0;
            }
            else if(this.actualReading>500){
                amo = this.actualReading*6.0;
            }
        }
        if(typeOfEB == "c"){
            if(this.actualReading<=100){
                amo =this.actualReading*2.0;
            }
            else if(101<=this.actualReading && this.actualReading<=200){
                amo = this.actualReading*4.50;
            }
            else if(201<=this.actualReading && this.actualReading<=500){
            amo =  this.actualReading*6.0;
            }
            else if(this.actualReading>500){
                amo = this.actualReading*7.0;
            }
        }
        return amo;
    }
    void getBillInfo(){
        System.out.println("Name :"+this.consumerName+
                            "ID no :"+this.consumerNo+
                            "Type of Electricity bill :"+this.typeOfEB+
                            "Previous Reading :"+this.previousReading+
                            "Current Reading :"+this.currentReading+
                            "Amount Bill :"+this.getBillAmount());
                            
    }
}

class Main2{
    public static void main(String[] args) {
        //taking input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        String cname = scan.nextLine();
        System.out.println("Enter Customer NO :");
        int cno = scan.nextInt();
        System.out.println("Enter type of EB connection ('d' for domenstic and 'c' for commercial): ");
        String eb = scan.nextLine();
        System.out.println("Enter Customers previous reading :");
        double pr = scan.nextDouble();
        System.out.println("Enter Customers current reading :");
        double cr = scan.nextDouble();
        //reading datd from the user
        //created an object from the data given by the user
        ElectricityBill bill = new ElectricityBill(cno,cname,pr,cr,eb);
        bill.getBillInfo();
        
        
    }
}
