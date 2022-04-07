package pacote2.exe1.nota;

import java.util.Locale;
import java.util.Scanner;

public class notas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f\n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0)
        {
            System.out.println("Reprovado.");
            System.out.printf("Faltaram %.2f pontos.", aluno.faltaPonto());
        }
        else
        {
            System.out.println("Aprovado!");
        }
        
        sc.close();
    }
}
