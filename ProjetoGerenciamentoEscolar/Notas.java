package ProjetoGerenciamentoEscolar;

public class Notas {
    private Integer avaliacaoUm, avaliacaoDois, avaliacaoFinal;

    public Notas(Integer avaliacaoUm, Integer avaliacaoDois){
        this.avaliacaoUm = avaliacaoUm;
        this.avaliacaoDois = avaliacaoDois;
        this.avaliacaoFinal = null;
    }
    public void setAvaliacaoUm(Integer avaliacaoUm) {
        this.avaliacaoUm = avaliacaoUm;
    }

    public Integer getAvaliacaoUm() {
        return avaliacaoUm;
    }

    public void setAvaliacaoDois(Integer avaliacaoDois) {
        this.avaliacaoDois = avaliacaoDois;
    }

    public Integer getAvaliacaoDois() {
        return avaliacaoDois;
    }

    public void setAvaliacaoFinal(Integer avaliacaoFinal) {
        this.avaliacaoFinal = avaliacaoFinal;
    }

    public Integer getAvaliacaoFinal() {
        return avaliacaoFinal;
    }
    
}
