
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
public class Foundation extends Construction{
     private int area;

    public Foundation(int area) {
        this.area = area;
        
        materialList = new ArrayList<Material>();
        calculateMaterial();
    }
    
    
    @Override
    public void calculateMaterial() {
        
        Concrete c = new Concrete(area*3);
        materialList.add(c);
        Rmesh r = new Rmesh((int) (c.getAmount()*0.5));
        materialList.add(r);
        Nails n = new Nails(50*r.getAmount());
        materialList.add(n);
    }

    @Override
    public int calculateMaterialCost() {
        int materialCost = 0;
        for(Material m:materialList){
            materialCost+=m.totalCost();
        }
        return materialCost;
    }
}
