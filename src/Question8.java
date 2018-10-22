import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Question8 {
  public static void main(String[] args){
    System.out.println("8. Write a program that calculates the statistics of words in the following text:\n"
        + "By this time she had found her way into a tidy little room with a table in the window, and on it (as she had hoped) a fan and two or three pairs of tiny white kid gloves: she took up the fan and a pair of the gloves, and was just going to leave the room, when her eye fell upon a little bottle that stood near the looking-glass. There was no label this time with the words 'DRINK ME', but nevertheless she uncorked it and put it to her lips. “I know SOMETHING interesting is sure to happen”, she said to herself, “whenever I eat or drink anything; so I will just see what this bottle does. I do hope it will make me grow large again, for really I am quite tired of being such a tiny little thing!”\n"
        + "It did so indeed, and much sooner than she had expected: before she had\n"
        + "drunk half the bottle, she found her head pressing against the ceiling, and\n"
        + "had to stoop to save her neck from being broken. She hastily put down the\n"
        + "bottle, saying to herself 'That is quite enough--I hope I shall not grow any\n"
        + "more--As it is, I cannot get out at the door--I do wish I had not drunk\n"
        + "quite so much!'\n"
        + "Alas! it was too late to wish that! She went on growing, and growing, and\n"
        + "very soon had to kneel down on the floor: in another minute there was not\n"
        + "even room for this, and she tried the effect of lying down with one elbow\n"
        + "against the door, and the other arm curled round her head. Still she went on\n"
        + "growing, and, as a last resource, she put one arm out of the window, and one\n"
        + "foot up the chimney, and said to herself 'Now I can do no more, whatever\n"
        + "happens. What WILL become of me?'\n"
        + "Luckily for Alice, the little magic bottle had now had its full effect, and"
        + "she grew no larger: still it was very uncomfortable, and, as there seemed to be\n"
        + "    no sort of chance of her ever getting out of the room again, no wonder she felt\n"
        + "    unhappy.\n"
        + "The Statistics of the words needed to be shown are following:\n"
        + "a. The counts of every word occurences in the text (all in small case)"
        + "b. The number of words\n"
        + "c. The number of unique words\n"
        + "d. The most-frequently occurred words\n"
        + "e. The least-frequently occurred words");

    String text = "By this time she had found her way into a tidy little room with a table in the window, and on it (as she had hoped) a fan and two or three pairs of tiny white kid gloves: she took up the fan and a pair of the gloves, and was just going to leave the room, when her eye fell upon a little bottle that stood near the looking-glass. There was no label this time with the words 'DRINK ME', but nevertheless she uncorked it and put it to her lips. “I know SOMETHING interesting is sure to happen”, she said to herself, “whenever I eat or drink anything; so I will just see what this bottle does. I do hope it will make me grow large again, for really I am quite tired of being such a tiny little thing!”\n"
        + "It did so indeed, and much sooner than she had expected: before she had\n"
        + "drunk half the bottle, she found her head pressing against the ceiling, and\n"
        + "had to stoop to save her neck from being broken. She hastily put down the\n"
        + "bottle, saying to herself 'That is quite enough--I hope I shall not grow any\n"
        + "more--As it is, I cannot get out at the door--I do wish I had not drunk\n"
        + "quite so much!'\n"
        + "Alas! it was too late to wish that! She went on growing, and growing, and\n"
        + "very soon had to kneel down on the floor: in another minute there was not\n"
        + "even room for this, and she tried the effect of lying down with one elbow\n"
        + "against the door, and the other arm curled round her head. Still she went on\n"
        + "growing, and, as a last resource, she put one arm out of the window, and one\n"
        + "foot up the chimney, and said to herself 'Now I can do no more, whatever\n"
        + "happens. What WILL become of me?'\n"
        + "Luckily for Alice, the little magic bottle had now had its full effect, and"
        + "she grew no larger: still it was very uncomfortable, and, as there seemed to be\n"
        + "    no sort of chance of her ever getting out of the room again, no wonder she felt\n"
        + "    unhappy.\n";

    System.out.println();
    System.out.println();
    System.out.println("------------ THE ANSWER -------------");

    text.toLowerCase();
    int count =0;
    int highest_occurence=0;
    String token="";
    HashMap<String,Integer> hm = new HashMap<>();
    StringTokenizer st = new StringTokenizer(text);
    while (st.hasMoreTokens()){
      count+=1;
      token = st.nextToken();
      hm.put(token, hm.getOrDefault(token,0) + 1);
      if(hm.get(token) > highest_occurence){
        highest_occurence = hm.get(token);
      }
    }

    int countunique=0;
    int less_occurence = highest_occurence;
    System.out.println("a. The counts of every word occurences in the text (all in small case)");
    //Traversing map
    for(Map.Entry<String, Integer> entry:hm.entrySet()){
      String key=entry.getKey();
      int value=entry.getValue();
      countunique +=1;
      System.out.println("Word : "+ key + " | Count : " +value);
      if(value< less_occurence){
        less_occurence = value;
      }
    }

    System.out.println("b. The number of words : " + count);

    System.out.println("c. The number of unique words : "+ countunique);

    System.out.println("d. The most-frequently occurred words : ");
    //Traversing map
    for(Map.Entry<String, Integer> entry:hm.entrySet()){
      String key=entry.getKey();
      int value=entry.getValue();
      if(value == highest_occurence){
        System.out.println(key);
      }
    }

    System.out.println("e. The least-frequently occurred words : ");
    //Traversing map
    for(Map.Entry<String, Integer> entry:hm.entrySet()){
      String key=entry.getKey();
      int value=entry.getValue();
      if(value == less_occurence){
        System.out.println(key);
      }
    }


  }
}
