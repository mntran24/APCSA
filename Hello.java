public class Hello {
	// public static double findAvg(int[] scores) {
	// 	if (scores.length > 0) {
	// 		int sum = 0;
	// 		for (int i = 0; i < scores.length; i++) {
	// 			sum += scores[i];
	// 		}
	// 		System.out.println(sum / scores.length);
	// 		return (sum / scores.length * 1.0);
	// 	}
	// 	System.out.println("0");
	// 	return 0.0;
	// }

	// public static void fixGradesArray(int[] scores) {
	// 	double average = findAvg(scores);
	// 	for (int i = 0; i < scores.length; i++) {
	// 		System.out.println("average at loop " + i + " is " + average);
	// 		System.out.println("score before mod " + scores[i]);
	// 		if (scores[i] > average) {
	// 			scores[i] /= 2;
	// 			System.out.println("new score is " + scores[i]);
	// 		} 
	// 		else {
	// 				if (scores[i] * 2 <= 100) {
	// 					scores[i] *= 2;
	// 				} else {
	// 					scores[i] = 100;
	// 				}
	// 				System.out.println("new score is " + scores[i]);
	// 			}
	// 		}
		
	// 	System.out.println("final array" + scores);
	// 	// return scores;
	// }

	public static void isAlmostEqual(String s, String target){
		for (int i = 0; i < s.length(); i++){
		  String removed = "";
		  removed += s.substring(0, i);
		  removed += s.substring(i+1, s.length());
		  System.out.println(removed);
		  System.out.println(target);
		  if (removed == target){
			System.out.println("true");
		  }
		}
		System.out.println("false");
	  }

	public static void main(String[] args) {
		// int[] myarray = {70, 83, 78, 94, 73, 82, 73, 62, 58, 62};
		// fixGradesArray(myarray);
		String ss = "XYZW";
		String targ = "XYW";
		isAlmostEqual(ss, targ);
	}
}