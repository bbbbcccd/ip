package command;

import java.util.ArrayList;

import exception.InvalidArgumentException;
import exception.LevelHundredException;
import task.Storage;
import task.Task;
import task.TaskList;
import ui.Ui;

public class FindCommand extends UserCommand {
    @Override
    public void execute(String userInput, Ui ui, Storage storage, TaskList taskList) throws LevelHundredException {
        int keywordIdx = userInput.indexOf(" ");
        String keyword = userInput.substring(keywordIdx + 1);
        if (keyword.isEmpty()) {
            ui.printException(new InvalidArgumentException("find", keyword));
            return;
        }
        
        ArrayList<Task> tasks = taskList.filterByKeyword(keyword);
        ui.printMatchingTasks(tasks);
    }
}