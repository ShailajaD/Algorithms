public class SortUsingflipArray {
	public static void main(String[] args) {
		int [] input = {1, 5, 4, 3, 2};
		int[] result = sortUsingFlip(input);
		for(int i:result){
			System.out.print(i+" ");
		}
	}

	private static int[] sortUsingFlip(int[] input) {
		int count = input.length-1;
		while(count >0){
			//move the max element to the end
			int maxIdx = maxIndex(input,count);
			//flip the input array with k as maxIdx
			input = flip(input,maxIdx);
			//flip the input array with input.length as k
			input = flip(input,count);	
			count--;
		}		
		return input;
	}

	private static int[] flip(int[] input, int maxIdx) {
		int p = 0, q = maxIdx;
		//swap p and q till
		while(p < q ){
			int temp = input[p];
			input[p] = input[q];
			input[q] = temp;
			p++; q--;
		}
		return input;
	}

	private static int maxIndex(int[] input,int end) {
		int idx = 0, max = 0;
		for(int i = 0; i <= end; i++){
			if(input[i] > max){
				max = input[i];
				idx = i;
			}
		}
		return idx;
	}
}
