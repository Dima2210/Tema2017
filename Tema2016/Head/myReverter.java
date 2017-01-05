/**
 * 
 */
package MyRepository.Tema2016.Head;

/**
 * @author User
 *
 */
public class myReverter {

    /**
     * 
     */
    public myReverter() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {


        for(int index = args.length - 1; index > -1; index--){
            System.out.println(args[index]);
        }
    }

}
