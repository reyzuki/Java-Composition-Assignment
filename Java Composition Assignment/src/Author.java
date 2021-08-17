



 public class Author{

     private String name;

     private String email;

     private boolean gender; 



     public Author( String name, String email, boolean gender)

     {

        this.name = new String(name);

        this.email = new String(email);

        this.gender = gender;

     }



     public String getName() { return(name); }

     public String getEmail() { return(email); }

     public boolean getGender() { return(gender); }



     public Author(Author author)

     {

       this.name = new String(author.getName());

       this.email = new String(author.getEmail());

       this.gender = author.getGender();

     }



     public void setName( String name) { this.name = new String(name); }

     public void setEmail(String email) { this.email = new String(email); }

     public void setGenderMale() { this.gender = false; }

     public void setGenderFemale() { this.gender = true; }



     public String toString()

     {

         char chGender = (this.gender) ? 'F' : 'M';

         return(

             new String(

                     this.name + "(" + chGender + ") at " + this.email

                        )

                  );

     }

}




class Book

{



    private String title;

    private Author author;

    private double price;

    private int qty;



    Book( String title, Author author, double price, int qty)

    {

         this.title = new String(title);

         this.author = new Author(author);

         this.price = price;

         this.qty = qty;

    }



   public String getTitle() { return(title); }

   public Author getAuthor() { return new Author(this.author); }

   public double getPrice() { return(price); }

   public int getQty() { return(qty); }



   Book( Book book)

   {

       this.title = book.getTitle();

       this.author = new Author( book.getAuthor());

       this.price = book.getPrice();

       this.qty = book.getQty(); 

   }





   public void setPrice(double price) { this.price = price; }

   public void setQty( int qty) { this.qty = qty; }



   public String toString()

   {

       return(

        new String(

              "book title:" + this.title + " by Author " + this.author.toString() +

               "  price = " + this.price + " : qty = " + this.qty



              )

           );



   }

}



class LaviMain

{



  public void Go()

  {



     Author author = new Author("Daniel","dan@gmail.com",false);

     Book book = new Book("How to create nested objects in Java",author,42.35,10);



     System.out.println(book.toString());



 }



   public static void main(String[]  args)

  {

       LaviMain x = new LaviMain();

       x.Go();

  

  }

}