package school.sptech;

import school.sptech.exception.JogoInvalidoException;
import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.JogoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Jogo> jogos;
//    private Jogo jogoCodigoo;

    public Empresa() {
        this.nome = nome;
        this.jogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void adicionarJogo(Jogo jogo)
            throws JogoInvalidoException{

        if (jogo == null) {
            throw new JogoInvalidoException("O jogo é nulo");
        } else {
            getJogos().add(jogo);
        }

//        if (jogo.getCodigo() == null) {
//            throw new JogoInvalidoException("O jogo é nulo");
//        }else {
//            jogo.getCodigo().add(jogo);
//        }
    }

    public Jogo buscarJogoPorCodigo(String codigo)
        throws ArgumentoInvalidoException,
            JogoNaoEncontradoException{

        if(codigo == null || codigo == " ") {
            throw new JogoInvalidoException("O código é nulo ou está em branco");
        }else {
            for (Jogo jogo : jogos) {
                if (jogo.getCodigo() == codigo) {
                    return jogo;
                } else {
                    throw new JogoNaoEncontradoException("Código não encontrado");
                }
            }
        }
        return null;
    }

    public Jogo buscarJogoComMelhorAvaliacao() {
        double avaliacaoMelhor = 0;
        jogos getAvaliacao
        if()
        return null;
    }
}

/*
Métodos:

void adicionarJogo(Jogo jogo): Adiciona um jogo à lista de jogos da empresa.

Comportamento esperado:
jogo: O jogo a ser adicionado não pode ser nulo. Se o jogo for nulo, lançar uma JogoInvalidoException.
código: O código do jogo deve ser válido (não nulo e não vazio). Se o código for inválido, lançar uma JogoInvalidoException.
nome: O nome do jogo deve ser válido (não nulo e não vazio). Se o nome for inválido, lançar uma JogoInvalidoException.
gênero: O gênero do jogo deve ser válido (não nulo e não vazio). Se o gênero for inválido, lançar uma JogoInvalidoException.
preço: O preço do jogo deve ser maior que zero e não nulo. Se o preço for inválido (por exemplo, valor menor ou igual a zero ), lançar a exceção JogoInvalidoException.
avaliação: A avaliação do jogo deve estar dentro do intervalo de 0 a 5. Se a avaliação estiver fora desse intervalo, lançar uma JogoInvalidoException.
data de lançamento: A data de lançamento do jogo deve ser válida (não nula e não pode ser uma data futura). Sea data de lançamento for inválida ou estiver no futuro, lançar a exceção JogoInvalidoException.

Jogo buscarJogoPorCodigo(String codigo): Busca um jogo na lista de jogos pelo seu código.

Comportamento esperado:
Deve validar se o código fornecido não é nulo, vazio ou em branco.
Se o código for inválido, deve lançar uma ArgumentoInvalidoException.
Se o jogo não for encontrado, deve lançar uma JogoNaoEncontradoException.
void removerJogoPorCodigo(String codigo): Remove um jogo da lista com base no seu código.

Comportamento esperado:
Se o jogo não for encontrado, deve lançar uma JogoNaoEncontradoException.
Se o código fornecido for nulo, vazio ou em branco, deve lançar uma ArgumentoInvalidoException.
Jogo buscarJogoComMelhorAvaliacao(): Busca o jogo com a melhor avaliação.

Comportamento esperado:
Se dois ou mais jogos tiverem a mesma avaliação, deve-se retornar o mais recente (com a data de lançamento mais recente).

Se não houver jogos na lista, deve lançar uma JogoNaoEncontradoException.

Observação: Considere que nos cenários a serem testados, não existe a possibilidade de dois jogos terem a mesma avaliação e a mesma data de lançamento.

List<Jogo> buscarJogoPorPeriodo(LocalDate dataInicio, LocalDate dataFim): Retorna uma lista de jogos cujo lançamento esteja entre as datas de início e fim fornecidas.

Comportamento esperado:
Se as datas de início ou fim forem nulas, ou se a data de início for maior que a data de fim, deve lançar uma ArgumentoInvalidoException.
Deve retornar uma lista de jogos cuja data de lançamento esteja dentro do intervalo fornecido (inclusive).
 */