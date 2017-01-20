
package exemplomatriz;


public class ExemploMatriz {

    public static void main(String[] args) {
      
        Matriz notas=new Matriz();
        notas.cargarMatriz();
        
        
        notas.calcularMediaNota();
        notas.visualizar();
        notas.amosarLista();
        notas.calcularMediaModulo();
        notas.amosarModulo();
        
    }
}
