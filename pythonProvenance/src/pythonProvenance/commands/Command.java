package pythonProvenance.commands;

import java.util.ArrayList;
import java.util.List;

/**
 * A python script consists of one or more commands. The parsed commands are converted into Command objects. All Commands
 * have a validate() method.
 *
 * @author rein
 */
public abstract class Command {

	//private int line;
	
    protected List<String> errors = new ArrayList<String>();

    /**
     * Validates this command. Commands can be invalid for a variety of reasons, but most common are non-uniqueness of
     * a new node name or invalid attribute names.
     *
     * @return true when this command is valid and can be executed.
     */
    public abstract boolean validate();

    /**
     * Returns the errors that make this command invalid. If the command is valid, the list of errors is empty.
     * @return all errors, or an empty list
     */
    public List<String> getErrors(){
        return errors;
    }
    
    public abstract int getLine();
}