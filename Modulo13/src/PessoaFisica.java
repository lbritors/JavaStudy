public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    public String getCpf() {
        return cpf;
    }
    public PessoaFisica(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
