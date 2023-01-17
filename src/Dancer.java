public class Dancer extends Person{
    private String groupName;
    public Dancer(String name,String designation,String groupName){
        super(name, designation);
        this.groupName = groupName;
}

    @Override
    public void eat() {
        System.out.println("Dancer is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dancer is walking");
    }

    @Override
    public void learn() {
        System.out.println(" Dancer is learning");
}  public void Dancing(){
        System.out.println("Dancer is dancing ");
    }
}
