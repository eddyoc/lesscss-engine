package com.asual.lesscss;
import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.Task;

public class LessEngineTask extends Task {
	String input;
	String output;	
	LessEngine engine;
	

	public void setInput(String input) {
		this.input = input;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public void execute() {
		this.engine = new LessEngine();
		try {
			if (input == null) {
				this.log("No input file specified. Aborting.");
			}
			if (output == null) {
				output = input.substring(0, input.lastIndexOf(".")) + "css";
			}
			File inputFile = new File(input);
			File outputFile = new File(output);
			
			this.engine.compile(inputFile, outputFile);
		} catch (LessException e) {
			this.log("Error parsing less file");
			e.printStackTrace();
		} catch (IOException e) {
			this.log("Error reading/writing to files");
			e.printStackTrace();
		}
	}
}
