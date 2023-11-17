//------------------------------------------------------------------------------------
// Assignment 1 
// © Vinay Sahrawat
// Written by: (Vinay Sahrawat 40220936) 
//
// Program Description:
// This program allows users to manage a database of cricket players. Users can add
// players, update player information, find players with specific criteria, and more.
// The program provides a menu-driven interface for these operations.
//-----------------------------------------------------------------------------------
package assignment1;
import java.util.Scanner;

public class Cricketer {
  private static long cricketerCount = 0; // Static variable to keep track of the number of cricketer objects created
  private long cricketerID;
  private String cricketerName;
  private float battingAvg;
  private float bowlingAvg;
  private float strikeRate;
  private float economyRate;
  private boolean isAvailable;

  // Constructor to initialize a Cricketer object with default values
  public Cricketer() {
    cricketerCount++;
    this.cricketerID = cricketerCount;
    this.cricketerName = "Cricketer " + this.cricketerID;
    this.bowlingAvg = 0.0f;
    this.strikeRate = 0.0f;
    this.economyRate = 0.0f;
    this.isAvailable = true;
  }

  // Accessors and Mutators for the attributes
  public long getCricketerID() {
    return cricketerID;
  }

  public String getCricketerName() {
    return cricketerName;
  }

  public void setCricketerName(String cricketerName) {
    this.cricketerName = cricketerName;
  }

  public float getBattingAvg() {
    return battingAvg;
  }

  public void setBattingAvg(float battingAvg) {
    this.battingAvg = battingAvg;
  }

  public float getBowlingAvg() {
    return bowlingAvg;
  }

  public void setBowlingAvg(float bowlingAvg) {
    this.bowlingAvg = bowlingAvg;
  }

  public float getStrikeRate() {
    return strikeRate;
  }

  public void setStrikeRate(float strikeRate) {
    this.strikeRate = strikeRate;
  }

  public float getEconomyRate() {
    return economyRate;
  }

  public void setEconomyRate(float economyRate) {
    this.economyRate = economyRate;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  // toString method to display all information of a Cricketer object
  public String toString() {
    return "Cricketer ID: " + cricketerID +
      "\nCricketer Name: " + cricketerName +
      "\nBatting Average: " + battingAvg +
      "\nBowling Average: " + bowlingAvg +
      "\nStrike Rate: " + strikeRate +
      "\nEconomy Rate: " + economyRate +
      "\nIs Available: " + isAvailable;
  }

  // Static method to get the number of Cricketer objects created
  public static long getNumberOfCricketers() {
    return cricketerCount;
  }

  // Override equals method to compare two Cricketer objects for equality
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Cricketer cricketer = (Cricketer) obj;
    return cricketerID == cricketer.cricketerID && isAvailable == cricketer.isAvailable;
  }

  // Constants for password and maximum attempts
  private static final String PASSWORD = "password";
  private static final int MAX_ATTEMPTS = 3;
  private static final int MAX_CRICKETERS = 100;
  private static Cricketer[] cricketerDatabase = new Cricketer[MAX_CRICKETERS];
  private static int cricketerCounter = 0;

  // Method to handle login
  private static boolean login(String password, Scanner sc) {
    int attempts = 0;
    while (attempts < MAX_ATTEMPTS) {
      System.out.print("Enter password: ");
      String enteredPassword = sc.next();
      if (enteredPassword.equals(password)) {
        return true;
      } else {
        attempts++;
        System.out.println("Incorrect password. Attempt " + attempts + " of " + MAX_ATTEMPTS);
      }
    }
    System.out.println("Too many incorrect password attempts. Returning to the main menu.");
    return false;
  }

  // Display the main menu options
  private static void displayMainMenu() {
    System.out.println("Main Menu:");
    System.out.println("1. Add Cricketers");
    System.out.println("2. Update Cricketer Information");
    System.out.println("3. Display Cricketers by Bowling Avg");
    System.out.println("4. Display All Rounders");
    System.out.println("5. Quit");
    System.out.println("6. Number of cricketers in database");
    System.out.print("Please enter your choice: ");
  }

