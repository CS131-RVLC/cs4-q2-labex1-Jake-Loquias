package arraylistsq2labex1;
import java.util.*;


class Student {
    String Name;
    int Score;
    int Highest=0;
    int counter=0;
    int o;
    int temp;
    
    public void displayArray(ArrayList<Student> AS) {
        for (int i=0;i<AS.size();i++){
        System.out.println(AS.get(i).Name);
        System.out.println(AS.get(i).Score);
        }
        
    }
    
     public void searchHighestScore(ArrayList<Student> AS) {
         for (int i=0; i<AS.size();i++){
         if(AS.get(i).Score>Highest)
            Highest=AS.get(i).Score;
         }

        System.out.println("The highest score is "+Highest);

    }    
    public void sortScores(ArrayList<Student> AS) {
//        	<your code to sort the array>
            for (int i=0; i<AS.size();i++){
                for (int x=0; i<AS.size()-o;x++){
                     if(AS.get(i).Score>Highest)
                        AS.NameI[x];
                        Highest=AS.get(i).Score;
                        
                     }
                o++;
            }

                System.out.println("The highest score is "+Highest);
            }
    
    public void sortNames (ArrayList<Student> AS) {
//<your code to sort the array according the names>      
   }
}

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] NameI = {"Bok", "Mik", "Jak", "Luds", "Kim"};
        int[] ScoreI = {90, 96, 91, 97, 99};
        
        ArrayList<Student> StudentArrayList = new ArrayList<Student>();
        for (int i = 0; i <= 4; i++) {
            StudentArrayList.add(new Student());
            StudentArrayList.get(i).Name = NameI[i];
            StudentArrayList.get(i).Score = ScoreI[i];
        }
        
       
        Student method = new Student();

        method.displayArray(StudentArrayList);

        method.searchHighestScore(StudentArrayList);

        method.sortScores(StudentArrayList);
        
        //method.displayArray(StudentArrayList);

        method.sortNames(StudentArrayList);
        
        //method.displayArray(StudentArrayList);        
        
   
    }
}

