class Nano {
    public static void main(String[] args) {
        long timeout= System.currentTimeMillis();
        long timeNano = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        timeout = System.currentTimeMillis() - timeout;
        timeNano =  System.nanoTime() - timeNano;
        //System.out.println("Затраченное время: " + timeout + " ms");
        System.out.println("Затраченное время: " + timeNano + " ns");
    }
}
