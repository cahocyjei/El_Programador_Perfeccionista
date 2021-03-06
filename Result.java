package El_Programador_Perfeccionista;
import java.util.ArrayList;
import java.util.List;


public class Result{

    
    public static void main(String[] args) {
       
        int caso[][]= new int[5][4];

        for (int i = 0; i < 5; i++) {
            caso[i][0]= 5; // D
            caso[i][1]= 110; //T
            caso[i][2]= 25; // F
            caso[i][3]= 5; //R
            if (i== 4) {
                caso[i][0]= 5;
                caso[i][1]= 110;
                caso[i][2]= 30;
                caso[i][3]= 0;
            }
        }

        List<List<Integer>> casos= new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            casos.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                casos.get(i).add(caso[i][j]);
            }
        }
        
        for (Boolean list : Result.podraCumplir(casos)) {
            if (list) {
                System.out.println(list + ": Cumple la meta");
            }else{
                System.out.println(list + ": No cumple la meta");
            }
        }
        

    }

    public static List<Boolean> podraCumplir(List<List<Integer>> caso) {
        // Write your code 
        List<Integer> divide= new ArrayList<>(); // Cantidad de funciones que pide la empresa diarias
        List<Integer> resta= new ArrayList<>(); // Funciones que se escriben menos las borradas

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (j== 1) {
                    divide.add(caso.get(i).get(j)/caso.get(i).get(0));
                }if (j== 2) {
                    resta.add(caso.get(i).get(j)-caso.get(i).get(3));
                }
            }
        }
        List<Boolean> lisB= new ArrayList<>();
        for (int i = 0; i < 5; i++) {

         if (resta.get(i)== divide.get(i)) {
             lisB.add(true);
         }  if (resta.get(i) == 30) {
             lisB.add(true);
         }else if (resta.get(i) < divide.get(i)) {
             lisB.add(false);
         }
        }

        return lisB;
    }
}