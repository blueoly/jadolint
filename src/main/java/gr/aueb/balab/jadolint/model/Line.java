/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.balab.jadolint.model;

import java.util.List;

import gr.aueb.balab.jadolint.util.JadolintUtils;

/**
 *
 * @author blue
 */
public class Line {
    
    private int lineNumber;
    private String line;
    private String instruction;

    public int getLineNumber() {
        return lineNumber;
    }

    public String getLine() {
        return line;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    
    public Line(String line, int lineNumber){
        this.line = line;
        this.lineNumber = lineNumber;
        
        instruction = JadolintUtils.getInstruction(line);
    }
    
}
