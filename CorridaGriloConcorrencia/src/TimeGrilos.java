import java.util.ArrayList;

public class TimeGrilos {
    //private int numeroTimes;
    public int nome;
    //Grilo[] grilo;
    ArrayList<Grilo> grilo = new ArrayList<>();
    int numGrilos = 0;
    int linhaChegada = 0;
    public int pulosTime = 0;
    public int totalP = 0;
    
    //instanciando threads e definindo a quantidade
    ArrayList<ThreadGrilo> threads = new ArrayList<>();
    
    public TimeGrilos(int nome, int numGrilos, int linhaChegada){
        
        this.nome = nome;
        this.numGrilos = numGrilos;
        this.linhaChegada = linhaChegada;
        //this.threads = new ThreadGrilo[numGrilos];
        
        
        
        
    }
    
    public void adicionarGrilo(Grilo g){
        this.grilo.add(g);
        this.adicionarThread(g);
        System.out.println("Grilo " + g.getNome() + " adicionado no time " + this.nome);
    }
    
    public void adicionarThread(Grilo g){
        
        //iniciando as threads
        //new ThreadGrilo(g,100);
        this.threads.add(new ThreadGrilo(g, this.linhaChegada));
//        for(int i = 0; i < numGrilos; i++){
//            threads[i] = new ThreadGrilo(grilo.get(i), linhaChegada);
//            threads[i].start();
//            
//            //System.out.println("Thread " + i + " iniciada");
//        }
        //System.out.println("Numero de times " + this.numeroTimes);
       //for(int i = 0; i <= 3; i++){
           //this.grilo[i] = grilos[i];
       //}
    }
    
    public static int calcularTimes(int numeroGrilos){
        
        int numeroTimes = 0;
        
        //criar numero de times
        if(numeroGrilos % 3 == 0){
            numeroTimes = numeroGrilos / 3;
        }else if(numeroGrilos % 3 != 0){
            //numero de times recebe a divisao do numero de grilos por 3 sem casas decimais
            // e adiciona mais um time
             numeroTimes = ((int)Math.floor(numeroGrilos / 3)) + 1;
        }
        
         return numeroTimes;
    }
    
}

