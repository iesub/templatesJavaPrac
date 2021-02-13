package mirea.practice.prac6.Builder;

public class SomeClass {
    private final int reqField;
    private final int optField;

    public static class Builder{
        private final int reqFieldOne;

        private int optField = 0;

        public Builder(int reqFieldOne){
            this.reqFieldOne = reqFieldOne;
        }

        public Builder optFieldOne(int val){
            optField = val;
            return this;
        }

        public SomeClass build(){
            return new SomeClass(this);
        }
    }

    private SomeClass(Builder builder){
        reqField = builder.reqFieldOne;
        optField = builder.optField;
    }

    public int getOptField() {
        return optField;
    }

    public int getReqField() {
        return reqField;
    }
}
