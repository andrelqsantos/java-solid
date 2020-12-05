package casosDeUso;

import entidades.Academico;
import repositorios.interfaces.IAcademicoRepositorio;

public class SalvarAcademicoCasoDeUso {

    // Declara a interface padrão do repositório
    private IAcademicoRepositorio repositorio;

    // Construtor da classe precisa receber um repositório
    public SalvarAcademicoCasoDeUso(IAcademicoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    // Monta o objeto academico e chama o repositório para salvar
    public void executar(String nome, String email, String rga){
        Academico academico = new Academico(nome, email, rga);
        repositorio.salvar(academico);
    }

}
