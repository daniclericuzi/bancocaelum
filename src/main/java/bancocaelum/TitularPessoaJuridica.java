package bancocaelum;

import java.time.LocalDate;
import java.util.List;

public class TitularPessoaJuridica extends Titular {
    private String cnpj;
    private LocalDate dataAbertura;
    private List<String> socios;

    public TitularPessoaJuridica(String cnpj, LocalDate dataAbertura, List<String> socios, String nome, String tipoPessoa, Endereco endereco) {
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
        this.socios = socios;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public List<String> getSocios() {
        return socios;
    }

    public void setSocios(List<String> socios) {
        this.socios = socios;
    }
}
