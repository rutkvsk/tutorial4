public class Event {
   private String name;
   private String date;
   private String location;
   private int maxNumberOfSeats;
   private int availableSeats;
   private double price;

   public Event (String name, double price) {
      this.name = name;
      this.price = price;
   }
   public Event (String name, double price, String date) {
      this.name = name;
      this.price = price;
      this.date = date;
   }
   public Event (String name, double price, String date, String location) {
      this.name = name;
      this.price = price;
      this.date = date;
      this.location = location;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getDate() {
      return date;
   }
   public void setDate(String date) {
      this.date = date;
   }
   public String getLocation() {
      return location;
   }
   public void setLocation(String location) {
      this.location = location;
   }
   public int getMaxNumberOfSeats() {
      return maxNumberOfSeats;
   }
   public int setMaxNumberOfSeats(int maxNumberOfSeats) {
      this.maxNumberOfSeats = maxNumberOfSeats;
   }
   public int getAvailableSeats() {
      return availableSeats;
   }
   public int setAvailableSeats(int availableSeats) {
      this.availableSeats = availableSeats;
   }
   public double getPrice() {
      return price;
   }
   public int setPrice(double price) {
      this.price = price;
   }

   public String toString() {
   return getName() + " " + getDate() + " " + getLocation() + " " + getPrice();
   }
   public void reserveSeat () {
      availableSeats = availableSeats - 1;
   }
}
