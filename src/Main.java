
public class Main {
    public static void main(String[] args) {
        System.out.println("Do You can make fast attack? : " + AnnalynsInfiltration.canFastAttack(false));
        System.out.println("Can I spy? : " + AnnalynsInfiltration.canSpy(false,true,true));
        System.out.println("Can I signal prisoner? : " + AnnalynsInfiltration.canSpy(true,true,false));
        System.out.println("Can I free prisoner? : " + AnnalynsInfiltration.canFreePrisoner(true,true,true,true));

    }
}