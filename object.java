abstract class Objects{
    abstract void showshape();
    public void shape(){
        System.out.println("I am form abstract class");
    }
}
class Sphere extends Objects{
    void showshape(){
        System.out.println("Object is a Sphere");
    }
}
class Cuboid extends Objects{
    void showshape(){
        System.out.println("Object is a Cuboid");
    }
}
class Prism extends Objects{
    void showshape(){
        System.out.println("Object is a Prism");
    }
}
class object{
    public static void main(String[] args){
        Objects obj= new Sphere();
        obj.showshape();
        obj= new Cuboid();
        obj.showshape();
        obj= new Prism();
        obj.showshape();
        obj.shape(); 
    }
}