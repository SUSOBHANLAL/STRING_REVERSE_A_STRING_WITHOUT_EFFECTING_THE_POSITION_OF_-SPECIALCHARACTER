package reversreAstringwithoutChangeThespecialcharacter;

public class susobhan {
	public static void main(String args[]) {
		String  s= "##aa$p$id";
		char arr[] = s.toCharArray();
		int i =0;
		int j =arr.length-1;
		while(i<=j) {
			//if arr[i] not a alphabet
			if(!Character.isAlphabetic(arr[i])) {i++;} // mana jodi speciacl character thaka to ja acha sata i rakha i++
			else if(!Character.isAlphabetic(arr[j])) {j--;}
			
			else {
				//make swap last to first and first to last
				char temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				i++;j--;
			}
			
		}
		for(int n =0;n<arr.length;n++)
		
		System.out.print(arr[n]);
	}

}
