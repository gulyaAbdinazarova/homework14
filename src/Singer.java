public class Singer extends Person{
    private String SingerName;

      public Singer(String name,String designation,String singerName){
        super(name, designation);
        this.SingerName=singerName;
    }

    @Override
    public void eat() {
        System.out.println("Singer is eating");
    }

    @Override
    public void walk() {
        System.out.println("Singer is walking");
    }
    @Override
    public void learn() {
        System.out.println("singer is learning");

    } public void Singing(){
        System.out.println("Play in Gitar");
    }
}
