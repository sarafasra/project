void main(){
   // Student s1 = new Student("sara",19 ,"A");
    // s1.displayInfo();
//    Product p1 = new Product(3,"laptop",8500);
//    p1.displayProduct();
//    Rectangle r = new Rectangle(7, 2);
//    r.display();
//    System.out.println(r.calculateArea());
    Car c = new Car("toyota","cra",2024);
    c.displayCar();

//    BankAccount b = new BankAccount(10,10000);
//    b.diposit(20000);
//    b.withdraw(1000);
//    b.displayBalance();
}

//1
//public class Student {
//    String name;
//    int age;
//    String grade;
//
//    public Student (String name, int age,String garde){
//        this.name = name;
//        this.age = age;
//        this.grade = garde;
//    }
//void displayInfo(){
//        System.out.println(name +" "+ age+ " " + grade);
//}



//2
//public class Product {
//       int id ;
//       String name ;
//       int price ;
//       public  Product (int id ,String name,int price){
//           this.id = id;
//           this.name = name;
//           this.price = price;
//       }
//       void displayProduct(){
//           System.out.println(id +" "+ name+" " + price);
//       }

//3
//class  Rectangle{
//    int length;
//    int width;
//    public Rectangle(int length,int width){
//        this.length = length;
//        this.width = width;
//
//    }
//    int calculateArea(){
//        return length * width;
//    }
//    void display(){
//        System.out.println("length : " + length + " width : " + width);
//    }

//4
//class  BankAccount{
//    int  accountNumber;
//    double  balance;
//    public BankAccount(int accountNumber,double balance ){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//    void diposit(double amount){
//        double sa = balance + amount;
//        System.out.println(sa);
//    }
//    void withdraw(double amount){
//        double sa = balance - amount;
//        System.out.println(sa);
//    }
//    void displayBalance(){
//        System.out.println(accountNumber + balance);
//    }

//5
public class Car {
    String  brand;
    String model;
    int  year;

  public Car (String brand,String model,int year){
      this.brand = brand;
      this.model = model;
      this.year = year;
  }
void displayCar(){

    System.out.println(brand +" "+ model+" "+ year);
      }

}

