public class caminhamentoEmOrdem {
    public static void main(String[] args) throws Exception {
        public void caminhamentoEmOrdem(No no){
            if(no != null){
            System.out.println(no.valor + " ");
            caminhamentoEmOrdem.(no.esquerda);
            caminhamentoEmOrdem.(no.direita);
            }
        }
    
    }
}
