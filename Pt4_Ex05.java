package Parte4;

/*5 – Elabore um programa que preencha uma matriz 12 X 4 com os valores das vendas de uma loja, em que cada linha representa um mês do ano e cada coluna representa uma semana do mês.
 * O programa deverá calcular e mostrar:
 *  O total vendido em cada mês do ano, mostrando o nome do mês por extenso;
 *  O total vendido em cada semana durante o ano;
 *  O total vendido pela loja no ano.*/

import javax.swing.JOptionPane;

class Pt4_Ex05{
    public static void main(String args[]){
        //Matrizes:
      
        int mes[] = new int[12];
        int sem[] = new int[4];
        //Variáveis:
        int l, c, ano = 0;
        String frase = "";
        //Código:
       
            for(c=0;c<4;c++){
                vnd[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor das vendas:\nMês: " + (l+1) + "\nSemana: " + (c+1)));
                mes[l] += vnd[l][c];
                sem[c] += vnd[l][c];
                ano += vnd[l][c];
            }
        }
        //Resultados:
        frase = "Total de vendas por mês:\n" +
                "Jan: " + mes[0] + "\nFev: " + mes[1] + "\nMar: " + mes[2] +
                "\nAbr: " + mes[3] + "\nMai: " + mes[4] + "\nJun: " + mes[5] +
                "\nJul: " + mes[6] + "\nAgo: " + mes[7] + "\nSet: " + mes[8] +
                "\nOut: " + mes[9] + "\nNov: " + mes[10] + "\nDez: " + mes[11] +
                "\n\nTotal de vendas por semana:\n" +
               
                "\n\nTotal de vendas no ano:\n" + ano;
       
    }
}
