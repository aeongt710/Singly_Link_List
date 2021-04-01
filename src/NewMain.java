/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aeon
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        S_Link_List l=new S_Link_List();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);
        l.add(55);
        
        System.out.println(l.print());
//        System.out.println("==========="+l.size());
//        System.out.println(l.printReverse());
        System.out.println(l.get(2));
        
//        System.exit(0);
//        l.print();
    }
    
}
