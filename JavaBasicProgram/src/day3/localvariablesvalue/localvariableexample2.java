package day3.localvariablesvalue;

public class localvariableexample2 {

public static void main(String[] args) {	
   System.out.println("Program Starts");	
   //*| - | + | %
   int num1=10;
   int num2=2;
   int result=num1+num2;
   System.out.println("Number1:"+num1);
   System.out.println("Number2:"+num2);
   System.out.println("Result:"+result);
   System.out.println("****************multi************");
    //re-initializing num1 & result                
   num1=24;
   result=num1*num2;
   System.out.println("Number1:"+num1+"\nNumber2: "+num2+"\nResult:"+result);
   System.out.println("*********************sub*************");
   //re-initializing result
   result=num1-num2;
   System.out.println("Number1:"+num1+"\nNumber2: "+num2+"\nResult:"+result);
   System.out.println("Program ends");}
}

