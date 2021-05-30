package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);
        
        boolean isEligiableToDrive = false;
        String driving = isEligiableToDrive ? "have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
                
    }
}
