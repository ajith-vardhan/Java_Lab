import java.util.Scanner;
// this is a program to imitate the invoice of a store which has instances like item code , name , quantity,
// price per item

// a class called invoice is created
class InvoiceDemo{
    private String itemCode , name;
    private int quantity;
    private double pricePerItem;

    InvoiceDemo(){
        itemCode = "";
        name = "";
        quantity = 0;
        pricePerItem = 0.0;
    }
    void setItemCode(String newCode){
        this.itemCode = newCode;
    }
    // a method called setItemCode is created , it is used to set a new item code
    void setName(String newName){
        this.name = newName;
    }
    // a method called setName is created , it is used to set a new name
    void setQuantity(int newQuantity){
        if(newQuantity < 0){
            this.quantity = 0;
        }
        else{
            this.quantity = newQuantity;
        }
    }
        // a method called setQuantity is created , it is used to set a new no of quantity

    void setPricePerItem(double newPrice){
        if (newPrice<0){
            this.pricePerItem = 0.0;
        }
        else{
            this.pricePerItem = newPrice;
        }
    }
        // a method called setPricePerItem is created , it is used to set a new price for item

    String getItemCode(){
        return this.itemCode;
    }
        // a method called getItemCode is created , it returns itemcode

    String getName(){
        return this.name;
    }
            // a method called getName is created , it returns name

    int getQuantity(){
        return this.quantity;
    }
            // a method called getQuantity is created , it returns qunatity

    double getPricePerItem(){
        return this.pricePerItem;
    }
            // a method called getPricePerItem is created , it returns price per item

    double getInvoiceAmount(){
        return this.quantity*this.pricePerItem;
    }
    // this method return the total amount from the given quantity and price per item

 
}
class InvoiceDemoMain{
    public static void main(String[] args) {
        // creating a scanner object to scan input from user
        Scanner scan = new Scanner(System.in);
        // creating a new Invoice object
        InvoiceDemo ob = new InvoiceDemo();
        //getting input form user
        System.out.println("Enter Item Name :");
        String itemName = scan.nextLine();
        System.out.println("Enter Item Code :");
        String itemCode = scan.nextLine();
        System.out.println("Enter Quantity :");
        int q = scan.nextInt();
        System.out.println("Enter Price(per item)");
        double ppi = scan.nextDouble();
        //set the input data from user to instances
        ob.setItemCode(itemCode);
        ob.setName(itemName);
        ob.setPricePerItem(ppi);
        ob.setQuantity(q);
        //printing the final verdict
        System.out.println("item :"+ob.getName()+"\ncode : "+ob.getItemCode()+"\nquantity : "
                                                +ob.getQuantity()+"\nPrice(per item) : "+ob.getPricePerItem()+"\nTotal price : "+ob.getInvoiceAmount());   
}
}