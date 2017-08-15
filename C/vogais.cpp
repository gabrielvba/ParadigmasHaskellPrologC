#include <stdio.h>
#include <string.h>

int main(){
	int count = 0;
	char palavra[10];

	
	while (count < 3){
		bool semvogal = true;
		int i;
		
		scanf("%s", palavra);
		
		for (i=0 ; i <= strlen(palavra) ;i++){
			
			if(palavra[i] == 'a' ||palavra[i] == 'e' ||palavra[i] == 'i' ||palavra[i] == 'o' || palavra[i] == 'u'){
				semvogal = false;
				
			}	
			
		}
		
		if(semvogal){
			printf("%s\n", palavra  );
			count += 1;
		}
		
	}
	

}
