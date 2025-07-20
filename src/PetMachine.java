public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void showerPet() {
        if (pet == null) {
            System.out.println("Coloque o pet na máquina para dar o banho.");
            return;
        } else {
            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.println("Pet: " + pet.getName() + ", Clean: " + pet.isClean());
        }
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean isTherePet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Para colocar pet, é necessário limpá-la.");
            return;
        }
        if (isTherePet()) {
            System.out.println("ERRO: A máquina já está ocupada pelo pet " + this.pet.getName() + ".");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (!this.pet.isClean()) {
            this.clean = this.pet.isClean();
        }
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina.");
        this.pet = null;
    }

    public void washMachine() {
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }

}
