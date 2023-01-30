// LAB 1: Write a Java Program that will collect an employee's basic details 
// that fall into different data types and displays them. After the
// details have been displayed, with the help of conditional statements, 
// check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 
// 'm' and "FEMALE" for 'f'. Assume that you can divide the states among India 
// into different regions (North, South, Central, East, and West). If the employee
//  is from the southern part of India, with the help of a switch statement, 
// it should display "The Employee is from the southern states of India; 
// Preferable work location is in ", along with the basic details. Identify 
// if the employee belongs to the top MNC Companies (Facebook, Google, 
// Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is 
//working in Top MNC Companies".

//Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, and necessary validations.


import java.util.Scanner;



public class LAB1{ // class name ;everthing comes under class 
    public static void main(String[] args){  // main method ; similar to functions in python ; array of strings  
       
       
        Scanner Aa = new Scanner(System.in);
        System.out.println("Enter your Name, Age and Gender: ");
        String inpname= Aa.nextLine();
        int Age = Integer.parseInt(Aa.nextLine());
        String Gender=Aa.nextLine();
        String State=Aa.nextLine();
        String pwork=Aa.nextLine();
        System.out.println("Details are " + inpname+ ", "+ Age+", " +Gender+", "+State+" and "+pwork);




        if(Gender.equals("F")||(Gender.equals("FEMALE"))||(Gender.equals("Female"))){
            System.out.println("The employee is a Female");
    
        }else if(Gender.equals("M")||(Gender.equals("MALE"))||(Gender.equals("Male"))){
            System.out.println("The employee is male");
        }else{
            System.out.println("None");

        }
            
        
        String stateb= State;
        switch(stateb){
            case "Jammu & Kashmir":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Punjab":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Uttarakhand":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Haryana":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Delhi":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Uttar Pradesh":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Chandigarh":
                System.out.println("The Employee is from the Northern states of India");
                break;
            case "Andhra Pradesh":
                System.out.println("The Employee is from the southern states of India");
                break;
            case "Karnataka":
                System.out.println("The Employee is from the southern states of India");
                break;
            case "Kerela":
                System.out.println("The Employee is from the southern states of India");
                break;
            case "Tamil Nadu":
            case "Telangana":
                System.out.println("The Employee is from the southern states of India");
                break;
            case "Gujarat":
                System.out.println("Western  state");
                break;
            case "Maharastra":
                System.out.println("Western  state");
                break;
            case "Goa":
                System.out.println("Western  state");
                break;
            case "Rajasthan":
                System.out.println("Western  state");
                break;
            case "Dadra and Nagar Haveli":
                System.out.println("Western  state");
                break;
            case "Daman and Diu":
                System.out.println("Western  state");
                break;
            case "Madhya Pradesh":
                System.out.println("Western State");
                break;
            case "Arunachal Pradesh":
                System.out.println("Western State");
                break;
            case "Assam":
                System.out.println("Western State");
                break;
            case "Manipur":
                System.out.println("Western State");
                break;
            case "Meghalaya":
                System.out.println("Western State");
                break;
            case "Mizoram":
                System.out.println("Western State");
                break;
            case "Sikkim":
                System.out.println("Western State");
                break;
            case "Tripura":
                System.out.println("Western State");
                break;
            case "West Bengal":
                System.out.println("Eastern State");
                break;
            case "Bihar":
                System.out.println("Eastern State");
                break;
            case "Jharkhard":
            case "Odisha":
                System.out.println("Eatern State");
            default:
                System.out.println("State not found!");

            

        }

        String MNC=pwork;
        switch(MNC){
            case "Facebook":
            case "Google":
            case "Microsoft":
            case "Samsung":
            case "IBM":
            case "Apple":
                System.out.println("The employee is working in Top MNC Companies");
                break;
            default:
                System.out.println("Not with any MNC Company ");

        }




            
    }
}

