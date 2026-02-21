package dataStructuresAlgorithms.arvores;

public class Arvore {
    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;
    // para criar uma todos tem que estar vazio
    public Arvore(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }
    public Arvore(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty(){
        return this.folha == null;
    }
    public void inserir(Folha novo){
        if (isEmpty()) {
            this.folha = novo;
        }else {
            Arvore novaArvore = new Arvore(novo);
            if(novo.getValor() < this.folha.getValor()){
                if(this.esquerda == null){ // nao tenho um valor na esquerda entao ->
                    this.esquerda = novaArvore; // aqui eu atribuo o valor q era null a um novo criando o nó
                    System.out.println("Folha: " + novo.getValor()+" a esquerda de: "+ this.folha.getValor() );
                }
                else{
                    this.esquerda.inserir(novo); // recursividade
                }
            }
            else if(novo.getValor()> this.folha.getValor()){
                if(this.direita == null){
                    this.direita = novaArvore;
                    System.out.println("Folha: " + novo.getValor()+" a direita de: "+ this.folha.getValor() );
                }else {
                    this.direita.inserir(novo);// recursividade
                }

            }
        }
    }

}
