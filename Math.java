public class Math{
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			for(int num1 = 0; num1 < 24; num1++){
				for(int num2 = 0; num2 < 24; num2++){
					int result = sosuu[num1] - sosuu[num2];
					if (result == i){
						if (isSosuu(result)){
							continue;
						}
						System.out.println(sosuu[num1] + " - " + sosuu[num2] + " = " + result);
					}
				}
			}
		}
	}

	public static int[] sosuu = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,89,97};

	public static boolean isSosuu(int num){
		for(int i = 0; i < 24; i++){
			if (sosuu[i] == num){
				return true;
			}
		}
		return false;
	}
}
