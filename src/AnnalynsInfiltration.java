public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake && archerIsAwake && prisonerIsAwake){
            return true;
        }else if(knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return true;
        }else if(!knightIsAwake && archerIsAwake && !prisonerIsAwake){
            return true;
        }else if(!knightIsAwake && !archerIsAwake && prisonerIsAwake){
            return true;
        }else if(!knightIsAwake && archerIsAwake){
            return true;
        }else if(knightIsAwake && archerIsAwake){
            return true;
        }else return knightIsAwake;
    }
}
