/*7º Exercício resolvido

Faça um programa de conversão de base numérica. O programa deverá apresentar
 uma tela de entrada com as seguintes opções:

            < Conversão de base >

            1: decimal para hexadecimal
            2: hexadecimal para decimal
            3: decimal para octal
            4: octal para decimal
            5: Encerra

Lembre que, você deve informar as opções para que a partir da opção escolhida,
 o programa deva pedir o número na base escolhida, lê-lo e apresentá-lo na base desejada.
 Em seguida, o programa deve perguntar ao usuário se ele deseja retornar ao menu
  principal ou finalizar o programa. O problema pode ser estendido a outras bases,
  de acordo com o interesse do aluno.
*/

#include <stdio.h>

main(){

    int valor, opcao = 0;
    char opcao_c;

    while (opcao != 5){ /* se opção igual a 5 encerra o programa*/
        /* Imprimindo as opções na tela */
        printf("\n\n\t< Conversao de base >");
        printf("\n  1: decimal para hexadecimal");
        printf("\n  2: hexadecimal para decimal");
        printf("\n  3: decimal para octal");
        printf("\n  4: octal para decimal");
        printf("\n  5: Encerra");
        printf("\n\t\t Informe sua opcao: ");
        scanf("%d", &opcao);
        
        if ((opcao > 4)||(opcao < 1))
            continue; /*se a opção está entre 1 e 4 é pra continuar a execução do programa, senão,voltar no inicio*/
        printf("\nEntre com o numero para converter: ");

        switch (opcao){
            case 1:
                scanf("%d", &valor);
                printf("Numero convertido: %x", valor);
            break;

            case 2:
                scanf("%x", &valor);
                printf("Numero convertido: %d", valor);
            break;

            case 3:
                scanf("%d", &valor);
                printf("Numero convertido: %o", valor);
            break;

            case 4:
                scanf("%o", &valor);
                printf("Numero convertido: %d", valor);
            break;
        }
    }
}
