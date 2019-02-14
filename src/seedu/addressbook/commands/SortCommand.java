package seedu.addressbook.commands;

/**
 * Sorts all people by Name.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all people by Name.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        addressBook.getAllPersons().sort();
        return new CommandResult("Hello World");
    }
}
