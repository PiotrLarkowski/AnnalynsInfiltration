public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake && archerIsAwake && prisonerIsAwake) {
            return true;
        } else if (knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return true;
        } else if (!knightIsAwake && archerIsAwake && !prisonerIsAwake) {
            return true;
        } else if (!knightIsAwake && !archerIsAwake && prisonerIsAwake) {
            return true;
        } else if (!knightIsAwake && archerIsAwake) {
            return true;
        } else if (knightIsAwake && archerIsAwake) {
            return true;
        } else return knightIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!archerIsAwake && prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!knightIsAwake && archerIsAwake && !prisonerIsAwake) {
            return false;
        } else if (knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent) {
            return false;
        }else if (knightIsAwake && archerIsAwake && prisonerIsAwake) {
            return false;
        } else if (knightIsAwake && !archerIsAwake && !prisonerIsAwake && !petDogIsPresent) {
            return false;
        }  else if (!knightIsAwake && archerIsAwake && petDogIsPresent) {
            return false;
        } else if (knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent) {
            return false;
        } else if (knightIsAwake && archerIsAwake && !petDogIsPresent) {
            return false;
        } else if (knightIsAwake && archerIsAwake) {
            return false;
        } else if (!knightIsAwake && archerIsAwake) {
            return false;
        } else if (!knightIsAwake && !prisonerIsAwake && !petDogIsPresent) {
            return false;
        }else {
            return true;
        }
    }

}
