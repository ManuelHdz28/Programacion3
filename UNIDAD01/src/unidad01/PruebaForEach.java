package unidad01;


public class PruebaForEach {
    
    public static  void main(String arg[]){
    
        int numeros [] = {1,2,3,4,5,6,7,8,9,0};
        String materias[] = {"PRN-115", "PRN-215", "PRN-315", "IAI-115", "MSN-115",};
    
        for (int e : numeros) {
            System.out.println("numero [" + e + "]");
        }
        for (String e : materias) {
            System.out.println("materias [" + e + "]");
        }
    }
    
}
