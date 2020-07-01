/* 2º Exercício resolvido - switch 
  Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
  Faça um programa que calcule o valor total a ser pago por uma pessoa.
  O programa deverá ler o valor total da compra efetuada e um código que
 identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).
 */

#include<stdio.h>
#include<locale.h>
int main(){
    float total_c, valor_compra;
    int codigo;

    setlocale(LC_ALL,"portuguese");

    printf("\n\t Descontos na loja\n");
    printf("\n Informe o valor total da compra ");
    scanf("%f",&total_c);
    printf("\n Digite seu código: ");
    printf("\n 1: cliente comum ");
    printf("\n 2: funcionário ");
    printf("\n 3: cliente vip \n");
    scanf("%d",&codigo);
    switch(codigo){
        case 1:
            printf("\n valor total a ser pago: %.1f",total_c);
        break;

        case 2:
            valor_compra=total_c-(total_c*0.1); 
            printf("\n valor total a ser pago: %.1f",valor_compra);
        break;

        case 3:
            valor_compra=total_c-(total_c*0.05); 
            printf("\n valor total a ser pago: %.1f",valor_compra);
        break; 

        default:
            printf("\n opção inválida"); 
    }
    return 0; 
}
