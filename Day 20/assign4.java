class Codex{
	public static void main(String args[] ){
	for(int i=0;i<4;i++){
		for(int j=3;j>=i;j--){
		  if(j%2==1){
			System.out.print("+ ");
                  }else{
			System.out.print("= ");
		  }
                }System.out.println();
        }
    }
}