public class Conta {

    private Integer numero;
    private String agencia;
    private String nome_Cliente;

    private  Double saldo;



    public Conta(Integer numero, String agencia, String nome_Cliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_Cliente = nome_Cliente;
        this.saldo = saldo;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá "+nome_Cliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+
                " já está disponível para saque";
    }
}
