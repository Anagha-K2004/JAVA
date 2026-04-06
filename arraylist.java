import java.util.*;
public class arraylist
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("vibgiyor");
        arrayList.add("indigo");
        arrayList.add("violte");
        arrayList.add("green");
        System.out.println("First Element is "+arrayList.get(0));
        System.out.println("The Elements of the arraylist is - "+arrayList);
        Collections.sort(arrayList);
        System.out.println("\nThe Array list sorted : "+arrayList);
        Collections.addAll(arrayList,"red","blue","orange","yellow");
        System.out.println("\nAdding new items in the arraylist:"+arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("\nThe reverse order of the arrayList "+arrayList);
        System.out.println("\nThe maximum element of the arraylist : "+Collections.max(arrayList));
        for(String word:arrayList)
        {
            System.out.println(word);
        }

        arrayList.set(3,"pink");
        System.out.println("The Elements of the arraylist is - "+arrayList);

        arrayList.remove(5);
        System.out.println("The Elements of the arraylist is - "+arrayList);

        arrayList.size();
        System.out.println("The size of the arraylist is - "+arrayList.size());
    }  
}