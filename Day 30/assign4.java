class Codex {
	public static void main(String[] args){
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(j<3-i){
					System.out.print("   ");
				}else{
					System.out.print((char)(68-j));
					System.out.print(j+i +" ");

				}
			}System.out.println();
        	}
	}
}