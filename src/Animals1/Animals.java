package Animals1;

public enum Animals {

    CAT(12), DOG(4), SHARK(22);
   private int age;

     Animals (int age){
        this.age=age;
    }

    public int getAge() {
        return age;
     }
     public String toString(){
         return age + " возраст животного ";


     }
}
