/* 5º Exercício resolvido
Victor é um estudante do curso de Química que pretende calcular o volume dos principais
 sólidos geométricos conhecidos como cubo, paralelepípedo e cilindro  de forma ágil
 e eficiente utilizando um software. Com base nisso, construa um programa que
 gentilmente atenda a necessidade deste usuário.
*/
#include <stdio.h>
#include <locale.h>

int main(){
    int solido_geometrico;

    setlocale(LC_ALL,"portuguese");
    printf("\n Qual Volume Deseja Calcular ?\n");
    printf("\n Cubo : clique 1  \n ");
    printf("\n Paralelepípedo : clique 2 \n ");
    printf("\n Cilindro : clique 3 \n ");
    scanf("%d",&solido_geometrico); /*Pra armazenar a opção escolhida e efetuar as operações*/

    switch (solido_geometrico){
        case 1:
            printf("\n Você escolheu a opção 1: Cubo");
            float lado,volume_c;
            printf("\n Informe a medida do lado em cm :");
            scanf("%f",&lado);
            volume_c=lado*lado*lado;
            printf("Volume do cubo =%.1f centímetros cúbicos",volume_c);
        break;

        case 2:
            printf("\n Você escolheu a opção 2: Paralelepípedo \n ");
            float compr,larg,altura,volume_p;
            printf("\n Informe o comprimento em cm :");
            scanf("%f",&compr);
            printf("Informe a largura em cm :");
            scanf("%f",&larg);
            printf("Informe a altura em cm :");
            scanf("%f",&altura);
            volume_p=compr*larg*altura;
            /*O volume de um Paralelepípedo é igual ao produto
                entre o seu comprimento,largura e altura.*/
            printf("\n Volume do paralelepípedo =%.1f centímetros cúbicos",volume_p);
        break;

        case 3:
            printf("\n Você escolheu a opção 3: Cilindro \n");
            float PI,raio_base,altura_cl,volume_cl;
            PI=3.14;
            printf("\n Informe o raio da base em cm :");
            scanf("%f",&raio_base);
            printf("\n Informe a altura em cm :");
            scanf("%f",&altura_cl);
            volume_cl=PI*(raio_base*raio_base)*altura_cl;
            printf("\n Volume do Cilindro=%.1f centímetros cúbicos",volume_cl);
        break;
        default:
            printf("\n Opção Inválida :");
    }
    return 0;
}
