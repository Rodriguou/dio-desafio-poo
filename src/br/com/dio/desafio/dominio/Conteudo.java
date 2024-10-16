package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private final String titulo;
    private final String descricao;

    public Conteudo(String titulo, String descricao) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título é obrigatório");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição é obrigatória");
        }
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}