import com.github.javafaker.Faker;

import java.util.Random;


class Organization {
    private Worker ceo;
    private final int maxSub= 5;
    private final int nimSub=2;
   Random random= new Random();



    public Organization() {
        this.ceo = new Worker(new Faker().name().fullName());
        generateSubordinates(ceo, 1, 6);
    }

//    private void generateSubordinates(Worker worker, int currentDepth, int maxDepth) {
//        this.ceo= new Worker(new Faker().name().fullName());
//        generateSubordinates(ceo,1, 6);
//    }

    private void generateSubordinates(Worker worker, int currentDepth, int maxDepth){
        if (currentDepth< maxDepth){
            int count= new Random().nextInt(2,5);
            for (int i = 0; i < count; i++) {
               // Worker newWorker= new Worker(this.faker.name().fullName());
               // worker.addSubordinate(newWorker);
                this.ceo.addSubordinate(new Worker(new Faker().name().fullName()));

            }
        }

    }



}