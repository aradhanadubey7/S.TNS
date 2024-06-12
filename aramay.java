// Day 3 loops concept 
// if concept
package may2024;

public class aramay {
		public static void main(String[] args) {
			int x=5;
			if(x!=5)//5!=5(f)
				System.out.println("value of x is not 5");
			System.out.println("value of x is 5");
			
			// check for eligible if else
			int age=11;
			if(age>=18)//11>=18
				System.out.println("eligible to vote");
			else
				System.out.println("not eligible to vote");
			
			System.out.println("if else demonstration");

			// largest of three number  using the nested loop 
			int a=10, b=20, c=5;
			System.out.println("The largest number is");
			if(a>b)//10>20
			{
				if(a>c)
					System.out.println(a);
				else
					System.out.println(c);
			}
			else
			{
				if(c>b)//5>20
					System.out.println(c);
				else
					System.out.println(b);//20
				//switch concept
			
				char x = '%';
				switch (x) 
				{
				case 'l' : 
				case 'L' : 
					System.out.println(x+" is a Letter");
					break;
				case 'd':
				case 'D' :
					System.out.println(x+" is a Digit");
					break;
				case 'w':
				case 'W' :	
					System.out.println(x+" is White Space");
					break;
				case 's':
				case 'S':
					System.out.println(x+" is Special Symbol");
				default:
					System.out.println(x+" is other than letter, digit, space or special symbol ");
		
					//for loop
					 {
							for(int i=1;i<=1000;i++)//(int i = 1000; i<=1;i--)
								System.out.println("the value of i is:"+i);

						}
					
					
					
					
					
					
					
				}
			}				
			
		}
		}

			
			
			
			
			
			
	

		


	
	
		
		
		
		
		
		
		
	
	


