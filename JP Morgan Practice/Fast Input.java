// Fast Input Handling (Avoid Scanner for Large Inputs)
import java.io.*;
import java.util.*;
public class FastInput{
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    System.out.println("Input:"+n);
  }
}
  
