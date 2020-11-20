import java.util.*;

public class Dlist {
        static ArrayList<String>Names=new ArrayList<>();
        static ArrayList<String>Ages=new ArrayList<>();
        
    public static void main(String[] args) {
        
        Scanner skanerMain = new Scanner(System.in);
        System.out.println("WELCOME TO D'list! \n Choose from below what you want to do:");
        System.out.println(" [1] Add entry\n" +
                           " [2] Delete entry\n" +
                           " [3] View all entries\n" +
                           " [4] Update an entry\n" +
                           " [0] Exit");
        System.out.print("    Please Enter your choice: ");
            int choice=skanerMain.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==0)
            {
              System.exit(1);
            }
           
        }
    static void c1(ArrayList<String>forNames,ArrayList<String>forAges)
    {
        System.out.print("OK. Type the name you would like to add: ");
                Scanner skaner1 = new Scanner(System.in);
                String ngalan1 = skaner1.nextLine();
                Names.add(ngalan1);
                System.out.print(" Now type his/her age: ");
                String edad1= skaner1.nextLine();
                Ages.add(edad1);
                System.out.println("===============================");
                System.out.println(ngalan1.toUpperCase()+" is added on the list!");
                System.out.println("What do you want to do next?\n"+
                                   "[1] add a new entry\n"+
                                   "[2] return to main menu\n"+
                                   "[3] exit the program");
                int portal = skaner1.nextInt();
                 if (portal==1)
                {
                    c1(Names,Ages);
                }
                 if (portal==2)
                {
                    main(null);
                }
                 if (portal==3)
                {
                   System.out.print("THANK YOU!");
                }
    }
    static void c2(ArrayList<String>forNames,ArrayList<String>forAges)
    {
        System.out.println("Type the name of the entry you want to delete: ");
                Scanner skaner2= new Scanner (System.in);
                String ngalan2 = skaner2.nextLine();
                forAges.remove(forNames.indexOf(ngalan2));
                forNames.remove(ngalan2);
                System.out.println(ngalan2.toUpperCase()+" is deleted from the list! What do want to do next?\n");
                System.out.println("What do you want to do next?\n"+
                                   "[1] delete again an entry\n"+
                                   "[2] return to main menu\n"+
                                   "[3] exit the program");
                int portal = skaner2.nextInt();
                 if (portal==1)
                {
                    c2(Names,Ages);
                }
                 if (portal==2)
                {
                    main(null);
                }
                 if (portal==3)
                {
                   System.out.print("THANK YOU!");
                }
    }
    
    static void c3(ArrayList<String>forNames,ArrayList<String>forAges)
    {
     
     System.out.println("============LIST OF ENTRIES:==============");
     for(int i=0;i<=forNames.size()-1;i++)
     {
            System.out.println("================INDEX"+"["+i+"]"+"==================");
            System.out.print("NAME: "+ forNames.get(i)+ "  AGE: "+ forAges.get(i));
            System.out.println("\n==========================================");
            System.out.println("|");
            System.out.println("|");
     }
      System.out.println("What do you want to do next?\n"+
                                   "[1] return to main menu\n"+
                                   "[2] exit the program");
                Scanner skaner3= new Scanner(System.in);
                int portal = skaner3.nextInt();
              
                 if (portal==1)
                {
                    main(null);
                }
                 if (portal==2)
                {
                   System.out.print("THANK YOU!");
                }
          
    }
    static void c4(ArrayList<String>forNames,ArrayList<String>forAges)
    {
       
        System.out.println("What do you intend to edit?\n"+
                           "[1] Replace an entire Entry\n"+
                           "[2] Only update a person's age\n"+
                           "[3] Only update a person's name\n");
                           Scanner skaner4 = new Scanner (System.in);
                           int choice = skaner4.nextInt();
                           if(choice==1)
                           {
                               System.out.print("Whose data would you like to replace?\n name: ");
                               Scanner skaner44 = new Scanner (System.in);
                               String name44= skaner44.nextLine();
                               String name4= new String(name44);
                               System.out.println("Type the name and age you would like to replace with "+name44+"'s");
                               System.out.print("NAME:");
                               String repName= skaner44.nextLine();
                               
                               System.out.print("AGE:");
                               String repAge= skaner44.nextLine();
                               forAges.set(forNames.indexOf(name44), repAge);
                               forNames.set(forNames.indexOf(name44), repName);
                               
                               System.out.println("Nice! "+name4+"'s"+" data"+" is now replaced with "+repName+"'s"); 
                               System.out.println("Press 1 to go back to main menu");
                               int portal= skaner44.nextInt();
                               if(portal==1)
                               {
                                   main(null);
                               }
                           }
                           if(choice==2)
                           {
                               System.out.print("Who among the entries has a new age?\n name: ");
                               Scanner skaner44 = new Scanner (System.in);
                               String NameGet= skaner44.nextLine();
                               System.out.println("Type "+NameGet+"'s"+" new age");
                               System.out.print("AGE:");
                               String AgeGet=skaner44.nextLine();
                               forAges.set(forNames.indexOf(NameGet), AgeGet);
                               System.out.println(NameGet+"'s"+" age "+" is now "+AgeGet+"!");
                               System.out.println("Press 1 to go back to main menu");
                               int portal= skaner44.nextInt();
                               if(portal==1)
                               {
                                   main(null);
                               }
                           }
                           if(choice==3)
                           {
                               System.out.print("Please type the mispelled name?\n name: ");
                               Scanner skaner44 = new Scanner (System.in);
                               String WrongName= skaner44.nextLine();
                               System.out.println("Type "+WrongName+"'s"+" new/revised name");
                               System.out.print("NEW NAME:");
                               String NewName=skaner44.nextLine();
                               forNames.set(forNames.indexOf(WrongName), NewName);
                               System.out.println("If we mispelled your name "+NewName+", we are very sorry! We changed it now.");
                               System.out.println("Press 1 to go back to main menu");
                               int portal= skaner44.nextInt();
                               if(portal==1)
                               {
                                   main(null);
                               }
                           }
                           
    }
    
   
}