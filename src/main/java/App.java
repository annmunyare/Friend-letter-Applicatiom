import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    //explicitly instructibg Spark to look in the public directory to locate all static files like images
    staticFileLocation("/public");

    //get("/hello", (request, response) ->// used to get the hello page
    //creating a root route to represent the homepage by changing the get arguments
    get("/", (request, response)->

    //integrating HTML into Spark
       "<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
          "<title>Hello Friend!</title>" +
          "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
        "</head>" +
       "<body>" +
          "<h1>Hello From Afar</h1>" +
          "<p>Dear Friend,</p>" +
          "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
          "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
          "<p>But I like programming a lot, so I've got that going for me. </p>" +
          "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
          "<p>Cheers,</p>" +
          "<p>Travel Enthusiast Jane</p>" +

          //creating a link to my favorite photos page
          "<p><a href='/favorite_photos' >P.S. Check out my favorite travel photos here.</a></p>" +
        "</body>" +
      "</html>"
   );
//create a new page in our app by adding a new "entry" with another instance of Spark's get() method
   get("/favorite_photos", (request, response) ->
    "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>Hello Friend!</title>" +
        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
       "<h1>Favorite Traveling Photos</h1>" +
          "<ul>" +
            "<li><img src='/images/foggymountain.jpeg' alt='A photo of a mountain.'/></li>" +
            "<li><img src='/images/rockycoast.jpeg' alt='A photo of a a rocky beach.'/></li>" +
          "</ul>" +
      "</body>" +
      "</html>"
    );

  }
}
