class Main{
    public static void main(String[] args) {
        //write your code  here this is comment
        /*Multiple line code
         */
        //System.out.println("Hello,World!");
        //Variables:The data we want to allocate to the memory temporarily to print later is known as variable
        //String name="Suraj";
        //name="Amit";
        // String neighbour="Akku";
        //int age=30;
        //String friend=neighbour;
        //System.out.println("My friend is: "+friend); //output will be amit because memory location is updated

        //Java Type java type is also of two types 1.Primitive and 2. is Reference type
        //let's first talk about primitive type there are lots of primitive type in java follows:
        //BYTE -1 [-128 to 127]
        //SHORT 2
        //INT 4 1,2,3...
        //LONG 8
        //Float 4 3.12 etc
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
        /*NON PDT have few differences from PDT which are as: 1.NON PDT have their own method or fuction to opearte on it's location or variable
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
        String name="Suraj";
        String str="Dehradoon";
        String str1 = str.replace('d','p');

        //System.out.println(str.charAt(3)); //charAt(int ) method
        //System.out.println(str.length());    //length() method /property
        //System.out.println(str.indexOf('h')); //indexOf(char); method
        System.out.println(str1); //replace(char,char);
        System.out.println(str); // original string will remain same bcz string objects are immutable.

        //Substring
        System.out.println(str1.substring(5,9));
    }}