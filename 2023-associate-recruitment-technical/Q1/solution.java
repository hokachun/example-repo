import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int argsIndex = 0;
		int numberOfShirtsInShop = Integer.valueOf(args[argsIndex++]);
		System.out.print(numberOfShirtsInShop);
		ArrayList<String> shirtSizes = new ArrayList<String>();
		for(int i=0;i<numberOfShirtsInShop;i++) {
		    shirtSizes.add(args[i+argsIndex]);
		    System.out.println(args[i+argsIndex]);
		}
		argsIndex += numberOfShirtsInShop;
		int numberOfRequests = Integer.valueOf(args[argsIndex++]);
		System.out.print(numberOfRequests);
		ArrayList<String> requestSizes = new ArrayList<String>();
		boolean isAllFind = true;
		for(int i=0;i<numberOfRequests;i++) {
    		boolean isFind = false;
            for(String shirtSize: shirtSizes){
                if(shirtSize.compareTo(args[i+argsIndex]) >= 0){
                    isFind = true;
                    break;
                }
            }
            if(isFind == false){
                isAllFind = false;
            }
		}
        if(isAllFind == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}
}