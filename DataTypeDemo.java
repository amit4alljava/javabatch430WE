strictfp class DataTypeDemo{
public static void main(String args[]){
// Number Types (non - decimal)
byte s = 10;  // 1 Byte
short w = 10;  // 2 Byte
int a = 10; // 4 Bytes
long b = 90L; // 8 Byte
//BigInteger b1 ;
//BigDecimal bb;
// Decimal Data Type
// IEEE - 754 Standard  (floating point calculation standard) 
float pp = 10.20F;  // 4 Byte
double tt = 20.30;  // 8 Byte

// char 
char w1 = 'A';  // 2 Byte (UNICODE)
boolean v = true;  // true 1 and 0 false 1 Byte , 2 Byte , 4 Byte
// String -String is a Predefine Java Class
// String is a collection of characters
// Internally String is a char array
String name = "Amit";  // 1 or 0 Object
String name2 ="Amit"; // Check in Pool Object is there or Not , 
// 2 or 1 Object using new String("Ram")
String name3 =new String("Amit"); //Every Time it Create a new Object
int ee = 1000;
//if(true){
//if(ee=2000){
if(name==name3){
System.out.println("Same Reference ");
}
else{
System.out.println("Not Same Reference ");
}
// Switch Case 
//final int SUNDAY = 1;
//final int MONDAY = 2;
//int day =SUNDAY;
String day = "Sunday"; // From Java 7 Onwards Switch can take String also
switch(day){
//case SUNDAY:  
case "Sunday":
System.out.println("Enjoy the Day ! ");
break;
//case MONDAY:
case "Monday":
System.out.println("Working Day ! ");
break;
default:
System.out.println("Wrong Day ");
}  
}
}
