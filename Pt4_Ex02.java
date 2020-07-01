package Parte4;

/*2 – Crie um programa que preencha uma matriz 2 X 4 com números inteiros, calcule e mostre:
 *  A quantidade de elementos entre 12 e 20 em cada linha;
 *  A média dos elementos pares da matriz.*/

import javax.swing.JOptionPane;

class Pt4_Ex02
{
    public static void main(String args[])
    {
        //Matriz:
        int m[][] = new int[2][4];
        //Variáveis:
        int l, c, cont = 0, par = 0;
        float med = 0;
        String mat = "";
        String frase = "Qtd de elementos entre 12 e 20:";
        //Código:
        for(l=0;l<2;l++)
        {
            cont = 0;
            for(c=0;c<4;c++)
            {
                m[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz:\n" + "Linha: " + (l+1) + "\nColuna: " + (c+1)));
                if(m[l][c] > 12 && m[l][c] < 20)
                {
                    cont++;
                }
                if(m[l][c] %2 == 0)
                {
                    par++;
                    med = med + m[l][c];
                }
                //String para exibir a matriz no final:
                mat = mat + m[l][c] + "  ";
            }
            mat = mat + "\n";
            frase = frase + "\nLinha " + (l+1) + ": " + cont;
        }
        //Resultados:
        med = med / par;
        frase = frase + "\n\nMédia dos elementos pares da matriz:\n" + med +
                "\n\nMatriz preenchida:\n" + mat;
        JOptionPane.showMessageDialog(null, frase);
    }
}