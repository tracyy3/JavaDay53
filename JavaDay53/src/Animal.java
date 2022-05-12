public class Animal {

    private String inputName;
    private boolean dog;

    public Animal (String inputName, boolean dog) {
        this.inputName = inputName;
        this.dog = dog;
    }

    public String getName() {
        return inputName;
    }

    public boolean ifDog() {
        return dog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + ifDog();
    }
}