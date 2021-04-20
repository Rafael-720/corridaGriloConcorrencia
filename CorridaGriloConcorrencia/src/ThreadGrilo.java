
/**
 *
 * @author FAEL
 */
public class ThreadGrilo extends Thread{
    private Grilo grilo;
    private int linhaChegada;
    private int totalPercorrido = 0;
    private int pulos = 0;
    private static int colocacao = 0;
    

    public ThreadGrilo(Grilo g, int linhaChegada) {
        this.setGrilo(g);
        this.setLinhaChegada(linhaChegada);
        //this.linhaChegada = linhaChegada;
        
    }
    
    
    @Override
    public void run(){
        
        //System.out.println("Thread " + this.getName() + " iniciada com " + this.grilo.getNome());
        
        if(totalPercorrido < linhaChegada){
            
            
            this.grilo.pular();
            
            this.grilo.setPulos(pulos++);
            this.grilo.setTotalPercorrido(totalPercorrido += this.grilo.getDistanciaRandomica());
            this.grilo.pulosTime(pulos);
            
            
            if(this.totalPercorrido >= this.linhaChegada){                
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e cruzou a linha de chegada percorrendo " + this.totalPercorrido + "cm");
                //System.out.println("time do grilo" + this.grilo.getTimeGrilo() + this.grilo.getNome());
            }else{
                System.out.println("O " + this.grilo.getNome() + " pulou " + this.grilo.getDistanciaRandomica() +
                    "cm e já percorreu " + this.totalPercorrido + "cm");
                //System.out.println("time " + this.grilo.getTimeGrilo() + this.grilo.getNome());
            }
                    
            this.run();
        }else{
            colocacao++;
            System.out.println("-------------------------------------------------------------------------- \n" + 
                    this.grilo.getNome() + " foi o " + colocacao + "° e alcançou a linha de chegada com " + pulos + " pulos\n" +
                    "--------------------------------------------------------------------------");
                    System.out.println("Pulos do time " + this.grilo.meuTime.nome + ": " + this.grilo.meuTime.pulosTime + " pulos");
                    this.grilo.totalP(this.totalPercorrido);
                    System.out.println("Total percorrido pelo time " + this.grilo.meuTime.nome + ": " + this.grilo.meuTime.totalP);
            }
        
        //System.out.println("Pulos do time " + Time.pulosTime);
        
        
        
        
    }

   public void pulosTime(){
       int numero = this.grilo.getTimeGrilo();
       
   }

    
    public Grilo getGrilo() {
        return grilo;
    }

    public void setGrilo(Grilo grilo) {
        this.grilo = grilo;
    }

    public int getLinhaChegada() {
        return linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }

    
    
    
}
