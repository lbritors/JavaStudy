public class Main {
    public static void main(String[] args) {

        PessoaFisica jorge = new PessoaFisica("123", "000");
        jorge.setNome("jorge");
        jorge.setEndereco("Rua 2");
        jorge.setContato("(00)8879");

        PessoaJuridica roupaECia = new PessoaJuridica("00012", "Sociedade Anônima");
        roupaECia.setNome("Roupa&Cia");
        roupaECia.setEndereco("Rua 10");
        roupaECia.setContato("www.roupas.com");

        System.out.println(("O " + jorge.getNome() + " foi à " + roupaECia.getNome() + " que fica na "
        + roupaECia.getEndereco()));
    }
}