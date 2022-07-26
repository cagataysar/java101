public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if (isCheck()){
            while (this.f1.healthy > 0 && this.f2.healthy > 0){
                System.out.println("====YENİ ROUND====");
                this.f2.healthy = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.healthy = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.healthy);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.healthy);
            }
        }else {
            System.out.println("Sporcular aynı kiloda olmalı!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.healthy == 0){
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }
        if (this.f2.healthy == 0){
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        }
        return false;
    }
}
