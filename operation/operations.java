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

    public double getResult(){
        return result;
    }

    public void sub(){
        this.result = num_1 - num_2;
    }

    public double getResultSub(){
        return result;
    }

    

}