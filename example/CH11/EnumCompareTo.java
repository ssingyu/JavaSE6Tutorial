public class EnumCompareTo {
    public static void main(String[] args) {
        compareToAction(Action.valueOf(args[0]));
    }
 
    public static void compareToAction(Action inputAction) {
        System.out.println("��J�G" + inputAction);
        for(Action action: Action.values()) {
            System.out.println(action.compareTo(inputAction));
        }
    }
}