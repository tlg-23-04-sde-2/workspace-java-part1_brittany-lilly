package com.entertainment;

//LAB07.1 DISPLAY TYPE!!
// This provides for exactly 5 instances of DisplayType -- NOT STRINGS
// e.g DisplayType.LED, DisplayType.OLED, etc. -- NO 'new' in Client for these
public enum DisplayType {
    LED,
    OLED,
    PLASMA,
    LCD,
    CRT;
}