import java.util.ArrayList;

public class main{

    public abstract class chef {
        
        String firstName;
        String lastName;
        ArrayList<Restaurant> suggestions =  new ArrayList<Restaurant>;

        String getChefName(){
            return firstName;
        }

        void setChefName(String givenName, String familyName){
            firstName = givenName;
            lastName = familyName;
        }

        void addRestaurant(Restaurant resto){
            suggestions.add(resto);
        }

        Restaurant returnRestaurants(){
            return suggestions;
        }
    }


    public abstract class Restaurant{

        String name;
        String address;
        String phoneNumber;
        ArrayList<menuItem> menu =  new ArrayList<menuItem>;

        void setName(String restaurantName){
            name = restaurantName;
        }

        String getName(){
            return name;
        }

        void setAddress(String restaurantAddress){
            address = restaurantAddress;
        }

        String getAddress(){
            return address;
        }

        void setPhoneNumber(String phone_Number){
            phoneNumber = phone_Number;
        }

        String getPhoneNumber(){
            return phoneNumber
        }

        void addMenuItem(menuItem item){
            menu.add(item);
        }

        void printRestoAndMenu(){
            system.out.println("Name: " + name + "/n" 
           +  "Address: " + address + "/n"
           +  "phoneNumber: " + phoneNumber + "/n");
           for(String i : menu){
               println(i);
           }
        }

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


    public interface Rating{

        int score;
        
        private int ratingSystem(int score){

            ArrayList<Integer> listOfRatings = new ArrayList<Integer>;
                listOfRatings.add(score);

            float avgRating = listOfRatings.stream().mapToInt(a->a).average();
        }
    }
}