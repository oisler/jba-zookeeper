package app.animal;

public class Bat extends Animal {

    @Override
    public void print() {
        System.out.println("""
                Switching on the camera in the bat habitat...
                _________________               _________________
                 ~-.              \\  |\\___/|  /              .-~
                     ~-.           \\ / o o \\ /           .-~
                        >           \\  W  //           <
                       /             /~---~\\             \\
                      /_            |       |            _\\
                         ~-.        |       |        .-~
                            ;        \\     /        i
                           /___      /\\   /\\      ___\\
                                ~-. /  \\_/  \\ .-~
                                   V         V
                This bat looks like it's doing fine.""");
    }
}
