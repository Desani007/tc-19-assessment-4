package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
    public enum RockPaperScissorHandSign {
    PAPER , ROCK, SCISSOR;





    public RockPaperScissorHandSign getWinner() {
        if (equals(ROCK)) {
            return PAPER;
        }
        if (equals(PAPER)) {
            return SCISSOR;
        }
        if (equals(SCISSOR)) {
            return ROCK;
        } else
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        if (equals(RockPaperScissorHandSign.PAPER)) {
            return ROCK;
        }
        if (equals(RockPaperScissorHandSign.SCISSOR)) {
            return PAPER;
        }
        if (equals(ROCK)) {
            return SCISSOR;
        }




        return null;
    }
}







