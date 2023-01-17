public class Programmer extends Person{
    private String companyName;
    public Programmer(String name,String designation,String companyName) {
        super (name,designation);
        this.companyName=companyName;
        }

    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }

    @Override
    public void walk() {
        System.out.println("Programmer is walking");
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learning");
    }
    public void Coding(){
        System.out.println("Programmer in codding");
}

}
