/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeaudit;
import static degreeaudit.DegreeAudit.FinalOut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cmarzari
 */
public class Buad {
    public static int Buad(List BuadClasses, HashMap BuadList){
        int BuadCredits = 0;
        List<String> takenBuad = new ArrayList<String>();
        List<String> notTakenBuad = new ArrayList<String>();
        
        Arrays.toString(BuadClasses.toArray());
        List<String> BuadCourseName = new ArrayList<String>(BuadList.keySet());
        List<Integer> BuadCourseCredit = new ArrayList<Integer>(BuadList.values());
        
        String[] courseName = new String[BuadCourseName.size()];
        courseName = BuadCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[BuadCourseCredit.size()];
        credit = BuadCourseCredit.toArray(credit);
        
        for (int j=0; j<courseName.length;j++){
            
            if(BuadClasses.contains(courseName[j])){     
                takenBuad.add(courseName[j]);
                BuadCredits = BuadCredits + credit[j];
            } 
            else{
                
                notTakenBuad.add(courseName[j]);
            }
        
        }
        
        if(takenBuad.size()>=2){
            System.out.println("You have fulfilled the Proffesional Development electives with the following classes: ");
            System.out.println(Arrays.toString(takenBuad.toArray()));
        }
        else if(takenBuad.size()==1) {
             System.out.println("You must take one of the following Proffesional Development electives: ");
             System.out.println(Arrays.toString(notTakenBuad.toArray()));
        }
        else if(takenBuad.size()==0){
            System.out.println("You must take two of the following Proffesional Development electives: ");
             System.out.println(Arrays.toString(notTakenBuad.toArray()));
        }
        
        
        
        
        return BuadCredits;
    }
    
}
