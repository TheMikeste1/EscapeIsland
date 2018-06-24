package view;

/**
 *
 * @author Austin
 */
public abstract interface ViewInterface {

    abstract String[] getInputs();

    abstract boolean doAction(String[] inputs);

    abstract void display();

    abstract String getInput(String promptMessage);

}