  // Display the update menu options
  private static void displayUpdateMenu() {
    System.out.println("What information would you like to change?");
    System.out.println("1. Name");
    System.out.println("2. Batting Average");
    System.out.println("3. Bowling Average");
    System.out.println("4. Strike Rate");
    System.out.println("5. Economy");
    System.out.println("6. Availability");
    System.out.println("7. Quit");
    System.out.print("Enter your choice: ");
  }

  //Method to display Cricketer information
  private static void displayCricketerInfo(Cricketer cricketer) {
    System.out.println("Cricketer: #" + cricketer.getCricketerID());
    System.out.println("ID: " + cricketer.getCricketerID());
    System.out.println("Name: " + cricketer.getCricketerName());
    System.out.println("Batting Average: " + cricketer.getBattingAvg());
    System.out.println("Bowling Average: " + cricketer.getBowlingAvg());
    System.out.println("Strike Rate: " + cricketer.getStrikeRate());
    System.out.println("Economy Rate: " + cricketer.getEconomyRate());
    System.out.println("Availability: " + cricketer.isAvailable());
    System.out.println();
  }

  // Method to add Cricketers to the database
  private static void addCricketers(Scanner sc) {

    System.out.print("Enter the number of Cricketers you want to add: ");
    int numCricketersToAdd = sc.nextInt();

    if (cricketerCounter + numCricketersToAdd > MAX_CRICKETERS) {
      System.out.println("There is not enough space to add " + numCricketersToAdd + " Cricketers.");
      System.out.println("You can add up to " + (MAX_CRICKETERS - cricketerCounter) + " Cricketers.");
      return;
    }

    // Enter the values of properties 
    for (int i = 0; i < numCricketersToAdd; i++) {
      cricketerCounter++;
      Cricketer cricketer = new Cricketer();

      // Collect details for the new cricketer
      System.out.println("Enter details for Cricketer #" + cricketer.getCricketerID() + ":");
      System.out.print("Name: ");
      sc.nextLine(); // Consume newline character
      String name = sc.nextLine();
      cricketer.setCricketerName(name);

      System.out.print("Batting Average: ");
      float battingAvg = sc.nextFloat();
      cricketer.setBattingAvg(battingAvg);

      System.out.print("Bowling Average: ");
      float bowlingAvg = sc.nextFloat();
      cricketer.setBowlingAvg(bowlingAvg);

      System.out.print("Strike Rate: ");
      float strikeRate = sc.nextFloat();
      cricketer.setStrikeRate(strikeRate);

      System.out.print("Economy Rate: ");
      float economyRate = sc.nextFloat();
      cricketer.setEconomyRate(economyRate);

      System.out.print("Availability (true/false): ");
      boolean availability = sc.nextBoolean();
      cricketer.setAvailable(availability);

      cricketerDatabase[cricketerCounter - 1] = cricketer;
      System.out.println("Cricketer added successfully!");
    }
  }

