public class Morador {
    private static int proximoCodigo = 1;

    private int codigoSequencial;
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;

    public Morador() {
        this.codigoSequencial = proximoCodigo++;
    }

    public static int getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(int proximoCodigo) {
        Morador.proximoCodigo = proximoCodigo;
    }

    public int getCodigoSequencial() {
        return codigoSequencial;
    }

    public void setCodigoSequencial(int codigoSequencial) {
        this.codigoSequencial = codigoSequencial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String toString() {
        return "== Morador ==\n" +codigoSequencial+"==\n"+
                ",\n nome='" + nome + '\'' +
                ",\n cpf='" + cpf + '\'' +
                ",\n celular='" + celular + '\'' +
                ",\n dataNascimento='" + dataNascimento + '\'' +
                ",\n sexo='" + sexo + '\'' +
                ",\n bloco='" + bloco + '\'' +
                ",\n apartamento='" + apartamento + '\'' +
                ",\n codigoAcesso='" + codigoAcesso + '\'';
    }
}