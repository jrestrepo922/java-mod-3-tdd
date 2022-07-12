public class FizzBuzz {
  public String fizzBuzzString(String str) {
      if(str == null){
         return str;
      }
      if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
      if (str.startsWith("f"))  return "Fizz";
      if (str.endsWith("b")) return "Buzz";
      return str;
  }

  public String[] fizzBuzzArray(String[] arr){
      if(arr == null || arr.length == 0 ){
          System.out.println("arrays can not be null or empty");
          return null;
      }
      for(int i = 0; i < arr.length; i++){
          String newValue = this.fizzBuzzString(arr[i]);
          arr[i] = newValue;
      }
      return arr;
  }
}