class Fornecedor extends pessoa{
    private String qualidade;
    private float preco;
    private String agilidade;
    private float precoDesejado;

    public Fornecedor(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String qualidade, String preco, String agilidade, float precoDesejado){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.qualidade = qualidade;
        this.preco = preco;
        this.agilidade = agilidade;
        this.precoDesejado = precoDesejado;
    }

    public float getPreco(){
        return preco;
    }

    public float getPrecoDesejado(){
        return precoDesejado;
    }

    public boolean compararPreco(Fornecedor fornecedor){
        if (fornecedor.getPreco() > fornecedor.getPrecoDesejado()){
            System.out.println("desejamos pagar menos do que isso")
        } else{
            System.out.println("ok")
        }
        
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Qualidade: " + qualidade);
        System.out.println("Preço: " + preco);
        System.out.println("Agilidade: " + agilidade);
    }
}

