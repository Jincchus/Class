package ch4;

public class Test2 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		switch (grade) {
		case "A" :
			score1 = 100;
			break;
		case"B":
			int result = 100-20;
			score1 = result;
			break;
			default :
				score1 = 60;
		}
		System.out.println(score1);
		
		//if
		
		if(score1 >= 100) {
			grade = "A";
		} else if(score1 >=80) {
			grade = "B";
		}
	}
}

