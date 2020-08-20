import java.util.ArrayList;

public abstract class chef {
    
    String firstName;
    String lastName;

    ArrayList<Restaurant> suggestions =  new ArrayList<Object>;
}

public abstract class Restaurant{

    String name;
    String address;
    String phoneNumber;

}

public abstract class Rating(){

    int score;
    
    private int ratingSystem(int score){

        ArrayList<Integer> listOfRatings = new ArrayList<Integer>;
            listOfRatings.add(score);

        float avgRating = listOfRatings.stream().mapToInt(a->a).average();
    }

}