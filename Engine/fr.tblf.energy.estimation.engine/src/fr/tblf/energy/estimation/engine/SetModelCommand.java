package fr.tblf.energy.estimation.engine;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import fr.tblf.gemoc.extension.EngineAddon;

public class SetModelCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Opening model... ");
		openModel(Thread.currentThread());
		System.out.println("Done");
		return null;
	}
	
	public static File openModel(Thread thread) {
		Display display = Display.findDisplay(thread);
		Shell shell = new Shell(display);
		
		FileDialog dialog = new FileDialog(shell);
		dialog.setText("Open");
		String[] filterExt = { "*.eel"};
        dialog.setFilterExtensions(filterExt);
        String selected = dialog.open();
        EngineAddon.MODEL = new File(selected);
    	return new File(selected);
	}

}
