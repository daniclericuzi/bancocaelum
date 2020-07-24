package bancocaelum;

import java.time.LocalDate;

public class TitularPessoaFisica extends Titular {
    private String cpf;
    private String genero;
    private LocalDate dataNascimento;

    public TitularPessoaFisica(String cpf, String genero, LocalDate dataNascimento, String nome, String tipoPessoa, Endereco endereco) {
        this.cpf = cpf;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
