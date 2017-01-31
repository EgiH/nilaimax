public class NilaiMax {

	public static void main(String[]args){

	 int no1 = 10, no2 = 23, no3 = 5;

	 int max;

	 System.out.println("number 1 = "+no1);
	 System.out.println("number 2 = "+no2);
	 System.out.println("number 3 = "+no3);


	 max=(no2>=no1)? no2: no1;

	 max=(no3>=max)? no3: max;

	 System.out.println("Nilai tertingginya adalah angka = "+max);

	}

	}