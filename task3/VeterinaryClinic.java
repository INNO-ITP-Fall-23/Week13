import java.util.*; 

class Owner {
    String name, surname;
    int age;
    
    Owner() {
        name = "";
        surname = "";
        age = 0;
    }
    
    Owner(String name_, String surname_, int age_) {
        name = name_;
        surname = surname_;
        age = age_;
    }
}

class Pet {
    int id;
    String nickname;
    Owner owner;
    
    Pet(int id_, String nickname_, Owner owner_) {
        id = id_;
        nickname = nickname_;
        owner = owner_;
    }
    
    public String toString(){
        return nickname;  
    } 
}

class Cat extends Pet {
    int purLoudness;
    
    Cat(int id_, String nickname_, Owner owner_, int purLoudness_) {
        super(id_, nickname_, owner_);
        purLoudness = purLoudness_;
    }
    
    String purr(){
        return String.format("Purring with loudness %d", purLoudness);
    }
    
    public String toString(){
        return "Cat " + nickname + " " + purr();  
    } 
}

class Snake extends Pet {
    int venomDanger;
    
    Snake(int id_, String nickname_, Owner owner_, int venomDanger_) {
        super(id_, nickname_, owner_);
        venomDanger = venomDanger_;
    }
    
    
    String bite(){
        return String.format("Biting with danger %d", venomDanger);
    }
    
    public String toString(){
        return "Snake " + nickname + " " + bite();  
    } 
}

class Rabbit extends Pet {
    int earLength;
    
    Rabbit(int id_, String nickname_, Owner owner_, int earLength_) {
        super(id_, nickname_, owner_);
        earLength = earLength_;
    }
    
    String ear(){
        return String.format("Ear length %d", earLength);
    }
    
    public String toString(){
        return "Rabbit " + nickname + " " + ear();  
    } 
}


public class VeterinaryClinic {
    
    static Map<Integer, Pet> map = new HashMap<>();
    static int curId = 1;
    
    static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }
    
    static void displayPets(){
        for(int i = 1; i < curId; i++){
            System.out.println(map.get(i));
        }
    }
    
    static void addPets(int numOfCats, int numOfSnakes, int numOfRabbits){
        Random rand = new Random();
        while(numOfCats != 0){
            map.put(curId++, new Cat(curId, generateRandomString(), new Owner(generateRandomString(), generateRandomString(), rand.nextInt(85)), rand.nextInt(11)));
            numOfCats--;
        }
        while(numOfSnakes != 0){
            map.put(curId++, new Snake(curId, generateRandomString(), new Owner(generateRandomString(), generateRandomString(), rand.nextInt(85)), rand.nextInt(11)));
            numOfSnakes--;
        }
        while(numOfRabbits != 0){
            map.put(curId++, new Rabbit(curId, generateRandomString(), new Owner(generateRandomString(), generateRandomString(), rand.nextInt(85)), rand.nextInt(11)));
            numOfRabbits--;
        }
    }
    
    public static void main(String[] args) {
        
        addPets(2, 2, 2);
        addPets(2, 2, 2);
        displayPets();
        
    }
}