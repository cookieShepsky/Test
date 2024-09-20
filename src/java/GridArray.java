public class GridArray{
  public static void main(String[] args) {
    for (char[] row : generateGrid()) {
      for (char c : row) {
        System.out.print(c);
      }
      System.out.println("");
    }  
  }

  public static char[][] generateGrid() {
    char[][] grid = {
      {'a', 'b', 'c'},
      {'d', 'e', 'f'},
      {'g', 'h', 'i'}
    };
    return grid;
  }

}
