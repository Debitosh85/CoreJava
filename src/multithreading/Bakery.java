package multithreading;



public class Bakery {
    private int goodsAvailable = 0;
    private final int MAX_GOODS_PER_DAY = 100;
    private int goodsProducedToday = 0;

    public synchronized void bakeGoods() {
        while (goodsAvailable > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (goodsProducedToday < MAX_GOODS_PER_DAY) {
            goodsAvailable += 10;
            goodsProducedToday += 10;
            System.out.println("Baked 10 goods. Total goods produced today: " + goodsProducedToday);
            notifyAll();
        }
    }

    public synchronized void buyGoods(String customerName) {
        while (goodsAvailable == 0 && goodsProducedToday < MAX_GOODS_PER_DAY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (goodsAvailable > 0) {
            goodsAvailable--;
            System.out.println(customerName + " bought 1 good. Goods available: " + goodsAvailable);
            if (goodsAvailable == 0) {
                notifyAll();
            }
        }
    }

    public synchronized boolean isProductionFinished() {
        return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable == 0;
    }
}



