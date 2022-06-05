import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the first number: ");
        String firstNumber = getNumbers();
        System.out.println("Enter the second number: ");
        String secondNumber = getNumbers();
        addNumbers(firstNumber, secondNumber);
    }

    private static String getNumbers() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static List<Integer> splitNumber(String number)
    {
        List<Integer> splitNumber = new ArrayList<>();
        String[] splitArray = number.split(" \\+");
        splitNumber.add(Integer.parseInt(splitArray[0]));
        String[] secondPartArray = splitArray[1].split("i");
        splitNumber.add(Integer.parseInt(secondPartArray[1]));
        return splitNumber;
    }

    private static void addNumbers(String firstNumber, String secondNumber)
    {
        List<Integer> real = splitNumber(firstNumber);
        List<Integer> image = splitNumber(secondNumber);
        int sumOfReals = real.get(0) + image.get(0);
        int sumOfImages = real.get(1) + image.get(1);
        System.out.printf("The sum is: %s +i%s", sumOfReals, sumOfImages);
    }
}
