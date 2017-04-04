package CTC_2;

public class GradRounding {

	
	public void grading(int[] grade){
		for(int i=0; i< grade.length;i++){
			int tmpGr = grade[i];
			int tmpTen = tmpGr/10;
			int Tens = 10*(tmpTen+1);
		if(tmpGr > 36){
			if(Tens - tmpGr <3){
				grade[i] = Tens;
			}
			else if((Tens-5) - tmpGr > 0 && (Tens-5) - tmpGr <3){
				grade[i] = (Tens-5);
			}
		}
			else {
				grade[i] = tmpGr;
			}
			}
		for(int f:grade){
			System.out.println(f+" ");
		}
	}
	
	
	public static void main(String[] args) {
		GradRounding gr = new GradRounding();
		int grade [] = {10,35,37,38,40, 55,88, 99, 63};
		gr.grading(grade);

	}

}
