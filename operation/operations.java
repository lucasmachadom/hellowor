class Operations{

    private double num_1;
    private double num_2;
    private double result_sum;

    public void setNum1(double num){
        this.num_1 = num;
    }

    public void setNum2(double num){
        this.num_2 = num;
    }

    public void sum(){
        this.result_sum = num_1 + num_2;
    }

    public double getResultSum(){
        return result_sum;
    }

}