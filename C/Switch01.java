import java.util.Scanner;
class P3Ex08{
    public static void main (String args[]){
        
        Scanner teclado = new Scanner (System.in);
        
        float media[] = new float[7], maior=0, sit[] = new float[7];
        String nomes[] = new String [7], nomem = null, situ[] = new String[7];
        int i, an=0;
        
        for(i=0; i<7; i++){
            teclado.nextLine();
            System.out.println("Digite o nome do aluno");
            nomes[i] = teclado.nextLine();
            System.out.println("Digite a média do aluno");
            media[i] = teclado.nextFloat();
            if(media[i] >= maior){
                maior = media[i];
                nomem = nomes[i];
            }
            
            if(media[i] < 5){
                sit[an] = 5 - media[i];
                situ[an] = nomes[i];
                an++;
            }
        }
        
        System.out.println("Maior média da sala: " + nomem + "\nAlunos com média vermelha:");
        for(i=0; i< an; i++){
            System.out.println("O aluno " + situ[i] + " precisa de " + sit[i] + " pontos para melhorar sua nota");
        }
    }
}