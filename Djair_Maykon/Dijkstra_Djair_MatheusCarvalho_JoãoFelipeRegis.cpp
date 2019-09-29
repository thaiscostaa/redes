#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define INFINITO 999999999

int entrada[12+1];

main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	char decricaoCaminhos[10][30] = {"2 -> 3 -> 4 -> 8 -> 12",
					"2 -> 3 -> 7 -> 8 -> 12",
					"2 -> 3 -> 7 -> 11 -> 12",
					"2 -> 6 -> 7 -> 8 -> 12",
					"2 -> 6 -> 7 -> 11 -> 12",
					"2 -> 6 -> 10 -> 11 -> 12",
					"5 -> 9 -> 10 -> 11 -> 12",
					"5 -> 6 -> 7 -> 8 -> 12",
					"5 -> 6 -> 7 -> 11 -> 12",
					"5 -> 6 -> 10 -> 11 -> 12"
	};
	
	printf("Digite os valores de entrada.\n");
	
	for(int i = 1; i <= 12; i++){
		
		scanf("%d", &entrada[i]);
		
	}
	
	int caminhos[11];
	
	caminhos[1] = entrada[2] + entrada[3] + entrada[4] + entrada[8] + entrada[12];
	caminhos[2] = entrada[2] + entrada[3] + entrada[7] + entrada[8] + entrada[12];
	caminhos[3] = entrada[2] + entrada[3] + entrada[7] + entrada[11] + entrada[12];
	caminhos[4] = entrada[2] + entrada[6] + entrada[7] + entrada[8] + entrada[12];
	caminhos[5] = entrada[2] + entrada[6] + entrada[7] + entrada[11] + entrada[12];
	caminhos[6] = entrada[2] + entrada[6] + entrada[10] + entrada[11] + entrada[12];
	caminhos[7] = entrada[5] + entrada[9] + entrada[10] + entrada[11] + entrada[12];
	caminhos[8] = entrada[5] + entrada[6] + entrada[7] + entrada[8] + entrada[12];
	caminhos[9] = entrada[5] + entrada[6] + entrada[7] + entrada[11] + entrada[12];
	caminhos[10] = entrada[5] + entrada[6] + entrada[10] + entrada[11] + entrada[12];
	
	int menor = INFINITO;
	int indiceMenor = -1;
	
	for(int i = 1; i <= 10; i++){
		
		if(caminhos[i] < menor){
			
			menor = caminhos[i];
			indiceMenor = i;
			
		}
		
	}
	
	for(int i = 1; i <= 10; i++){
		
		if(caminhos[i] == menor){
			
			printf("O caminho: ");
			printf("%s", decricaoCaminhos[indiceMenor-1]);
			printf(" é o menor caminho com soma: %d", caminhos[indiceMenor]);
			
		}
		
	}
	
}
