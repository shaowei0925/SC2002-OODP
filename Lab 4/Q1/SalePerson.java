public class SalePerson implements Comparable{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String f, String l, int sales){
        this.firstName = f;
        this.lastName = l;
        this.totalSales = sales;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getTotalSales(){
        return this.totalSales;
    }

    public String toString(){
        return(this.lastName +" "+ this.firstName+ ": "+ this.totalSales);
    }

    public boolean equals(Object o){
        if(this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
            return s.getFirstName() == this.getFirstName() && s.getLastName()==this.getLastName();
        }
        return false;
    }

    public int compareTo(Object o){
        if(this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
            if(this.getTotalSales() == s.getTotalSales()){
                return -1*this.getLastName().compareTo(s.getLastName());
            }
            else{
                return this.getTotalSales()- s.getTotalSales();
            }
        }

        return -1;
    }
}
