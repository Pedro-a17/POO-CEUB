class Cliente extends Pessoa {
    private String renda;
    private String interesses;
    private String valores;

    public Cliente(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String renda, String interesses, String valores){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.renda = renda;
        this.interesses = interesses;
        this.valores = valores;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Renda: " + renda);
        System.out.println("Interesses: " + interesses);
        System.out.println("valores: " + valores);
    }
}