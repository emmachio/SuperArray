public class Demo{

  public static void removeDuplicates(SuperArray s) {
    for(int i = 0; i < s.size(); i++) {
      String test = s.get(i);
      for(int j = s.size()-1; j > i; j--) {
        if(test.equals(s.get(j))) {
          s.remove(j);
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray newArray = new SuperArray();
      for(int i = 0; i < a.size(); i++) {
        String test = a.get(i);
        for(int j = 0; j < b.size(); j++) {
          if(test.equals(b.get(j))) {
            newArray.add(b.get(j));
          }
        }
      }
    return newArray;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray result = new SuperArray();
    if(a.size() > b.size()) {
      for(int i = 0; i < a.size(); i++) {
        if(i < b.size()) {
          result.add(a.get(i));
          result.add(b.get(i));
        }
        else {
          result.add(a.get(i));
        }
      }
    }
    else {
      for(int j = 0; j < b.size(); j++) {
        if(j < a.size()) {
          result.add(a.get(j));
          result.add(b.get(j));
        }
        else {
          result.add(b.get(j));
        }
      }
    }
    return result;
  }


  public static void main(String[]args){
      // SuperArray words = new SuperArray();
      // //grouped to save vertical space
      // words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
      // words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      // words.add("una");    words.add("ebi");     words.add("toro");    words.add("hullo");
      //
      // SuperArray test = new SuperArray();
      // test.add("kani");    test.add("uni");     test.add("ebi");     test.add("una");
      // test.add("una");    test.add("ebi");     test.add("kani");    test.add("una");
      // test.add("una");    test.add("ebi");     test.add("toro");     test.add("hullo");
      // System.out.println(findOverlap(words, test));
      SuperArray test = new SuperArray();
      test.add("a");    test.add("b");    test.add("c");
      SuperArray numbers = new SuperArray();
      numbers.add("0");   numbers.add("1");   numbers.add("2");  
      System.out.println(zip(test, numbers));
    }

}
