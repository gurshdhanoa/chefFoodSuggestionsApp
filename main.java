import java.util.ArrayList;

public class main{

    abstract class chef {
        
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

        ArrayList<Restaurant> suggestions =  new ArrayList<Object>;
    }


    abstract class Restaurant{

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


    abstract class Rating{

        int score;
        
        private int ratingSystem(int score){

            ArrayList<Integer> listOfRatings = new ArrayList<Integer>;
                listOfRatings.add(score);

            float avgRating = listOfRatings.stream().mapToInt(a->a).average();
        }


    abstract class Menu{

            ArrayList<menuItem> menuList = new ArrayList<menuItem>;
        }

    abstract class menuItem{

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