class Codex{
	public static void main(String [] args){
		int sum=0;
		for(int i = 1;i <= 100; i++){
		sum=0;
		    for(int j = 1 ;j < i; j++){
		    if(i % j == 0){
			sum+=j; 
		    }		
		if(sum == i){
		continue;
		}
          }
		if(i != sum)
		  System.out.println(i+" ");
      
        }
    }
}