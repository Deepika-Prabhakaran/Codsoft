/*Student Grade Calculator Program:
	 * Number of subjects to be entered is fetched from the user
	 * marks are added up to produce Total
	 * Grade criteria:
	Percentage >= 90% : Grade 0.
	Percentage >= 80% : Grade A.
	Percentage >= 70% : Grade B.
	Percentage >= 60% : Grade C.
	Percentage >= 40% : Grade D.
	Percentage < 40% : Grade F.
	Results are then displayed 
	 * 
	 * 

	 */
	package studentgradecalculator;
	import java.util.Scanner;
	public class studentgrade {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("STUDENT GRADE CALCULATOR");
			try {
			System.out.print("Enter number of subjects:");
			int no_of_subjects=sc.nextInt();
			int total=0;
			for(int i=0;i<no_of_subjects;i++) {
				System.out.print("Enter the mark"+(i+1)+":");
				int mark=sc.nextInt();
				total+= mark;
			}
			double percentage;
			percentage=total/no_of_subjects;
			char grade=' ';
			if (percentage>=90){
				grade='O';	
			}
			else if(percentage>=80) {
				grade='A';
			}
			else if(percentage>=70) {
				grade='B';	
			}
			else if(percentage>=60) {
				grade='C';
			}
			else if(percentage>=40) {
				grade='D';
			}
			else if (percentage<40) {
				grade='F';
			}
			else {
				System.out.println("invalid input");
			}
			System.out.println("---------RESULTS---------");
			System.out.println("Total marks :"+total);
			System.out.println("Average Percentage :"+percentage+"%");
			System.out.println("Grade :"+ grade);
			System.out.println("------------------------------");
		}
			catch(Exception e) {
				System.out.println("invalid input");
			}
		}
	}



