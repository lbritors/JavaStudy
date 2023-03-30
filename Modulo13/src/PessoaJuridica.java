public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String natureza;

    public PessoaJuridica(String cnpj, String natureza){
        this.cnpj = cnpj;
        this.natureza = natureza;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }
}
