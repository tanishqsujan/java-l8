class HillStation{
    void location(){
        System.out.println("Location is ");
    }
    void famous(){
        System.out.println("Famous for ");
    }
}
class Manali extends HillStation{
    void location(){
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    void famous(){
        System.out.println("It is famous for Hadimba Temple and Adventure Sports.");
    }
}
class Mussoorie extends HillStation{
    void location(){
        System.out.println("Mussoorie is located in Himachal Pradesh");
    }
    void famous(){
        System.out.println("It is famous for educational institutions");
    }
}
class Gulmarg extends HillStation{
    void location(){
        System.out.println("Gulmarg is located in J&K");
    }
    void famous(){
        System.out.println("It in famous for Skiing");
    }
}
class hill{
    public static void main(String[] args){
        HillStation H= new HillStation();
        Manali M= new Manali();
        HillStation Mu= new Mussoorie();
        HillStation G= new Gulmarg();

        H.location();
        H.famous();
        M.location();
        M.famous();
        Mu.location();
        Mu.famous();
        G.location();
        G.famous();
    }
}