class Codex{
	public static void main(String[] args){
	int a=4;
	for(int i=0;i<4;i++){
	    for(int j=0;j<4 ;j++){
		if(j>=i){
	         System.out.print(a+" ");
		}else{
		 System.out.print("  ");
                }
	}System.out.println();
	 a--;
     }
   }
}