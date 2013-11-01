package palavrasCruzadas;

public class PalavrasCruzadas {
	
	
	int Nlinhas; 
	int Ncolunas;
	int [][] matriz = new int [Nlinhas][Ncolunas];
	int i; // linhas
	int j; //colunas
	void palavras (){
		int count =0;
		for (i=0;i<=Nlinhas; i++){
			for (j=0;j<=Ncolunas;j++){
				
				if (matriz [i][j] == -1) 
						matriz[i][j]= -1;				
				
				else {
				
				if ((matriz [i][j] != -1) && matriz [i][j+1]==0 || matriz [i+1][j] ==0 || matriz [i-11][j] ==0){
					matriz[i][j]= 1 + count;
					count = count+1;
				}
				 
				if (((matriz [i][j] !=0) || matriz [i][j]!= -1) && ((matriz [i][j-1] !=0) || (matriz [i][j-1]!= -1)))
							matriz [i][j+count] = 0;	
						
				if (((matriz [i][j] !=0) || matriz [i][j]!= -1) && ((matriz [i][j+1] !=0 || matriz [i][j+1]!= -1)))
							matriz [i][j+count] = 0;
					
				if (((matriz [i][j] !=0) || matriz [i][j]!= -1) && ((matriz [i-1][j] !=0) || (matriz [i-1][j]!= -1)))
						matriz [i][j+count] = 0;	
					
				if (((matriz [i][j] !=0) || matriz [i][j]!= -1) && ((matriz [i+1][j] !=0 || matriz [i+1][j]!= -1)))
						matriz [i][j+count] = 0;
				}
			}
		}
	}
}
