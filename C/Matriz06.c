/*  6º Exercício resolvido
 Crie um algoritmo que imprima o gênero de uma pessoa utilizando
um dos caracteres(M ou F) como entrada.
 */

#include <stdio.h>
#include <locale.h>

int main ( ){
    char genero;

    setlocale(LC_ALL,"portuguese");

    printf("Entre com uma letra (M / F): " ) ;
    scanf("%c",&genero ) ;

    switch(genero){
        case 'M':
            printf("Gênero Masculino " ) ;
        break;
        case 'F' :
            printf("Gênero Feminino " ) ;
        break ;
        default :
            printf("Gênero não especificado " ) ;
    }
    return 0;
}

