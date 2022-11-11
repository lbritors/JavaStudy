public class Main {
    public static void main(String[] args) {

    Dog dog = new Dog();
    dog.setCod(1);
    dog.setName("Mia");
    dog.setBreed("Yorkshire");
    dog.setAge(7);
    dog.setWeight(3.2);

    Tutor tutor = new Tutor();
    tutor.setCod(10);
    tutor.setName("Letícia");
    tutor.setAddress("Avenida Central");
    tutor.setPhoneNumber("90000022298");

    String dogName = dog.getName();
    int dogCod = dog.getCod();
    String dogBreed = dog.getBreed();
    int dogAge = dog.getAge();
    double dogWeight = dog.getWeight();

    int tutorCod = tutor.getCod();
    String tutorName = tutor.getName();
    String tutorAddress = tutor.getAddress();
    String tutorPhone = tutor.getPhoneNumber();

    System.out.println("Código cachorro:" + dogCod);
    System.out.println("Nome do cachorro: " + dogName);
    System.out.println("Raça: " + dogBreed);
    System.out.println("Idade: " + dogAge );

    System.out.println("\n\nCódigo do tutor:" + tutorCod);
    System.out.println("Nome do tutor: " + tutorName);
    System.out.println("Endereço: " + tutorAddress);
    System.out.println("Telefone: " + tutorPhone);

    }
}
