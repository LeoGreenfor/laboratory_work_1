package main;

public class SecondPerson {
    static FirstPerson mAnotherOpinion;

    public static void main(String[] args) {
        mAnotherOpinion = new FirstPerson();
        System.out.println("Яку піцу замовляємо?");
        mAnotherOpinion.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Гавайську!");
        }
        if (mAnotherOpinion.isAlive()) {
            try {
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
            }
            System.out.println("Я хочу гавайську!");
        } else {
            System.out.println("Я хочу пепероні!");
        }
        System.out.println("Ясно, беремо чотири сири");
    }
}
