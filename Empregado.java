class Empregado extends Pessoa {
    private String cargo;
    private String habilidades;
    private String pontualidade;

    public Empregado(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String cargo, String habilidades, String pontualidade){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.cargo = cargo;
        this.habilidades = habilidades;
        this.pontualidade = pontualidade;
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Pontualidade: " + pontualidade);
    }
}
