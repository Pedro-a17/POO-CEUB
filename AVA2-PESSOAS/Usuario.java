import java.time.LocalTime;

class Usuario extends Pessoa{
    private String dispositivo;
    private String frequencia;
    private String indicacao;
    
    public Usuario(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String dispositivo, String frequencia, String indicacao){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.dispositivo = dispositivo;
        this.frequencia = frequencia;
        this.indicacao = indicacao;
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Dispositivo usado: " + dispositivo);
        System.out.println("Acessa com tal frequência: " + frequencia);
        System.out.println("Foi indicado por: " + indicacao);
    }

    public static void horaAcesso(){
        LocalTime agora = LocalTime.now();
        System.out.println("Acesso às: " + agora);
    }
}
