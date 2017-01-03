
public class Session2Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		System.out.println("Prime numbers between 1 and 100");
		for(int i=1;i<=100;i++){
			count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
					break;
				}				
			}	
			if(count==0){
				System.out.println(i);
			}
		}
	}

}
