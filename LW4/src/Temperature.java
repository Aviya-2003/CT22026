class Temperature {

    private double celsius;

 public Temperature () {
     this.celsius = 0;
 }
    public Temperature(double c) {
        this.celsius = c;

    }
     public double toFahrenheit(double c){
         return (c  * 9 / 5 + 32);
    }

    public double toCelsius(double c){

         return c;
        }
        public double toCelsius(){
            return celsius;
        }


        public void setFahrenheit(double Ferenheit){
         this.celsius = (Ferenheit-32)*5/9;
        }

        public void setCelsius(double c){
         this.celsius = c;
        }
}

