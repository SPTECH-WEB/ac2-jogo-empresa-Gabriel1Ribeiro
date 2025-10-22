package school.sptech;

import java.time.LocalDate;

public class Jogo {
    private String codigo;
    private String nome;
    private String genero;
    private Double preco;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Jogo() {
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.dataLancamento = dataLancamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getAvaliacaoDescricao() {
        if (getAvaliacao() >= 4.5) {
            return "EXCELENTE";
        } else if (getAvaliacao() >= 3.5) {
            return "BOM";
        } else if (getAvaliacao() >= 3.5) {
            return "REGULAR";
        } else {
            return "RUIM";
        }
    }
}
/*
1. Classe Jogo
A classe Jogo deve representar um jogo de videogame com as seguintes características:

Atributos:

String codigo: Código único que identifica o jogo.
String nome: Nome do jogo.
String genero: Gênero do jogo (ex: Ação, Aventura, RPG).
Double preco: Preço do jogo.
Double avaliacao: Avaliação do jogo em uma escala de 0 a 5.
LocalDate dataLancamento: Data de lançamento do jogo.
Construtores:

Um construtor sem argumentos.
Getters e Setters:

Getter e Setter para todos os atributos: codigo, nome, genero, preco, avaliacao e dataLancamento.
Métodos:

String getAvaliacaoDescricao(): Esse método deve retornar uma descrição baseada na avaliação do jogo:
Se a avaliação for maior ou igual a 4.5, retornar "EXCELENTE".
Se a avaliação for maior ou igual a 3.5, retornar "BOM".
Se a avaliação for maior ou igual a 2.5, retornar "REGULAR".
Caso contrário, retornar "RUIM".
 */