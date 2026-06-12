public class Q1 {
    public static void main(String [] args ){

        pet p = new Dog();
        System.out.println(p.speak());

        pet b = new Cat();
        System.out.println(b.speak());

    }
}

class pet {

    private String name;

    public String getName() {
        return name;
    }

    public void setname (String petName){
        name = petName;
    }

    public String speak(){
        return "I'm your cuddly little pet. ";
    }
}

class Dog extends pet{
    public String speak() {
        return " ";
    }

        private double weight;

        public void setWeight( double weight){
            this.weight = weight;
        }

        public double getWeight(){
            return weight;
    }
    public String toString(){
        return "name : "+ getName()+" "+"Type : Dog "+" "+"Weight : "+ weight;
    }

}

class Cat extends pet{
    public String speak(){
        return " ";
    }

    private String coatColour;

    public String getcoaltColour(){
        return coatColour;
    }

    public void setCoatColour(String coatColour) {
        this.coatColour=coatColour;

    }

    public String toString(){
        return "name : "+ getName()+" "+"Type : Cat "+" "+"coat colour : "+ coatColour;
    }
}

