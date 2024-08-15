import java.util.ArrayList;
import java.util.List;
public class ReverseListString {
        public static void main(String[] args) {
            try {
                // Create a List of strings
                List<String> list = new ArrayList<>();
//               insert element into list
                list.add("Apple");
                list.add("Banana");
                list.add("Cherry");
                list.add("Date");
                list.add("Elderberry");

                System.out.println("Original List: " + list);

                // Check if the List is empty
                if (list.isEmpty()) {
                    throw new Exception("List is empty");
                }

                // Reverse the List using for loop
                List<String> reversedList = new ArrayList<>();
                for (int i = list.size() - 1; i >= 0; i--) {
                    reversedList.add(list.get(i));
                }
                System.out.println("Reversed List: " + reversedList);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

