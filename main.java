import java.util.ArrayList;

public class main{

    public abstract class chef {
        
        String firstName;
        String lastName;

        String getFirstName(){
            return firstName;
        }

        void setFirstName(String givenName){
            firstName = givenName;
        }

        void setLastName(String familyName){
            lastName = familyName;
        }

        String getLastName(){
            return lastName;
        }

        void addRestaurant(){

        }

        //return arraylist fo restaurants
        Restaurant returnRestaurants(){
            return suggestions;
        }

        ArrayList<Restaurant> suggestions =  new ArrayList<Object>;
    }


    public abstract class Restaurant{

        String name;
        String address;
        String phoneNumber;

        void setName(String restaurantName){
            name = restaurantName;
        }

        String returnName(){
            return name;
        }

        void setAddress(String restaurantAddress){
            address = restaurantAddress;
        }

        String returnAddress(){
            return address;
        }

        void setPhoneNumber(String phone_Number){
            phoneNumber = phone_Number;
        }
    }


    public interface Rating{

        int score;
        
        private int ratingSystem(int score){

            ArrayList<Integer> listOfRatings = new ArrayList<Integer>;
                listOfRatings.add(score);

            float avgRating = listOfRatings.stream().mapToInt(a->a).average();
        }


    public abstract class Menu{

            ArrayList<menuItem> menuList = new ArrayList<menuItem>;
        }

    public abstract class menuItem{

        float price;
        String dishName;
        String dishDesc;

            float getPrice() {
            return price;
            }   

            void setPrice(float cost){
            cost = price;
            }

            String getDishName() {
                return dishName;
            }

            String setDishName(String dishTitle) {
                dishName = dishTitle;
            }

            String setDishDesc(String dishDescription) {
                dishDesc = dishDescription;
            }

        }

    }
}