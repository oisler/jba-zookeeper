package app.animal;

public class Rabbit extends Animal {

    @Override
    public void print() {
        System.out.println("""
                Switching on the camera in the rabbit habitat...
                         ,
                        /|      __
                       / |   ,-~ /
                      Y :|  //  /
                      | jj /( .^
                      >-"~"-v"
                     /       Y
                    jo  o    |
                   ( ~T~     j
                    >._-' _./
                   /   "~"  |
                  Y     _,  |
                 /| ;-"~ _  l
                / l/ ,-"~    \\
                \\//\\/      .- \\
                 Y        /    Y
                 l       I     !
                 ]\\      _\\    /"\\
                (" ~----( ~   Y.  )
                It looks like we will soon have more rabbits!""");
    }
}