  // Method to update Cricketer information
  private static void updateCricketer(Scanner sc) {
    System.out.print("Enter the CricketerID you wish to update: ");
    long cricketerID = sc.nextLong();

    Cricketer cricketerToUpdate = null;
    for (Cricketer cricketer: cricketerDatabase) {
      if (cricketer != null && cricketer.getCricketerID() == cricketerID) {
        cricketerToUpdate = cricketer;
        break;
      }
    }

    if (cricketerToUpdate == null) {
      System.out.println("No Cricketer found with CricketerID: " + cricketerID);
      System.out.print("Do you want to enter another Cricketer (1) or go back to the main menu (2)? Enter your choice: ");
      int choice = sc.nextInt();
      if (choice == 2) {
        return;
      }
    } else {
      System.out.println("Cricketer Information: ");
      displayCricketerInfo(cricketerToUpdate);

      int choice;
      do {
        displayUpdateMenu();
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
        case 1:
          System.out.print("Enter new Name: ");
          String newName = sc.nextLine();
          cricketerToUpdate.setCricketerName(newName);
          break;
        case 2:
          System.out.print("Enter new Batting Average: ");
          float newBattingAvg = sc.nextFloat();
          cricketerToUpdate.setBattingAvg(newBattingAvg);
          break;
        case 3:
          System.out.print("Enter new Bowling Average: ");
          float newBowlingAvg = sc.nextFloat();
          cricketerToUpdate.setBowlingAvg(newBowlingAvg);
          break;
        case 4:
          System.out.print("Enter new Strike Rate: ");
          float newStrikeRate = sc.nextFloat();
          cricketerToUpdate.setStrikeRate(newStrikeRate);
          break;
        case 5:
          System.out.print("Enter new Economy Rate: ");
          float newEconomyRate = sc.nextFloat();
          cricketerToUpdate.setEconomyRate(newEconomyRate);
          break;
        case 6:
          System.out.print("Enter new Availability (true/false): ");
          boolean newAvailability = sc.nextBoolean();
          cricketerToUpdate.setAvailable(newAvailability);
          break;
        case 7:
          System.out.println("Cricketer Information Updated Successfully!");
          break;
        default:
          System.out.println("Invalid choice. Please enter a number from 1 to 7.");
        }
      } while (choice != 7);
    }
  }

  // Method to find Cricketers based on Bowling Average
  private static void findCricketersByBowlingAvg(Scanner sc) {
    System.out.print("Enter the desired maximum bowling average: ");
    float maxBowlingAvg = sc.nextFloat();
    int found = 0;

    System.out.println("Cricketers with Bowling Average < " + maxBowlingAvg + ":");
    for (Cricketer cricketer: cricketerDatabase) {
      if (cricketer != null && cricketer.isAvailable() && cricketer.getBowlingAvg() < maxBowlingAvg) {
        displayCricketerInfo(cricketer);
        found = 1;
      }
    }

    if (found == 0)
      System.out.println("No Player found.");
  }

  // Method to find All-Rounders based on Strike Rate and Economy Rate
  private static void findAllRounders(Scanner sc) {
    System.out.print("Enter the desired minimum strike rate: ");
    float minStrikeRate = sc.nextFloat();

    System.out.print("Enter the desired maximum economy rate: ");
    float maxEconomyRate = sc.nextFloat();

    int found = 0;

    System.out.println("All-Rounders with better Strike Rate and lower Economy Rate:");
    for (Cricketer cricketer: cricketerDatabase) {
      if (cricketer != null && cricketer.isAvailable() &&
        cricketer.getStrikeRate() > minStrikeRate &&
        cricketer.getEconomyRate() < maxEconomyRate) {
        found = 1;
        displayCricketerInfo(cricketer);
      }
    }
    if (found == 0)
      System.out.println("No Player found with the mentioned Strike and Economy rates.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    int attempts = 0;

    System.out.println("Welcome to the Cricket Organization App!");

    while (true) {
      displayMainMenu();
      choice = sc.nextInt();

      if (choice == 1) {
       
        if (login(PASSWORD, sc)) {
        	 addCricketers(sc);
        	 attempts=0;
          } else {
            attempts++;
            if (attempts == 4) {
              System.out.println("Program detected suspicious activities and will terminate immediately!");
              break;
            }
          }
      } else if (choice == 2) {
        if (login(PASSWORD, sc)) {
          updateCricketer(sc);
          attempts=0;
        } else {
          attempts++;
          if (attempts == MAX_ATTEMPTS * 4) {
            System.out.println("Program detected suspicious activities and will terminate immediately!");
            break;
          }
        }
      } else if (choice == 3) {
        findCricketersByBowlingAvg(sc);
      } else if (choice == 4) {
        findAllRounders(sc);
      } else if (choice == 5) {
        System.out.println("Thank you for using the Cricket Organization App!");
        break;
      } else if (choice == 6) {
    	long numberOfCricketers = Cricketer.getNumberOfCricketers();
    	System.out.println("Number of Cricketers in databse: " + numberOfCricketers);
    	System.out.println("Max number of Cricketers that can be added: " + MAX_CRICKETERS);
      } else {
        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
      }
    }

    sc.close();
  }
}