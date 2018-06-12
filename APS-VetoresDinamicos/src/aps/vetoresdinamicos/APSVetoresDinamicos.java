package aps.vetoresdinamicos;

public class APSVetoresDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VetorDina vet;
       vet = new VetorDina();
       vet.insereInicio(3);
       vet.insereFinal(7);
       vet.insere(2, 2);
       vet.insere(3, 5);
       vet.insereInicio(24);
       vet.insereFinal(8);
       vet.removeFinal();
       vet.removeInicio();
       vet.remove(1);
       vet.set(3,77);
       //recebe o numero de registros no vetor.
       vet.getCount();
       //exibe o vetor indicado.
       System.out.println(vet.get(2));




     
       /* vet.insereInicio(2);
        vet.insere(1,4);
       vet.insere(2, 3);
       //vet.insereFinal(2);
       System.out.println(vet.get(0));
       System.out.println(vet.get(1));
       System.out.println(vet.get(2));
       */
    
    }
    
}
