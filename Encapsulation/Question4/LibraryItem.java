package Encapsulation.Question_5;

   abstract class LibraryItem {
       private String itemId;
       private String title;
       private String author;
       private boolean isAvailable = true;
       private String borrowerName;

   public LibraryItem(String itemId, String title, String author){
       this.itemId=itemId;
       this.title=title;
       this.author=author;
   }
   public String getItemId(){
       return itemId;
   }
   public String getTitle(){
       return title;
   }
   public String getAuthor(){
       return author;
   }
   protected void setBorrower(String name) {
           this.borrowerName = name;
           this.isAvailable = false;
   }
   protected void returnItem() {
           this.borrowerName = null;
           this.isAvailable = true;
   }
   public boolean isAvailable() {
           return isAvailable;
   }
   public abstract int getLoanDuration();

   public void getItemDetails(){
       System.out.println("item id is : "+itemId);
       System.out.println("title is : "+title);
       System.out.println("author is : "+author);
       System.out.println("Avilable : "+isAvailable);
   }
}
