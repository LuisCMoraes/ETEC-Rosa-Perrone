/* 1º Exercício resolvido

Elabore um algoritmo que leia dois valores do usuário e a operação que ele deseja executar
(Operações: soma, subtração, divisão, multiplicação).
Execute a operação desejada e imprima na tela.
*/
#include <stdio.h>
#include <locale.h> /* Biblioteca que nos permite utilizar a função setlocale para imprimir na tela caracteres da língua Portuguesa como por exemplo ç , á, ã */
int main(){
    float v1,v2;
    int opcao;
    setlocale(LC_ALL,"portuguese");

    printf("\n\t Operação entre 2 valores\n");
    printf("\n Digite o primeiro valor: ");
???????????????????????????????????
    printf("\n Digite o segundo valor: ");
    scanf("%f",&v2);

    printf("\n Qual operação deseja fazer:\n");
    printf("Digite 1: soma\n");
    printf("Digite 2: subtração\n");
    printf("Digite 3: divisão\n");
    printf("Digite 4: multiplicação\n");
    scanf("%d",&opcao);
    
    switch(opcao){
        case 1:
            printf(" %.1f + %.1f = %.1f ",v1,v2,(v1+v2));
            /* %.1f é para imprimir o número de ponto flutuante com uma casa após a vírgula */
        break;

        case 2:
 ????????????????????????????????????????           
        break;

        case 3:
            printf("%.1f:%.1f = %.1f",v1,v2,(v1/v2));
        break;

       ??????????????????????????????
            printf("%.1f*%.1f = %.1f",v1,v2,(v1*v2));
        break;  

        default:
            printf("\n opção invalida");
    }
    ?????????????????????????
}
