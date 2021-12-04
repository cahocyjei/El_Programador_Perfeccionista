package El_Programador_Perfeccionista;
import java.util.ArrayList;
import java.util.List;


public class Result{

    
    public static void main(String[] args) {
       
        int caso[][]= new int[4][4];

        for (int i = 0; i < caso.length; i++) {
            caso[i][0]= 5; // D
            caso[i][1]= 110; //T
            caso[i][2]= 25; // F
            caso[i][3]= 5; //R
        }
            
        List<Integer> dia1= new ArrayList<>();
        for (int i = 0; i < caso.length; i++) {
            dia1.add(caso[0][i]);
        }

        List<Integer> dia2= new ArrayList<>();
        for (int i = 0; i < caso.length; i++) {
            dia2.add(caso[1][i]);
        }

        List<Integer> dia3= new ArrayList<>();
        for (int i = 0; i < caso.length; i++) {
            dia3.add(caso[2][i]);
        }

        List<Integer> dia4= new ArrayList<>();
        for (int i = 0; i < caso.length; i++) {
            dia4.add(caso[3][i]);
        }

        List<List<Integer>> casos= new ArrayList<>();
            casos.add(dia1);
            casos.add(dia2);
            casos.add(dia3);
            casos.add(dia4);      


        System.out.println(Result.podraCumplir(casos));


    }

    public static List<Boolean> podraCumplir(List<List<Integer>> caso) {
        // Write your code 
        List<Integer> divide= new ArrayList<>(); // Cantidad de funciones que pide la empresa diarias
        List<Integer> resta= new ArrayList<>(); // Funciones que se escriben menos las borradas

        for (int i = 0; i < caso.size(); i++) {
            for (int j = 0; j < caso.size(); j++) {
                if (j== 1) {
                    divide.add(caso.get(i).get(j)/caso.get(i).get(0));
                }if (j== 2) {
                    resta.add(caso.get(i).get(j)-caso.get(i).get(3));
                }
            }
        }
        List<Boolean> lisB= new ArrayList<>();
        for (int i = 0; i < divide.size(); i++) {

         if (resta.get(i)== divide.get(i)) {
             lisB.add(true);
         }  else if (resta.get(i) != divide.get(i)) {
             lisB.add(false);
         }
        }

        return lisB;
    }
}