package com.java2novice.manager;

import com.java2novice.beans.MyColor;

public class ColorManager {
	
	MyColor color;
	
	public void printColor(){
		this.color.printColor();
	}

	/*public void setColor(MyColor color) {
		this.color = color;
	}*/
	
	
	/**
     * dependency injection through constructor
     * @param myColor
     */
    public ColorManager(MyColor myColor){
        this.color = myColor;
    }
	

}
