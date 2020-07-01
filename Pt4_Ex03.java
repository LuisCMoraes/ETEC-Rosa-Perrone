package Parte4;

/*3 – Elabore um programa que preencha uma matriz 3 X 6, calcule e mostre:
 *  O maior elemento da matriz e sua respectiva posição, ou seja, linha e coluna;
 *  O menor elemento da matriz e sua respectiva posição, ou seja, linha e coluna.*/

import javax.swing.JOptionPane;

class Pt4_Ex03{
    public static void main(String args[]){
        //Matriz:
        
        //Variáveis:
        int l, c, maior = 0, menor = 0, lmaior = 0, cmaior = 0, lmenor = 0, cmenor = 0;
        String mat = "";
        String frase = "";
        //Código:
        for(l=0;l<3;l++){
           
                m[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz:\n" + "Linha: " + (l+1) + "\nColuna: " + (c+1)));
                if(l == 0 && c == 0){
                    maior = m[l][c];
                   
                    lmaior = l;
                    cmaior = c;
                }
                else{
                    if(m[l][c] > maior){
                        maior = m[l][c];
                        lmaior = l;
                        cmaior = c;
                    }
                    if(m[l][c] < menor){
                        menor = m[l][c];
                        lmenor = l;
                        cmenor = c;
                    }
                }
                //String para exibir a matriz no final:
               
            }
            mat = mat + "\n";
        }
        //Resultados:
        frase = "Maior número: " + maior + "\nLinha: " + lmaior + "\nColuna: " + cmaior +
                "\n\nMenor número: " + menor + "\nLinha: " + lmenor + "\nColuna: " + cmenor+
                "\n\nMatriz preenchida:\n" + mat;
        JOptionPane.showMessageDialog(null, frase);
    }
}
