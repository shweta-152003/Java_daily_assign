class Codex{
	public static void main(String[] args){
	char ch='A';
	for(int i=1;i<=4;i++){
		for(int j=4;j>=i;j--){
			System.out.print(ch+" ");
			ch+=2;		

                       }System.out.println();
			if(i==1){
				ch='B';
			}else if(i==2){
				ch='C';
			}else if(i==3){
				ch='D';
               }
        }
   }
}