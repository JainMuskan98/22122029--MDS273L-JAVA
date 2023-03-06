package LAB5;

import java.util.Scanner;
public class LAB5{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your sentence: ");
            String sentence=sc.nextLine();

            System.out.println("Do you wish to encrypt or decrypt press 1 from encrypt and 2 for decrypt");
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    String en=encrypt(sentence);
                    System.out.println(en);
                    break;
                case 2:
                    String den=decrypt(sentence);
                    System.out.println(den);
                    break;
            }
            
        }


        public static String encrypt(String sentence){
            
            char length=(char) sentence.length();
            String newsentence="";

            for (int i =0;i<length;i++){
                char letter=sentence.charAt(i);


                switch(letter){
                    case ('A'):
                    case 'a':
                        newsentence = newsentence+'X';
                        break;
                    
                    case 'B':
                    case 'b':
                        newsentence = newsentence+'Y';
                        break;
                    
                    case 'C':
                    case 'c':
                        newsentence = newsentence+'Z';
                        break;
                    
                    case 'D':
                    case 'd':
                        newsentence = newsentence+'A';
                        break;
                    case 'E':
                    case 'e':
                        newsentence = newsentence+'B';
                        break;
                    case 'F':
                    case 'f':
                        newsentence = newsentence+'C';
                        break;

                    case 'G':
                    case 'g':
                        newsentence = newsentence+'D';
                        break;

                    case 'H':
                    case 'h':
                        newsentence = newsentence+'E';
                        break;
                    case 'I':
                    case 'i':

                        newsentence = newsentence+'F';
                        break;
                    case 'J':
                    case 'j':
                        newsentence = newsentence+'G';
                        break;
                    case 'K':
                    case 'k':
                        newsentence = newsentence+'H';
                        break;
                    case 'L':
                    case 'l':
                        newsentence = newsentence+'I';
                        break;    
                    case 'M':
                    case 'm':
                        newsentence = newsentence+'J';
                        break;
                    case 'N':
                    case 'n':
                        newsentence = newsentence+'K';
                        break;
                    case 'O':
                    case 'o':
                        newsentence = newsentence+'L';
                        break;
                    case 'P':
                    case 'p':
                        newsentence = newsentence+'M';
                        break;
                    case 'Q':
                    case 'q':
                        newsentence = newsentence+'N';
                        break;
                    case 'R':
                    case 'r':
                        newsentence = newsentence+'O';
                        break;
                    case 'S':
                    case 's':
                        newsentence = newsentence+'P';
                        break;
                    case 'T':
                    case 't':
                        newsentence = newsentence+'Q';
                        break;
                    case 'U':
                    case 'u':
                        newsentence = newsentence+'R';
                        break;
                    case 'V':
                    case 'v':
                        newsentence = newsentence+'S';
                        break;
                    case 'W':
                    case 'w':
                        newsentence = newsentence+'T';
                        break;
                    case 'X':
                    case 'x':
                        newsentence = newsentence+'U';
                        break;
                    case 'Y':
                    case 'y':
                        newsentence = newsentence+'V';
                        break;
                    case 'Z':
                    case 'z':
                        newsentence = newsentence+'W';
                        break;



                }

            }return newsentence;
            
            
        }
        public static String decrypt(String sentence){
            
            char length=(char) sentence.length();
            String newsentence="";

            for (int i =0;i<length;i++){
                char letter=sentence.charAt(i);


                switch(letter){
                    case 'A':
                    case 'a':
                        newsentence = newsentence+'D';
                        break;
                    
                    case 'B':
                    case 'b':
                        newsentence = newsentence+'E';
                        break;
                    
                    case 'C':
                    case 'c':
                        newsentence = newsentence+'F';
                        break;
                    
                    case 'D':
                    case 'd':
                        newsentence = newsentence+'G';
                        break;
                    case 'E':
                    case 'e':
                        newsentence = newsentence+'H';
                        break;
                    case 'F':
                    case 'f':
                        newsentence = newsentence+'I';
                        break;
                    case 'G':
                    case 'g':
                        newsentence = newsentence+'J';
                        break;
                    case 'H':
                    case 'h':
                        newsentence = newsentence+'K';
                        break;
                    case 'I':
                    case 'i':
                        newsentence = newsentence+'L';
                        break;
                    case 'J':
                    case 'j':
                        newsentence = newsentence+'M';
                        break;
                    case 'K':
                    case 'k':
                        newsentence = newsentence+'N';
                        break;
                    case 'L':
                    case 'l':
                        newsentence = newsentence+'O';
                        break;    
                    case 'M':
                    case 'm':
                        newsentence = newsentence+'P';
                        break;
                    case 'N':
                    case 'n':
                        newsentence = newsentence+'Q';
                        break;
                    case 'O':
                    case 'o':
                        newsentence = newsentence+'R';
                        break;
                    case 'P':
                    case 'p':
                        newsentence = newsentence+'S';
                        break;
                    case 'Q':
                    case 'q':
                        newsentence = newsentence+'T';
                        break;
                    case 'R':
                    case 'r':
                        newsentence = newsentence+'U';
                        break;
                    case 'S':
                    case 's':
                        newsentence = newsentence+'V';
                        break;
                    case 'T':
                    case 't':
                        newsentence = newsentence+'W';
                        break;
                    case 'U':
                    case 'u':
                        newsentence = newsentence+'X';
                        break;
                    case 'V':
                    case 'v':
                        newsentence = newsentence+'Y';
                        break;
                    case 'W':
                    case 'w':
                        newsentence = newsentence+'Z';
                        break;
                    case 'X':
                    case 'x':
                        newsentence = newsentence+'A';
                        break;
                    case 'Y':
                    case 'y':
                        newsentence = newsentence+'B';
                        break;
                    case 'Z':
                    case 'z':
                        newsentence = newsentence+'C';
                        break;



                }

            }return newsentence;
            
            
        }



}