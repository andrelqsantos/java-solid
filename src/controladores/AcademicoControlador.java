package controladores;

import casosDeUso.SalvarAcademicoCasoDeUso;
import repositorios.implementacoes.AcademicoRepositorio;

import java.util.Scanner;

public class AcademicoControlador {

    public static void main(String[] args) {

        // Declaração das variaveis
        String nome, email, rga;
        AcademicoRepositorio repositorio = new AcademicoRepositorio();
        Scanner leitor = new Scanner(System.in);

        // Leitura dos dados
        System.out.println("Digite o nome do acadêmico: ");
        nome = leitor.nextLine();;
        System.out.println("Digite o email do acadêmico: ");
        email = leitor.nextLine();
        System.out.println("Digite o rga do acadêmico: ");
        rga = leitor.nextLine();

        // Executar caso de uso
        SalvarAcademicoCasoDeUso salvarAcademicoCasoDeUso = new SalvarAcademicoCasoDeUso(repositorio);
        salvarAcademicoCasoDeUso.executar(nome, email, rga);
    }
}
