object Major1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(351); 

 	/*
  val x = 1+2
  def square(x:Int)=x*x;
  println(square(x));
  	println(square(1));
  	println(square(2));
  
  def abs(x: Int) = if( x>=2) x else -x
  abs(-3);
  */
  
	//#1. Fib
	def fib(x:Int):Int ={
	val predicate1 =1;
	val predicate2 =2;
		if(x>1){
			return x
		} else if(y==1){
			return 1
		} else {
			return fib(x-1)+fib(x-2);
		}
	};System.out.println("""fib: (x: Int)Int""");$skip(665); 
	
	
	
	//------------------------------------------------------------------
	/*
	def fib(n:Int): Int= {
		val w1 = "Fizz";
		val w2 = "Buzz";
		
		if(w1==1){
		println("Fizz");
			return x;
		}
		else if(w2==2){
			println("Buzz");
			return y;
		}else {
		fib(n -1) + fib(n -1);
		}
	}
	*/
	
	//#2. FizzBuzz
	def fizzString(fizzString: String): String = {
	///insert your code here.
			
				val w1: String = "fig";
				val w2: String = "dib";
				val w3: String = "fib";
			
			if(fizzString.startsWith("f") && fizzString.endsWith("g")){
				"Fizz";
			} else if(fizzString.startsWith("f") && fizzString.endsWith("b")){
				"Buzz";
			} else {
				"Buzz";
			}
	};System.out.println("""fizzString: (fizzString: String)String""")}
}
	//------------------------------------------------------------------
	//#3.
	
	
	//------------------------------------------------------------------
	//#4
