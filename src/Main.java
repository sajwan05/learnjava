import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //write your code  here this is comment
        /*Multiple line comment
         */
        //System.out.println("Hello,World!");
        //Variables:The data we want to allocate to the memory temporarily to print later is known as variable
        //String name="Suraj";
        //name="Amit";
        // String neighbour="Akku";
        //int age=30;
        //String friend=neighbour;
        //System.out.println("My friend is: "+friend); //output will be amit because memory location is updated

        //Java Type is also of two types 1.Primitive and 2. is Reference type
        //let's first talk about primitive type there are lots of primitive type in java follows:
        //BYTE -1 [-128 to 127]
        //SHORT 2
        //INT 4 1,2,3...
        //LONG 8
        //Float 4 3.12 etc.
        //Double 8 more precision in decimal point then float
        //Boolean 1 true/false

        // byte age =24;
        //int phone =123456789;
        // long phone2 = 123456789000L;
        //float pi=3.14 this statement will give error too beacuse java thinks it is integer
        //float pi =3.14f;
        //char letter='@';
        //boolean isAdult=true;
        //System.out.println("phone number is :"+phone2);
        //WE'RE DONE WITH THE primitive types


        //Non-PRIMITIVE data types
        /*NON PDT have few differences from PDT which are as: 1.NON PDT have their own method
        or fuction to opearte on its location or variable
         * 2.NON PDT doesn't have fixed size(range ) like PDT  have
         * 3.NON PDT have to be declared with "new" keyword but it is NOT COMPULSARY*/
        //String name ="Suraj";
        //System.out.println("name :"+name);
       // String name = "Suraj";
       // String friend ="Aditya";
       // System.out.println("Name is" + name);


        //String:
        //Concatenate
        //charAt()
        //String name1 = "Lodu";
        //String name2 = "Joshi";
        //String name3= name1+ " and " + name2;
        //System.out.println(name3);

        //charAt()
        //String name="Suraj";
        //String str="Dehradoon";
        //String str1 = str.replace('d','p');

        //System.out.println(str.charAt(3)); //charAt(int ) method
        //System.out.println(str.length());    //length() method /property
        //System.out.println(str.indexOf('h')); //indexOf(char); method
        //System.out.println(str1); //replace(char,char);
        //System.out.println(str); // original string will remain same bcz string objects are immutable.

        //Substring
        //System.out.println(str1.substring(5,9)); // it will include first index but not end index(9)

        //Array
        //let's say we have to store the marks of a student in few subject we can di it as follows:
        //int maths = 99;
        //int chem=89;
        //int phy=75;
        //or we could assign value to a data structure known as array

        //int[]  marks= new int[3];//if we don't initialize array it will be defaultly NULL or 0 in
        // that matter
        //marks[0]=99;
        //marks[1]=89;
        //marks[2]=75;
        //int [] marks = {99, 89, 75};
        //System.out.println(marks); //this will not print array it will print some hex value(garbage)
        //To print array element we can use square bracket and index after array name
        //System.out.println("Marks in maths,Chem and phy is :"+marks[0] +marks[1] +marks[2]);
        //System.out.println(marks.length);//length is a array property which tells us about
        //SORTING AN ARRAY: there is a class known as Arrays where sorting is defined
        //System.out.println(marks[0]);
        //Arrays.sort(marks); //java.util.Arrays; is a package
        //System.out.println(marks[1]);

        //2-D ARRAY [][] respectively denote row and column
        //int [][] fM ={{99, 89, 75}, {81, 82, 79}};
        //System.out.println(fM[1][2]);

        //casting implicit and explicit implicit  happen smaller to bigger but not vice versa
        //explicit casting we have to create by explicitly telling (int) or to whatever


        //const
        //final int height =172;

        //MATH CLASS
        //System.out.println(Math.max(99,89));//Tells us about maximum between two int
        //System.out.println(Math.min(6,7));//tells us about minimum between two int
        //System.out.println((int)(Math.random()*100));

        //TAKING INPUT IN JAVA
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Your Feedback: ");
        //int age =sc.nextInt();
        //double age = sc.nextDouble();
        //String name=sc.next(); //Use to input string,but next() only take token(single word)
        //String message = sc.nextLine();
        //System.out.println("Hello "+name);
        //System.out.println(message);


        //CONDITIONAL STATEMENT if-else switch case:
        //WAP to check how much cash you have and can you afford pen and pencil both?
        //pen=10 & notebook=40

        //Input the case IF ELSE
        //Scanner sc = new Scanner(System.in);
        //System.out.println("How much cash do you have?");
        //int cash = sc.nextInt();
        //if (cash<10){
            //System.out.println("Sorry!You don't have enough Cash");
            //System.out.println("Bring more Cash");}
        //else if (cash>=10 && cash<50) {
            //System.out.println("You can only buy one thing");
        //}else
            //System.out.println("You can buy both");


        //CONDITIONAL STATEMENT-SWITCH CASE
        //int day=1;
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Input number: ");
        //int day = sc.nextInt();
        //System.out.println(day);

        //switch(day){
            //case 1:
                //System.out.println("Monday");
                //break;
            //case 2:
                //System.out.println("Tuesday");
                //break;
            //default:
                //System.out.println("Wed-Sun");}

        //LOOPS
        //1.For loop
        //for(int i=10;i>0;i--){
            //System.out.println(i);}

        //WHILE LOOP
        //int i=10;
        //while(i>0){
            //System.out.println(i);
            //i--;}

        //DO WHILE LOOP
        //int i=11;
        //do{
            //System.out.println(i);
            //i--;
        //}while(i>0);

        //let's take  input from user until user enter negative value

        //Scanner sc = new Scanner(System.in);
        //int number;
        //do{

            //System.out.println("Enter a number: ");
            //number = sc.nextInt();
            //System.out.println("Here is your number: ");
            //System.out.println(number);
        //}while(number >=0);

        //System.out.println("End");
        //TRY -CATCH EXCEPTION HANDLING
        int[] marks ={99,89,75};
        try {
            System.out.println(marks[5]);
        }catch(Exception exception){
            //Whatever you want to do here
        }
        System.out.println("marks in chem is: "+marks[1]);
    }}

