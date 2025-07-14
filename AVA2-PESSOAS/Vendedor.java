class Vendedor extends Pessoa{
    private String experiencia;
    private String social;
    private String proatividade;

    public Vendedor(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String experiencia, String social, String proatividade){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.experiencia = experiencia;
        this.social = social;
        this.proatividade = proatividade;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Experiência: " + experiencia);
        System.out.println("Socialização: " + social);
        System.out.println("Proatividade: " + proatividade);
    }
}
