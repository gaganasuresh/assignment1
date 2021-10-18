class vehicles{
    void var()
    {
        System.out.println(" types of vehicles based on color");
    }
}
class car extends vehicles
{
    void vehicol()
    {
        System.out.println(" I have a white car");
    }
}
class assignment1{
    public static void main(String args[]){
        car c=new car();
        c.var();
        c.vehicol();
    }
}
