/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */
class GenApp2 <T> {
    private T type;
    
    public T getType() {
        return type;
        
    }
    
    public void setType (T type) {
        this.type = type;
    }
    private static <X> void whatYouDo (){
        System.out.println();
    }
    
    private static <N,T> void anythingYouWanted(N freeParType, T freePartType1) {
        System.out.println(freeParType);
        System.out.println(freePartType1);
    }
    public static void main (String[]Args) {
        anythingYouWanted(10,"Hamjah Huailid");
        
        
        
    }
    
}