import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var chosenOption = -1;

        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1: Dar banho no pet");
            System.out.println("2: Abastecer com água;");
            System.out.println("3: Abastecer com shampoo");
            System.out.println("4: Verificar nivel de água");
            System.out.println("5: Verificar nivel de shampoo");
            System.out.println("6: Verificar se tem pet no banho");
            System.out.println("7: Colocar pet na maquina");
            System.out.println("8: Retirar pet da máquina");
            System.out.println("9: Limpar maquina");
            System.out.println("0: Sair do menu");
            chosenOption = scanner.nextInt();

            switch (chosenOption) {
                case 1 -> petMachine.showerPet();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfThereIsPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        } while (chosenOption != 0); {

        }


    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com: " + amount + " litros de shampoo.");
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com: " + amount + " litros de água.");
    }

    private static void checkIfThereIsPetInMachine() {
        var isTherePet = petMachine.isTherePet();
        System.out.println(isTherePet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name ==null || name.isEmpty()) {
            System.out.println("Informe o nome do pet: \n");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);

    }


}
