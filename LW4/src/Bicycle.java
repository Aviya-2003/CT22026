class Bicycle {
    private Owner owner;

    public Bicycle() {
       this.owner = new Owner();
    }


    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
