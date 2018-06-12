package aps.vetoresdinamicos;
public class VetorDina {
 
 int count=0;
 int[] vetor = new int[1]; 
   
   public void insere( int i,int val)
   {          
       if(i<=count && i>=0){
       garantirEspaco();//aumenta o espaço
       moverDados(i,+1);
       vetor[i] = val;        
       count++;
       
       }
       else{
       throw new ArrayIndexOutOfBoundsException(i);
       }
   }
   public int getCount(){
       return count;
   }
   public int get(int i)
   {    
       if(i<=this.count || i>=0){
           return vetor[i];
       }else{
       return 0;    
       }
   }
   public void set(int i, int valor) 
   {
	   if(i<=this.count || i>=0){
           vetor[i] = valor;
       }     
	   
   }
   public void insereInicio(int val)
   {    
      insere(0,val);
   }
   public void insereFinal(int val)
   {
       insere(count,val);
   }
   public void removeFinal()
   {
       insere(count,val);
        
   }
   public void removeInicio()
   {    
       int i;
       for(i=0;i<10;i++){
         this.vetor[i-1] = vetor[i];
       }
       count--;        
   }
   public void remove(int i)
   {    
       if(i<=count && i>=0){
       //move os elementos para tras
       moverDados(i+1,-1);
       count--;
       }else{
         System.out.println("Erro: 'Ivalid index: '" + i);  
        }
   }
   public void moverDados(int i, int offset) {
	   	System.arraycopy(vetor, i, vetor, i+offset, count);
	   	}
   public void garantirEspaco() {
	   if(count<vetor.length) {
		   return;
	   }else {
		   aumentaTamanho();
	   }
   }
   public void aumentaTamanho(){
	 //alocar espaço
	 int[]novo = new int[vetor.length +100];  
	 //copiar dados
	 System.arraycopy(vetor, 0, novo,0,0);
	 //transformar os dados no espaço
	 vetor = novo;
   }
             
}
