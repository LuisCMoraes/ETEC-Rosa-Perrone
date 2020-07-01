package Parte4;

/*1 – Faça um programa que preencha uma matriz 3 X 5 com números inteiros, calcule e mostre a quantidade de elementos entre 15 e 20.*/

import javax.swing.JOptionPane;

class Pt4_Ex01{
    public static void main(String args[]){
        //Matriz:
        int m[][] = new int[3][5];
        //Variáveis:
        int l, c, cont = 0;
        String mat = "";
        String frase = "";
        //Código:
        for(l=0;l<3;l++){
            for(c=0;c<5;c++){
                m[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz:\n" + "Linha: " + (l+1) + "\nColuna: " + (c+1)));
                if(m[l][c] > 15 && m[l][c] < 20){
                    cont++;
                }
                //String para exibir a matriz no final:
                mat = mat + m[l][c] + "  ";
            }
            mat = mat + "\n";
        }
        //Resultados:
        frase = "Qtd de elementos entre 15 e 20:\n" + cont +
                "\n\nMatriz preenchida:\n" + mat;
        JOptionPane.showMessageDialog(null, frase);
    }
}
