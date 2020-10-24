class Operations{

    private double num_1;
    private double num_2;
    private double result;

    public void setNum1(double num){
        this.num_1 = num;
    }

    public void setNum2(double num){
        this.num_2 = num;
    }

    public void sum(){
        this.result = num_1 + num_2;
    }

    public void sub(){
        this.result = num_1 - num_2;
    }

    public void fatorial(int num){
        int fat;

        for (int i = num; i = 1 ; --i ){
            fat *= i;
        }

        result = fat;
    }

     public double getResult(){
        return result;
    }
      
}