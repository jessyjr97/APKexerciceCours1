package exercicecours1.exeinformatique.com.exercicecours1;

public class Compare_Number {
    public enum compareState {BIGGER, EQUAL, SMALLER}

    public compareState evaluate(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber)
            return compareState.BIGGER;
        else if (firstNumber < secondNumber)
            return compareState.SMALLER;
        else
            return compareState.EQUAL;
    }

}
