package Construtora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Construtora {
    private List<Funcionario> funcs = new ArrayList<>();

    public Construtora(){

    }

    public void Inserir(Funcionario f){
        funcs.add(f);
    }

    public List<Funcionario> Funcionarios(){
        return funcs;
    }

    public List<Engenheiro> Engenheiros(){
        List<Engenheiro> engs = funcs.stream().filter(func -> func instanceof Engenheiro).map(func -> (Engenheiro) func).collect(Collectors.toList());

        return engs;
    }

    public List<Motorista> Motoristas(){
        List<Motorista> mots = funcs.stream().filter(func -> func instanceof Motorista).map(func -> (Motorista) func).collect(Collectors.toList());

        return mots;
    }



}
