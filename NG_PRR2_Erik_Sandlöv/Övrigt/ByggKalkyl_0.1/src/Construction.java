
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIK
 */
public abstract class Construction {
    ArrayList<Material> materialList; //Lista med material
    
    
    public abstract void calculateMaterial(); //metod för att räkna ut materialet
     public abstract int calculateMaterialCost(); //metod för att räkna ut materialet
    //metod för att lägga till enstaka material
    public void addMaterial(Material m){
        materialList.add(m);
    }

    @Override
    public String toString() {
        String s="";
        for(Material m:materialList){
            s+=m.toString()+"\n";
        }
        s+="Total kostnad: "+calculateMaterialCost()+"kr";
        return s;
    }
    
}
