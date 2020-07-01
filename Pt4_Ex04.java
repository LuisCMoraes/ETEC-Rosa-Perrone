package Parte4;

/*4 – Faça um programa que receba:
 * 1. As notas de 15 alunos em cinco provas diferentes e armazene-as em um a matriz 15 X 5;
 * 2. Os nomes dos 15 alunos e armazene-os em um vetor de 15 posições.
 * O programa deverá calcular e mostrar:
 *  Para cada aluno, o nome, a média aritmética das cinco provas e a situação (aprovado, reprovado ou exame);
 *  Média da classe.*/

import java.util.Scanner;

class Pt4_Ex04{
    public static void main(String args[]){
        
        //Matriz:
        float m[][] = new float[15][5];
        //Vetor:
      
        //Variáveis:
        int l, c;
        float media = 0, mediaclasse = 0;
        //Código:
        for(l=0;l<15;l++){
            System.out.print("Aluno " + (l+1) + ":\n");
            System.out.print("Digite o nome: ");
            vetnome[l] = teclado.next();
            for(c=0;c<5;c++){
                
                m[l][c] = teclado.nextFloat();
                media = media + m[l][c];
            }
            media = media / 5;
            System.out.print("\nMédia: " + String.format("%.2f", media));
            if(media < 5){
                System.out.println("\nAluno reprovado!\n");
            }
            else{
              
                    System.out.println("\nAluno aprovado!\n");
                }
                else{
                    System.out.println("\nAluno de exame!\n");
                }
            }
            mediaclasse = mediaclasse + media;
            media = 0;
        }
        mediaclasse = mediaclasse / l;
        System.out.println("-------------------------\nMédia da classe: " + String.format("%.2f", mediaclasse) + "\n-------------------------\n");
    }
}
