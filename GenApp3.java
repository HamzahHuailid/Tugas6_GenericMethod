/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */
public class GenApp3<T> {
  private T type;
  
  public T getType(){
      return type;
  }
  
  public void settype(T type){
      this.type = type;
  }
  
  private static <N> void Mobil (N sedan) {
      System.out.println(sedan);
  }
  
  private static <M> void minibus(){
      System.out.println();
  }
  
  public static void main (String[] args){
      Mobil("HONDA");
      minibus();
  }
}

