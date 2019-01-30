package blogspot;

public class BlogSpot {
        String authorName;
        String title;
        String text;
        String publicationDate;

    public BlogSpot(String authorName, String title, String text, String publicationDate){

        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }

    public  void postBlog(){
        System.out.print(title + " titled" + " by " + authorName + " posted at " + publicationDate);
        System.out.println();
        System.out.println(text);
    }

}
