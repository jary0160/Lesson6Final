
package PatronBook;

import java.util.Scanner;


public class Patron {
Book book1, book2, book3;    
String  name;    
    Patron(String n) {
        book1=null;
        book2=null;
        book3=null;
        name = n;
    }
   
    
       public String getName(){
           
           
           return name;
}
       public boolean hasBook(Book b){
           if (book1==b){
               return true;
           }
       
       else if (book2==b){
               return true;
           }

       else if (book3==b){
               return true;
           }
           return false;
       }
           

       public boolean Borrow(Book b){
           if (book1==null){
               book1 = b;
               return true;
           }
       
       else if (book2==null){
               book2 = b;
               return true;
           }

       else if (book3==null){
               book3 = b;
               return true;
           }
return false;
       }
       
       public boolean returnBook(Book b){
           if(book1 == b){
               book1=null;
               return true;
           }
           
          else if(book2 == b){
               book2=null;
               return true;
           }
           
          else if(book3 == b){
               book3=null;
               return true;
           }
           return false;
       }
}
  
   
       

