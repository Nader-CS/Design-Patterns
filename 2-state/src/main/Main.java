package main;

import state.Canvas;
import state.BrushTool;
import state.SelectionTool;



public class Main {
    public static void main(String[] args){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
