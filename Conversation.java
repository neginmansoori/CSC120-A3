import java.util.Scanner;

class Conversation {

  // method for converting string input to an array
  public static String[] sentence_to_word(String user_response){
   String[] words = user_response.split(" ");
   return words;
    }

 // method for swapping words
  public static String[] word_swap(String[] words) { 
   String[] array1 = {"I","me","am","my"};
   String[] array2 = {"You","you","are","your"};

   for (int i =0; i < words.length; i++){
      for ( int j = 0; j< array1.length; j++){
        if (words[i].equals(array1[j])){
          words[i] = array2[j];
        }
        else if (words[i].equals(array2[j])){
          words[i] = array1[j];
        }
      }
    }
    return words;
  }

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    // asking for number of rounds
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rounds: ");
    int r_number = input.nextInt();

    // opening message
    System.out.print("Hey there! What is on your mind? ");

   for (int i = 0; i <= r_number; i++){
    String user_response = input.nextLine();
    String[] transcript = sentence_to_word(user_response);
    String[] automated_response = word_swap(transcript);
    System.out.println(automated_response);
      }
  
    // closing sentence
    System.out.println("Have a nice day!");
    }
  }  
    
