package repositorios.implementacoes;

import entidades.Academico;
import repositorios.interfaces.IAcademicoRepositorio;

public class AcademicoRepositorio implements IAcademicoRepositorio {

    // Implementação do método salvar do repositório
    public void salvar(Academico academico){
        if (academico == null){
            System.out.println("ERRO: Acadêmico não pode ser salvo");
        } else {
            System.out.println("SUCESSO: Acadêmico salvo com sucesso");
        }
    }
}
