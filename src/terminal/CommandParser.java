package terminal;

import java.util.Arrays;
import java.util.List;
public class CommandParser {

    Command parseCommand(String inputCommand){
        return new Command(inputCommand);
    };
}
